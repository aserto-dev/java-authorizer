SHELL              := $(shell which bash)

NO_COLOR           := \033[0m
OK_COLOR           := \033[32;01m
ERR_COLOR          := \033[31;01m
WARN_COLOR         := \033[36;01m
ATTN_COLOR         := \033[33;01m

GOOS               := $(shell go env GOOS)
GOARCH             := $(shell go env GOARCH)
GOPRIVATE          := "github.com/aserto-dev"

EXT_DIR            := ${PWD}/.ext
EXT_BIN_DIR        := ${EXT_DIR}/bin
EXT_TMP_DIR        := ${EXT_DIR}/tmp

VAULT_VER          := 1.8.12
SVU_VER            := 3.2.3
BUF_VER            := 1.52.1
GRPC_GATEWAY       := 2.20.0

PROJECT            := authorizer
BUF_TOKEN          := $(shell vault kv get -field ASERTO_BUF_TOKEN kv/buf.build)
BUF_REPO           := "buf.build/aserto-dev/${PROJECT}"
BUF_LATEST         := $(shell ${EXT_BIN_DIR}/buf registry module label list ${BUF_REPO} --format json | jq -r '.labels[0].name')
BUF_DEV_IMAGE      := "../pb-${PROJECT}/bin/${PROJECT}.bin"

RELEASE_TAG        := $$(${EXT_BIN_DIR}/svu current)
NEXT_VERSION       := $$(svu patch --strip-prefix)

.DEFAULT_GOAL      := buf-generate

.PHONY: deps
deps: info install-vault install-buf install-svu
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"

build:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@mvn --no-transfer-progress clean
	@mvn --no-transfer-progress package

install:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@mvn --no-transfer-progress clean
	@mvn --no-transfer-progress install

test:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"

bump:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@mvn versions:set -DnewVersion=${NEXT_VERSION}

deploy:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@mvn --no-transfer-progress --batch-mode deploy

.PHONY: vault-login
vault-login:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@vault login -method=github token=$$(gh auth token)

.PHONY: buf-login
buf-login:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@echo ${BUF_TOKEN} | ${EXT_BIN_DIR}/buf registry login --token-stdin

.PHONY: buf-generate
buf-generate:
	@echo -e "$(ATTN_COLOR)==> $@ ${BUF_REPO}:${BUF_LATEST}$(NO_COLOR)"
	@${EXT_BIN_DIR}/buf generate ${BUF_REPO}:${BUF_LATEST}
	@${EXT_BIN_DIR}/buf generate buf.build/grpc-ecosystem/grpc-gateway:v${GRPC_GATEWAY}
	
.PHONY: buf-generate-dev
buf-generate-dev:
	@echo -e "$(ATTN_COLOR)==> $@ ${BUF_DEV_IMAGE}$(NO_COLOR)"
	@${EXT_BIN_DIR}/buf generate ${BUF_DEV_IMAGE}

.PHONY: info
info:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@echo "GOOS:          ${GOOS}"
	@echo "GOARCH:        ${GOARCH}"
	@echo "EXT_DIR:       ${EXT_DIR}"
	@echo "EXT_BIN_DIR:   ${EXT_BIN_DIR}"
	@echo "EXT_TMP_DIR:   ${EXT_TMP_DIR}"
	@echo "RELEASE_TAG:   ${RELEASE_TAG}"
	@echo "BUF_REPO:      ${BUF_REPO}"
	@echo "BUF_LATEST:    ${BUF_LATEST}"
	@echo "BUF_DEV_IMAGE: ${BUF_DEV_IMAGE}"
	
.PHONY: install-vault
install-vault: ${EXT_BIN_DIR} ${EXT_TMP_DIR}
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@curl -s -o ${EXT_TMP_DIR}/vault.zip https://releases.hashicorp.com/vault/${VAULT_VER}/vault_${VAULT_VER}_${GOOS}_${GOARCH}.zip
	@unzip -o ${EXT_TMP_DIR}/vault.zip vault -d ${EXT_BIN_DIR}/  &> /dev/null
	@chmod +x ${EXT_BIN_DIR}/vault
	@${EXT_BIN_DIR}/vault --version 

.PHONY: install-buf
install-buf: ${EXT_BIN_DIR}
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@gh release download v${BUF_VER} --repo https://github.com/bufbuild/buf --pattern "buf-$$(uname -s)-$$(uname -m)" --output "${EXT_BIN_DIR}/buf" --clobber
	@chmod +x ${EXT_BIN_DIR}/buf
	@${EXT_BIN_DIR}/buf --version

.PHONY: install-svu
install-svu: ${EXT_BIN_DIR} ${EXT_TMP_DIR}
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@GOBIN=${EXT_BIN_DIR} go install github.com/caarlos0/svu/v3@v${SVU_VER}
	@${EXT_BIN_DIR}/svu --version

.PHONY: clean
clean: clean-gen
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@rm -rf ./.ext
	@rm -rf ./bin

.PHONY: clean-gen
clean-gen:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@mvn clean
	@rm -rf ./src/main/java/com
	@rm -rf ./target

${BIN_DIR}:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@mkdir -p ${BIN_DIR}

${EXT_BIN_DIR}:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@mkdir -p ${EXT_BIN_DIR}

${EXT_TMP_DIR}:
	@echo -e "$(ATTN_COLOR)==> $@ $(NO_COLOR)"
	@mkdir -p ${EXT_TMP_DIR}

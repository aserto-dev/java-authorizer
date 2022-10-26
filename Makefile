SHELL 	   := $(shell which bash)

NO_COLOR   :=\033[0m
OK_COLOR   :=\033[32;01m
ERR_COLOR  :=\033[31;01m
WARN_COLOR :=\033[36;01m
ATTN_COLOR :=\033[33;01m

VERSION    ?= $(shell svu)
COMMIT     ?= $(shell giet rev-parse --short HEAD 2>/dev/null)
DATE       ?= $(shell date "+%FT%T%z")
LATEST 	   := $(shell buf beta registry tag list buf.build/aserto-dev/authorizer --format json --reverse | jq -r '.results | .[0].name')

GEN_DIR    := $(PWD)/gen

${GEN_DIR}:
	@echo -e "${ATTN_COLOR}==> create GEN_DIR ${GEN_DIR} ${NO_COLOR}"
	@mkdir -p ${GEN_DIR}

.PHONY: all
all: deps generate

.PHONY: deps
deps:
	@echo -e "${ATTN_COLOR}==> $@ ${NO_COLOR}"
	@go install github.com/caarlos0/svu@v1.9.0
	@go install github.com/bufbuild/buf/cmd/buf@v1.3.0

.PHONY: generate
generate: $(GEN_DIR) deps
	@echo -e "${ATTN_COLOR}==> $@ VERSION=${LATEST} ${NO_COLOR}"
	@buf generate buf.build/aserto-dev/authorizer:${LATEST}

.PHONY: clean
clean:
	@echo -e "${ATTN_COLOR}==> $@ ${NO_COLOR}"
	@rm -rf ${GEN_DIR}

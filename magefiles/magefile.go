//go:build mage

package main

import (
	"fmt"
	"os"
	"path"
	"path/filepath"

	"github.com/aserto-dev/clui"
	"github.com/aserto-dev/mage-loot/buf"
	"github.com/aserto-dev/mage-loot/deps"
	"github.com/aserto-dev/mage-loot/mage"
	"github.com/magefile/mage/sh"
)

var (
	ui = clui.NewUI()
)

func init() {
	os.Setenv("GO_VERSION", "1.19")
	os.Setenv("GOPRIVATE", "github.com/aserto-dev")
}

func All() error {
	Deps()
	err := Clean()
	if err != nil {
		return err
	}
	err = Generate()
	if err != nil {
		return err
	}
	return Build()
}

// install all required dependencies.
func Deps() {
	deps.GetAllDeps()
}

func Generate() error {
	bufImages := []string{ "buf.build/aserto-dev/authorizer",
		"buf.build/grpc-ecosystem/grpc-gateway" }

	for _, bufImage := range bufImages {
		buffImgWithTag, err := addLatestTag(bufImage)
		if err != nil {
			return err
		}

		err = gen(buffImgWithTag)
		if err != nil {
			return err
		}
	}

	return nil
}

// Generates from a dev build.
func GenerateDev() error {
	err := BuildDev()
	if err != nil {
		return err
	}

	fileSources := filepath.Join(getProtoRepo(), "proto#format=dir")

	return gen(fileSources)
}

// Builds the aserto proto image
func BuildDev() error {
	return mage.RunDirs(path.Join(getProtoRepo(), "magefiles"), getProtoRepo(), mage.AddArg("build"))
}

// Builds the java project
func Build() error {
	err := sh.RunV("mvn", "clean", "package")
	if err != nil {
		return err
	}

	return nil
}

// clean generated files
func Clean() error {
	err := os.RemoveAll(filepath.Join("src", "main", "java", "com"))
	if err != nil {
		return err
	}

	return nil
}

// Builds the aserto proto image
func addLatestTag(bufImage string) (string, error) {
	tag, err := buf.GetLatestTag(bufImage)
	if err != nil {
		return "", err
	} else {
		bufImage = fmt.Sprintf("%s:%s", bufImage, tag.Name)
	}

	return bufImage, nil
}

func getProtoRepo() string {
	protoRepo := os.Getenv("PROTO_REPO")
	if protoRepo == "" {
		protoRepo = "../pb-authorizer"
	}
	return protoRepo
}

func gen(bufImage string) error {
	err := buf.Run(
		buf.AddArg("generate"),
		buf.AddArg("--template"),
		buf.AddArg("buf.gen.yaml"),
		buf.AddArg(bufImage),
	)

	return err
}

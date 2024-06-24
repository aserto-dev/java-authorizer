# java-authorizer

[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)

Generated Java gRPC bindings for the Aserto & Topaz Authorizer Service; these are low-level bindings. 

For a more idiomatic development experience, we advise using the [aserto-java](https://github.com/aserto-dev/aserto-java) and/or [aserto-spring](https://github.com/aserto-dev/aserto-spring) packages.


> **Warning**
>
> **0.20.11** is the latest version published to maven central. Versions starting with 1.0.x have been removed from maven central and are no longer available for download.


## Requirements
- golang 1.22
- [maven](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html)
- java 1.8 or newer

### Building the project
Generate the java bindings from the proto files
```bash
mage generate
```

Build the maven package
```bash
mvn clean package
```

 If you want to install the package to your local maven repository in order to include it in other projects
```bash
mvn clean install
```

### Manually deploying to maven central
```bash
mvn clean deploy -Dgpg.passphrase="<gpg-passphrase>"
```

### Quick start 

See the [examples](https://github.com/aserto-dev/java-authorizer/tree/main/examples) page for a quick start guide on how to connect to [topaz](https://github.com/aserto-dev/topaz) or to Aserto hosted authorizer.

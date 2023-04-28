# java-authorizer

[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)

Java GRPC bindings for aserto-authorizer

> **Warning**
>
> **0.20.5** is the latest version published to maven central. Versions starting with 1.0.z have been removed from maven central and are no longer available for download.


## Requirements
- golang 1.19
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

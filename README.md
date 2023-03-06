# java-authorizer

[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)

Java GRPC bindings for aserto-authorizer


## Requirements
- [buf cli](https://docs.buf.build/installation)
- [maven](https://maven.apache.org/guides/introduction/introduction-to-the-pom.html)
- java 1.8 or newer

### Building the project
```bash
mvn clean && mvn package
```
 If you want to install the package to your local maven repository in order to include it in other projects
```bash
mvn clean && mvn install
```

### Quick start 

See the [examples]([examples](https://github.com/aserto-dev/java-authorizer/tree/main/examples)) page for a quick start guide on how to connect to [topaz](https://github.com/aserto-dev/topaz) or to Aserto hosted authorizer.

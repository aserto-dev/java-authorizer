# java-authorizer-examples
[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)

To switch between topaz and the hosted authorizer examples, just enable/disable the `IS_HOSTED_AUTHORIZER` flag

## Topaz example
### Steps:
1. install [topaz](https://github.com/aserto-dev/topaz#installation)
2. configure topaz with the `todo` policy `topaz configure -d -s -r ghcr.io/aserto-policies/policy-todo-rebac:latest todo`
3. download the directory data `wget https://raw.githubusercontent.com/aserto-dev/topaz/main/pkg/testing/assets/eds-citadel.db -O ~/.config/topaz/db/directory.db`
4. start topaz using `topaz run`
5. Copy `.env.topaz.example` into `.env`
6. build the jar
```bash
mvn clean && mvn package
```
6. run the executable jar
```bash
java -jar target/examples-1.0.0-SNAPSHOT-shaded.jar
```

## Hosted Authorizer example

### Steps

1. Copy `.env.hostedauthorizer.example` into `.env` and fill:
   2. `ASERTO_TENANT_ID` - https://console.aserto.com/ -> Policies -> select the policy you created -> Settings -> Tenant ID
   2. `ASERTO_AUTHORIZER_API_KEY` - https://console.aserto.com/ -> Policies -> select the policy you created -> Settings -> Authorizer API key
2. load data in aserto-directory
   1. go to: https://console.aserto.com/ -> Directory -> Create an identity provider 
   2. create a new connection: Create an identity provider  -> Demo Citadel IDP and provide a name for the connection
3. build the jar
```bash
mvn clean && mvn package
```
4. run the executable jar
```bash
java -jar target/examples-1.0.0-SNAPSHOT-shaded.jar
```

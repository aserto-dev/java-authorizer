# java-grpc-authz
[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)


## Hosted Authorizer example

### Steps
1. create a `policy-peoplefinder-rbac` policy
   1. go to: https://console.aserto.com/ -> Policies -> Create an instance -> From a sample image
   2. select `policy-peoplefinder-rbac`, select a tag (e.g. `latest`) and provide a name for the policy.
2. set the constants in [Example](https://github.com/aserto-dev/java-authorizer/blob/5e5e2fbdc582f4bea53476cb58c7d1ef952b7319/examples/src/main/java/com/aserto/Example.java#L14) class:
   1. `POLICY_NAME` - https://console.aserto.com/ -> Policies -> select the policy you created -> Settings -> Instance Name
   2. `POLICY_LABEL` - https://console.aserto.com/ -> Policies -> select the policy you created -> Settings -> Instance Label
   2. `TENANT_ID` - https://console.aserto.com/ -> Policies -> select the policy you created -> Settings -> Tenant ID
   2. `API_KEY` - https://console.aserto.com/ -> Policies -> select the policy you created -> Settings -> Authorizer API key
3. load data in aserto-directory
   1. go to: https://console.aserto.com/ -> Directory -> Create an identity provider 
   2. create a new connection: Create an identity provider  -> Demo Acmecorp IDP and provide a name for the connection
4. build the jar
```bash
mvn clean && mvn package
```
5. run the executable jar
```bash
java -jar target/examples-1.0.0-SNAPSHOT-shaded.jar
```


## Topaz example

### Requirements
- a local/remote [topaz instance](https://github.com/aserto-dev/topaz)
- an Aserto directory API key (https://console.aserto.com/ -> Connections -> Aserto Directory)
- an Aserto tenant ID (https://console.aserto.com/ -> top right corner -> Account Settings)


### Steps:
1. load data in aserto-directory
   1. go to: https://console.aserto.com/ -> Directory -> Create an identity provider 
   2. create a new connection: Create an identity provider  -> Demo Acmecorp IDP and provide a name for the connection
2. configure topaz (~/.config/topaz/cfg/config.yaml) using the following config, replace <...>
```yaml
---
logging:
  prod: true
  log_level: info

directory_service:
  edge:
    db_path: /db/directory.db
    seed_metadata: false

  remote:
    address: "directory.prod.aserto.com:8443"
    api_key: <DIRECTORY_API_KEY>
    insecure : true
    tenant_id: <YOUR_TENANT_ID>

api:
  grpc:
    connection_timeout_seconds: 2
    listen_address: "0.0.0.0:8282"
    certs:
      tls_key_path: "/certs/grpc.key"
      tls_cert_path: "/certs/grpc.crt"
      tls_ca_cert_path: "/certs/grpc-ca.crt"
  gateway:
    listen_address: "0.0.0.0:8383"
    allowed_origins:
      - https://*.aserto.com
      - https://*aserto-console.netlify.app
    certs:
      tls_key_path: "/certs/gateway.key"
      tls_cert_path: "/certs/gateway.crt"
      tls_ca_cert_path: "/certs/gateway-ca.crt"
  health:
    listen_address: "0.0.0.0:8484"

opa:
  instance_id: example_id
  config:
    services:
      acmecorp:
        url: https://ghcr.io/
        type: "oci"
        response_header_timeout_seconds: 5
    bundles:
      peoplefinder:
        service: acmecorp
        resource: "ghcr.io/aserto-policies/policy-peoplefinder-rbac:latest"
        persist: false
        config:
          polling:
            min_delay_seconds: 60
            max_delay_seconds: 120
```
3. start topaz using `topaz run`
4. build the jar
```bash
mvn clean && mvn package
```
5. run the executable jar
```bash
java -jar target/examples-1.0.0-SNAPSHOT-shaded.jar
```
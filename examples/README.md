# java-authorizer-examples
[![slack](https://img.shields.io/badge/slack-Aserto%20Community-brightgreen)](https://asertocommunity.slack.com)


## 0. prerequisites 

Ensure you are in the `examples` directory.

```bash
cd examples
```

## 1. building the examples

To build the example package, execute the following commands:

```bash
mvn clean && mvn package
```

## 2. setup environment

### Using [topaz](https://topaz.sh)

### 2.1 install and configure [topaz](https://topaz.sh)

* Install [topaz](https://github.com/aserto-dev/topaz#installation)
* Configure topaz to use the `todo` policy

```bash
topaz configure -d -s -r ghcr.io/aserto-policies/policy-todo:v2 todo
```

* Download topaz directory data

```bash
topaz stop 
wget https://raw.githubusercontent.com/aserto-dev/topaz/main/pkg/testing/assets/eds-citadel.db -O ~/.config/topaz/db/directory.db
```

* Start topaz

```bash
topaz start

```

* Validate if topaz is running

```bash
topaz status
```

### 2.2 copy the `examples/assets/.env.topaz-authorizer.example` to the examples directory

```bash
cp assets/.env.topaz-authorizer.example .env
```

### 2.3 update settings in the `examples/.env` file

When using a **local** topaz authorizer, **no** additional configuration settings are needed!

`examples/.env`

```
# policy settings
# ASERTO_POLICY_INSTANCE_NAME=todo
# ASERTO_POLICY_INSTANCE_LABEL=todo

# Topaz
ASERTO_AUTHORIZER_SERVICE_URL=localhost:8282
# ASERTO_TENANT_ID={Tenant ID UUID}
# ASERTO_AUTHORIZER_API_KEY={Authorizer API Key}
```

When connecting to a **remote** topaz authorizer instance, you must update the host and port information in the `.env` file.

`examples/.env` 

```
# policy settings
# ASERTO_POLICY_INSTANCE_NAME=todo
# ASERTO_POLICY_INSTANCE_LABEL=todo

# Topaz
ASERTO_AUTHORIZER_SERVICE_URL={Authorizer host name}:{Authorizer port number}
# ASERTO_TENANT_ID={Tenant ID UUID}
# ASERTO_AUTHORIZER_API_KEY={Authorizer API Key}
```

### Using the hosted [aserto](https://console.aserto.com) authorizer 

### 2.4 signup, create account, log in and configure

* Signup and create an account at [aserto.com](https://aserto.com)

* Log in at [aserto.com](https://console.aserto.com)

* Ensure you are in your personal account; this will have a `todo` policy and accompanying directory instance configured by default, which is used by the example.


### 2.5 copy the `examples/assets/.env.hosted-authorizer.example` to the examples directory

```bash
cp assets/.env.hosted-authorizer.example .env
```

### 2.6 update settings in the `examples/.env` file

When connecting to the **hosted** authorizer, you must update the `.env` file with the following configuration values.


`examples/.env`

```
# policy settings
# ASERTO_POLICY_INSTANCE_NAME=todo
# ASERTO_POLICY_INSTANCE_LABEL=todo

# Topaz
ASERTO_AUTHORIZER_SERVICE_URL=localhost:8282
# ASERTO_TENANT_ID={Tenant ID UUID}
# ASERTO_AUTHORIZER_API_KEY={Authorizer API Key}
```

When connecting to a remote topaz authorizer instance, update the host and port information in the .env file.

`examples/.env` 

```
# policy settings
ASERTO_POLICY_INSTANCE_NAME=todo
ASERTO_POLICY_INSTANCE_LABEL=todo

# Aserto hosted authorizer
ASERTO_AUTHORIZER_SERVICE_URL=authorizer.prod.aserto.com:8443

ASERTO_TENANT_ID={Your Tenant ID UUID}
ASERTO_AUTHORIZER_API_KEY={Your Authorizer API Key}
```

The required information can be located in the [policy settings](https://console.aserto.com/ui/policies/todo/settings) page of the `todo` policy.

Update the `examples/.env` file with the `Tenant ID` and `Authorizer API key` values.


## 3. Running the example

To run the examples, execute:

```bash
java -jar target/examples-1.0.0-SNAPSHOT-shaded.jar
```

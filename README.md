# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AuthControllerApi;

import java.io.File;
import java.util.*;

public class AuthControllerApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure HTTP basic authorization: BasicAuth
        HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
        BasicAuth.setUsername("YOUR USERNAME");
        BasicAuth.setPassword("YOUR PASSWORD");

        AuthControllerApi apiInstance = new AuthControllerApi();
        String grantType = "grantType_example"; // String | 
        String password = "password_example"; // String | 
        String username = "username_example"; // String | 
        try {
            AuthResp result = apiInstance.saqueepagueOauthTokenPost(grantType, password, username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthControllerApi#saqueepagueOauthTokenPost");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://127.0.0.1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthControllerApi* | [**saqueepagueOauthTokenPost**](docs/AuthControllerApi.md#saqueepagueOauthTokenPost) | **POST** /saqueepague/oauth/token | Retorna o token de autenticação do serviço.
*HealthCheckControllerApi* | [**actuatorHealthGet**](docs/HealthCheckControllerApi.md#actuatorHealthGet) | **GET** /actuator/health | Retorna o estado do serviço.
*SondaApiControllerApi* | [**saqueepagueSondaPost**](docs/SondaApiControllerApi.md#saqueepagueSondaPost) | **POST** /saqueepague/sonda | Retorna o estado de uma transação.

## Documentation for Models

 - [AuthRep](docs/AuthRep.md)
 - [AuthResp](docs/AuthResp.md)
 - [SondaReq](docs/SondaReq.md)
 - [SondaReqInfTransacao](docs/SondaReqInfTransacao.md)
 - [SondaReqTerminal](docs/SondaReqTerminal.md)
 - [SondaResp](docs/SondaResp.md)
 - [SondaRespInfTransacao](docs/SondaRespInfTransacao.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### BasicAuth

- **Type**: HTTP basic authentication

### OAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://127.0.0.1:3939/saqueepague/oauth
- **Scopes**: 
  - : 


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



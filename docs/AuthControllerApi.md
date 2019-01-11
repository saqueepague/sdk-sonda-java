# AuthControllerApi

All URIs are relative to *https://127.0.0.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saqueepagueOauthTokenPost**](AuthControllerApi.md#saqueepagueOauthTokenPost) | **POST** /saqueepague/oauth/token | Retorna o token de autenticação do serviço.

<a name="saqueepagueOauthTokenPost"></a>
# **saqueepagueOauthTokenPost**
> AuthResp saqueepagueOauthTokenPost(grantType, password, username)

Retorna o token de autenticação do serviço.

Autentica o usuário e gera um token para a requisição de sonda.

### Example
```java
// Import classes:
//import br.com.saqueepague.ApiClient;
//import br.com.saqueepague.ApiException;
//import br.com.saqueepague.Configuration;
//import br.com.saqueepague.auth.*;
//import br.com.saqueepague.sonda.AuthControllerApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**|  | [optional] [enum: password]
 **password** | **String**|  | [optional]
 **username** | **String**|  | [optional]

### Return type

[**AuthResp**](AuthResp.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


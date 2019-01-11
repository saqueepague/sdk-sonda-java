# SondaApiControllerApi

All URIs are relative to *https://127.0.0.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**saqueepagueSondaPost**](SondaApiControllerApi.md#saqueepagueSondaPost) | **POST** /saqueepague/sonda | Retorna o estado de uma transação.

<a name="saqueepagueSondaPost"></a>
# **saqueepagueSondaPost**
> SondaResp saqueepagueSondaPost(body)

Retorna o estado de uma transação.

Procura o último estado conhecido de uma transação específica dos últimos 7 dias (casos que a sonda pode tentar verificar em finais de semana ou feriado).

### Example
```java
// Import classes:
//import br.com.saqueepague.ApiClient;
//import br.com.saqueepague.ApiException;
//import br.com.saqueepague.Configuration;
//import br.com.saqueepague.auth.*;
//import br.com.saqueepague.sonda.SondaApiControllerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

SondaApiControllerApi apiInstance = new SondaApiControllerApi();
SondaReq body = new SondaReq(); // SondaReq | Objeto com dados de procura da transação.
try {
    SondaResp result = apiInstance.saqueepagueSondaPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SondaApiControllerApi#saqueepagueSondaPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SondaReq**](SondaReq.md)| Objeto com dados de procura da transação. |

### Return type

[**SondaResp**](SondaResp.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


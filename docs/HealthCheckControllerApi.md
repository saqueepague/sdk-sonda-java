# HealthCheckControllerApi

All URIs are relative to *https://127.0.0.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actuatorHealthGet**](HealthCheckControllerApi.md#actuatorHealthGet) | **GET** /actuator/health | Retorna o estado do serviço.

<a name="actuatorHealthGet"></a>
# **actuatorHealthGet**
> Map&lt;String, String&gt; actuatorHealthGet()

Retorna o estado do serviço.

Verifica a disponibilidade do serviço de sonda.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthCheckControllerApi;


HealthCheckControllerApi apiInstance = new HealthCheckControllerApi();
try {
    Map<String, String> result = apiInstance.actuatorHealthGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthCheckControllerApi#actuatorHealthGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*


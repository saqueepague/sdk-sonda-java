/*
 * Saque e Pague Sonda
 * Modelo de API para o serviço de sonda da Saque e Pague. Parceiro pode requisitar o último estado de uma transação (cancelada, confirmada ou pendente) através das chamadas desta API. Caso não encontre a transação, o serviço retorna o estado pendente.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HealthCheckControllerApi
 */
@Ignore
public class HealthCheckControllerApiTest {

    private final HealthCheckControllerApi api = new HealthCheckControllerApi();

    /**
     * Retorna o estado do serviço.
     *
     * Verifica a disponibilidade do serviço de sonda.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void actuatorHealthGetTest() throws ApiException {
        Map<String, String> response = api.actuatorHealthGet();

        // TODO: test validations
    }
}

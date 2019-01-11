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

package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Objeto de requisição de autenticação.
 */
@Schema(description = "Objeto de requisição de autenticação.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-01-11T15:47:10.474Z[GMT]")public class AuthRep {
  /**
   * Constante passada para este tipo de autenticação: password.
   */
  @JsonAdapter(GrantTypeEnum.Adapter.class)
  public enum GrantTypeEnum {
    PASSWORD("password");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static GrantTypeEnum fromValue(String text) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<GrantTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GrantTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GrantTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return GrantTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("grant_type")
  private GrantTypeEnum grantType = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("username")
  private String username = null;
  public AuthRep grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  

  /**
  * Constante passada para este tipo de autenticação: password.
  * @return grantType
  **/
  @Schema(required = true, description = "Constante passada para este tipo de autenticação: password.")
  public GrantTypeEnum getGrantType() {
    return grantType;
  }
  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }
  public AuthRep password(String password) {
    this.password = password;
    return this;
  }

  

  /**
  * Senha disponibilizada pela SEP.
  * @return password
  **/
  @Schema(example = "homolog", required = true, description = "Senha disponibilizada pela SEP.")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public AuthRep username(String username) {
    this.username = username;
    return this;
  }

  

  /**
  * Usuário disponibilizado pela SEP.
  * @return username
  **/
  @Schema(example = "homolog", required = true, description = "Usuário disponibilizado pela SEP.")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthRep authRep = (AuthRep) o;
    return Objects.equals(this.grantType, authRep.grantType) &&
        Objects.equals(this.password, authRep.password) &&
        Objects.equals(this.username, authRep.username);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(grantType, password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRep {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

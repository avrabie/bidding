package xyz.optimized.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProductProductStartingPrice
 */

@JsonTypeName("Product_product_starting_price")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-18T20:27:08.112715361+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ProductProductStartingPrice {

  private Optional<Integer> amount = Optional.empty();

  private Optional<String> currency = Optional.empty();

  public ProductProductStartingPrice amount(Integer amount) {
    this.amount = Optional.of(amount);
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  
  @Schema(name = "amount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public Optional<Integer> getAmount() {
    return amount;
  }

  public void setAmount(Optional<Integer> amount) {
    this.amount = amount;
  }

  public ProductProductStartingPrice currency(String currency) {
    this.currency = Optional.of(currency);
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  public void setCurrency(Optional<String> currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductProductStartingPrice productProductStartingPrice = (ProductProductStartingPrice) o;
    return Objects.equals(this.amount, productProductStartingPrice.amount) &&
        Objects.equals(this.currency, productProductStartingPrice.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductProductStartingPrice {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


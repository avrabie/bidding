package xyz.optimized.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import xyz.optimized.model.ProductProductCurrentBidBidder;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProductProductCurrentBid
 */

@JsonTypeName("Product_product_current_bid")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-18T20:27:08.112715361+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ProductProductCurrentBid {

  private Optional<Integer> amount = Optional.empty();

  private Optional<String> currency = Optional.empty();

  private Optional<ProductProductCurrentBidBidder> bidder = Optional.empty();

  public ProductProductCurrentBid amount(Integer amount) {
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

  public ProductProductCurrentBid currency(String currency) {
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

  public ProductProductCurrentBid bidder(ProductProductCurrentBidBidder bidder) {
    this.bidder = Optional.of(bidder);
    return this;
  }

  /**
   * Get bidder
   * @return bidder
   */
  @Valid 
  @Schema(name = "bidder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bidder")
  public Optional<ProductProductCurrentBidBidder> getBidder() {
    return bidder;
  }

  public void setBidder(Optional<ProductProductCurrentBidBidder> bidder) {
    this.bidder = bidder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductProductCurrentBid productProductCurrentBid = (ProductProductCurrentBid) o;
    return Objects.equals(this.amount, productProductCurrentBid.amount) &&
        Objects.equals(this.currency, productProductCurrentBid.currency) &&
        Objects.equals(this.bidder, productProductCurrentBid.bidder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, bidder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductProductCurrentBid {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    bidder: ").append(toIndentedString(bidder)).append("\n");
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


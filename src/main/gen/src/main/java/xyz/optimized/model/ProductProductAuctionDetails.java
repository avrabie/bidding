package xyz.optimized.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProductProductAuctionDetails
 */

@JsonTypeName("Product_product_auction_details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-18T20:56:46.968121808+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ProductProductAuctionDetails {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Optional<OffsetDateTime> startTime = Optional.empty();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Optional<OffsetDateTime> endTime = Optional.empty();

  private Optional<String> status = Optional.empty();

  public ProductProductAuctionDetails startTime(OffsetDateTime startTime) {
    this.startTime = Optional.of(startTime);
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  @Valid 
  @Schema(name = "start_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public Optional<OffsetDateTime> getStartTime() {
    return startTime;
  }

  public void setStartTime(Optional<OffsetDateTime> startTime) {
    this.startTime = startTime;
  }

  public ProductProductAuctionDetails endTime(OffsetDateTime endTime) {
    this.endTime = Optional.of(endTime);
    return this;
  }

  /**
   * Get endTime
   * @return endTime
   */
  @Valid 
  @Schema(name = "end_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public Optional<OffsetDateTime> getEndTime() {
    return endTime;
  }

  public void setEndTime(Optional<OffsetDateTime> endTime) {
    this.endTime = endTime;
  }

  public ProductProductAuctionDetails status(String status) {
    this.status = Optional.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
   */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  public void setStatus(Optional<String> status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductProductAuctionDetails productProductAuctionDetails = (ProductProductAuctionDetails) o;
    return Objects.equals(this.startTime, productProductAuctionDetails.startTime) &&
        Objects.equals(this.endTime, productProductAuctionDetails.endTime) &&
        Objects.equals(this.status, productProductAuctionDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductProductAuctionDetails {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


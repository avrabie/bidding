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
 * ProductProductSeller
 */

@JsonTypeName("Product_product_seller")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-18T20:27:08.112715361+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ProductProductSeller {

  private Optional<Integer> id = Optional.empty();

  private Optional<String> name = Optional.empty();

  private Optional<Double> rating = Optional.empty();

  private Optional<String> location = Optional.empty();

  public ProductProductSeller id(Integer id) {
    this.id = Optional.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
  }

  public void setId(Optional<Integer> id) {
    this.id = id;
  }

  public ProductProductSeller name(String name) {
    this.name = Optional.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  public void setName(Optional<String> name) {
    this.name = name;
  }

  public ProductProductSeller rating(Double rating) {
    this.rating = Optional.of(rating);
    return this;
  }

  /**
   * Get rating
   * @return rating
   */
  
  @Schema(name = "rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating")
  public Optional<Double> getRating() {
    return rating;
  }

  public void setRating(Optional<Double> rating) {
    this.rating = rating;
  }

  public ProductProductSeller location(String location) {
    this.location = Optional.of(location);
    return this;
  }

  /**
   * Get location
   * @return location
   */
  
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public Optional<String> getLocation() {
    return location;
  }

  public void setLocation(Optional<String> location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductProductSeller productProductSeller = (ProductProductSeller) o;
    return Objects.equals(this.id, productProductSeller.id) &&
        Objects.equals(this.name, productProductSeller.name) &&
        Objects.equals(this.rating, productProductSeller.rating) &&
        Objects.equals(this.location, productProductSeller.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, rating, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductProductSeller {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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


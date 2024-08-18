package xyz.optimized.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xyz.optimized.model.ProductProductAuctionDetails;
import xyz.optimized.model.ProductProductCurrentBid;
import xyz.optimized.model.ProductProductSeller;
import xyz.optimized.model.ProductProductStartingPrice;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProductProduct
 */

@JsonTypeName("Product_product")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-18T20:27:08.112715361+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class ProductProduct {

  private Optional<Integer> id = Optional.empty();

  private Optional<String> name = Optional.empty();

  private Optional<String> description = Optional.empty();

  private Optional<String> category = Optional.empty();

  private Optional<ProductProductStartingPrice> startingPrice = Optional.empty();

  private Optional<ProductProductCurrentBid> currentBid = Optional.empty();

  private Optional<ProductProductStartingPrice> buyNowPrice = Optional.empty();

  private Optional<Integer> minimumIncrement = Optional.empty();

  @Valid
  private List<String> imageUrls = new ArrayList<>();

  private Optional<ProductProductSeller> seller = Optional.empty();

  private Optional<ProductProductAuctionDetails> auctionDetails = Optional.empty();

  public ProductProduct id(Integer id) {
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

  public ProductProduct name(String name) {
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

  public ProductProduct description(String description) {
    this.description = Optional.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  public void setDescription(Optional<String> description) {
    this.description = description;
  }

  public ProductProduct category(String category) {
    this.category = Optional.of(category);
    return this;
  }

  /**
   * Get category
   * @return category
   */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public Optional<String> getCategory() {
    return category;
  }

  public void setCategory(Optional<String> category) {
    this.category = category;
  }

  public ProductProduct startingPrice(ProductProductStartingPrice startingPrice) {
    this.startingPrice = Optional.of(startingPrice);
    return this;
  }

  /**
   * Get startingPrice
   * @return startingPrice
   */
  @Valid 
  @Schema(name = "starting_price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("starting_price")
  public Optional<ProductProductStartingPrice> getStartingPrice() {
    return startingPrice;
  }

  public void setStartingPrice(Optional<ProductProductStartingPrice> startingPrice) {
    this.startingPrice = startingPrice;
  }

  public ProductProduct currentBid(ProductProductCurrentBid currentBid) {
    this.currentBid = Optional.of(currentBid);
    return this;
  }

  /**
   * Get currentBid
   * @return currentBid
   */
  @Valid 
  @Schema(name = "current_bid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_bid")
  public Optional<ProductProductCurrentBid> getCurrentBid() {
    return currentBid;
  }

  public void setCurrentBid(Optional<ProductProductCurrentBid> currentBid) {
    this.currentBid = currentBid;
  }

  public ProductProduct buyNowPrice(ProductProductStartingPrice buyNowPrice) {
    this.buyNowPrice = Optional.of(buyNowPrice);
    return this;
  }

  /**
   * Get buyNowPrice
   * @return buyNowPrice
   */
  @Valid 
  @Schema(name = "buy_now_price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buy_now_price")
  public Optional<ProductProductStartingPrice> getBuyNowPrice() {
    return buyNowPrice;
  }

  public void setBuyNowPrice(Optional<ProductProductStartingPrice> buyNowPrice) {
    this.buyNowPrice = buyNowPrice;
  }

  public ProductProduct minimumIncrement(Integer minimumIncrement) {
    this.minimumIncrement = Optional.of(minimumIncrement);
    return this;
  }

  /**
   * Get minimumIncrement
   * @return minimumIncrement
   */
  
  @Schema(name = "minimum_increment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimum_increment")
  public Optional<Integer> getMinimumIncrement() {
    return minimumIncrement;
  }

  public void setMinimumIncrement(Optional<Integer> minimumIncrement) {
    this.minimumIncrement = minimumIncrement;
  }

  public ProductProduct imageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public ProductProduct addImageUrlsItem(String imageUrlsItem) {
    if (this.imageUrls == null) {
      this.imageUrls = new ArrayList<>();
    }
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

  /**
   * Get imageUrls
   * @return imageUrls
   */
  
  @Schema(name = "image_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_urls")
  public List<String> getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }

  public ProductProduct seller(ProductProductSeller seller) {
    this.seller = Optional.of(seller);
    return this;
  }

  /**
   * Get seller
   * @return seller
   */
  @Valid 
  @Schema(name = "seller", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seller")
  public Optional<ProductProductSeller> getSeller() {
    return seller;
  }

  public void setSeller(Optional<ProductProductSeller> seller) {
    this.seller = seller;
  }

  public ProductProduct auctionDetails(ProductProductAuctionDetails auctionDetails) {
    this.auctionDetails = Optional.of(auctionDetails);
    return this;
  }

  /**
   * Get auctionDetails
   * @return auctionDetails
   */
  @Valid 
  @Schema(name = "auction_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auction_details")
  public Optional<ProductProductAuctionDetails> getAuctionDetails() {
    return auctionDetails;
  }

  public void setAuctionDetails(Optional<ProductProductAuctionDetails> auctionDetails) {
    this.auctionDetails = auctionDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductProduct productProduct = (ProductProduct) o;
    return Objects.equals(this.id, productProduct.id) &&
        Objects.equals(this.name, productProduct.name) &&
        Objects.equals(this.description, productProduct.description) &&
        Objects.equals(this.category, productProduct.category) &&
        Objects.equals(this.startingPrice, productProduct.startingPrice) &&
        Objects.equals(this.currentBid, productProduct.currentBid) &&
        Objects.equals(this.buyNowPrice, productProduct.buyNowPrice) &&
        Objects.equals(this.minimumIncrement, productProduct.minimumIncrement) &&
        Objects.equals(this.imageUrls, productProduct.imageUrls) &&
        Objects.equals(this.seller, productProduct.seller) &&
        Objects.equals(this.auctionDetails, productProduct.auctionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, category, startingPrice, currentBid, buyNowPrice, minimumIncrement, imageUrls, seller, auctionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductProduct {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    startingPrice: ").append(toIndentedString(startingPrice)).append("\n");
    sb.append("    currentBid: ").append(toIndentedString(currentBid)).append("\n");
    sb.append("    buyNowPrice: ").append(toIndentedString(buyNowPrice)).append("\n");
    sb.append("    minimumIncrement: ").append(toIndentedString(minimumIncrement)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    auctionDetails: ").append(toIndentedString(auctionDetails)).append("\n");
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


package br.com.devencer.update.core.domain.entity;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

public class Product implements Comparable<Product> {
  private final int id;

  private final String barcode;
  private String description;
  private BigDecimal price;

  public Product(int id, String barcode, String description, BigDecimal price) {
    this.id = id;
    this.barcode = barcode;
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public int getId() {
    return id;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public int compareTo(Product anotherProduct) {
    if (anotherProduct.toString() == ""){
      return -1;
    }
    //if this == anotherProduct return 0
    //if this > anotherProduct return 1
    //if this < anotherProduct return -1
    int compareResult = barcode.compareTo(anotherProduct.getBarcode());

    if (compareResult == 0) {
      return this.price.compareTo(anotherProduct.getPrice());
    }else{
      return compareResult;
    }
  }
  @Override
  public String toString() {
    return barcode+price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Product product = (Product) o;

    if (!Objects.equals(barcode, product.getBarcode())) {
      return false;
    }
    return Objects.equals(price, product.getPrice());
  }



  @Override
  public int hashCode() {
    int result = barcode != null ? barcode.hashCode() : 0;
    result = 31 * result + (price != null ? price.hashCode() : 0);
    return result;
  }
}

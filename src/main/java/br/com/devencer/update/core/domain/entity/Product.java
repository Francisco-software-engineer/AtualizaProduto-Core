package br.com.devencer.update.core.domain.entity;

import java.math.BigDecimal;

public class Product {
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

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}

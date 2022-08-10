package br.com.devencer.update.core.domain.entity;

import br.com.devencer.update.core.domain.rules.ProductRules;
import java.math.BigDecimal;

public class Product implements Comparable<Product> {
  private final int id;
  private final String barcode;
  private String description;
  private BigDecimal price;
  private Rule rules;

  public Product(int id, String barcode, String description, BigDecimal price) {
    rules = ProductRules.DEFAULT.getRule();
    this.id = id;
    this.barcode = barcode;
    this.description = description;
    this.price = price;
  }

  public Product(Rule rules, int id, String barcode, String description, BigDecimal price) {
    this.rules = rules;
    this.id = id;
    this.barcode = barcode;
    this.description = description;
    this.price = price;
  }

  public void setRule(Rule rules) {
    this.rules = rules;
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
    return rules.compareTo(this, anotherProduct);
  }
  @Override
  public String toString() {
    return rules.toString(this);
  }

  @Override
  public boolean equals(Object o) {
    return rules.equals(this, (Product)o);
  }

  @Override
  public int hashCode() {
    return rules.hashCode(this);
  }
}

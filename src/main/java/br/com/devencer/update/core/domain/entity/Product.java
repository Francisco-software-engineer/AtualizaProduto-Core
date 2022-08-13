package br.com.devencer.update.core.domain.entity;

import br.com.devencer.update.core.domain.rules.Product_Rules;
import java.io.Serializable;
import java.math.BigDecimal;

<<<<<<< HEAD
public class Product {
  private int id;

  private String barcode;
=======
public class Product implements Comparable<Product>, Serializable {
  private final int id;
  private final String barcode;
>>>>>>> feature/filter-updatelist
  private String description;
  private BigDecimal price;
  private Rule rules;

  public Product(int id, String barcode, String description, BigDecimal price) {
<<<<<<< HEAD
=======
    rules = Product_Rules.DEFAULT.getRule();
>>>>>>> feature/filter-updatelist
    this.id = id;
    this.barcode = barcode;
    this.description = description;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public String getBarcode() {
    return barcode;
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

  public Rule getRules() {
    return rules;
  }

  public void setRules(Rule rules) {
    this.rules = rules;
  }

  @Override
  public int compareTo(Product anotherProduct) {
    return rules.compareTo(this, anotherProduct);
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

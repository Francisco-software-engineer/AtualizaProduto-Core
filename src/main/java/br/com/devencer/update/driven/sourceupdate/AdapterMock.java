package br.com.devencer.update.driven.sourceupdate;

import br.com.devencer.update.core.domain.entity.Product;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class AdapterMock implements UpdateData{
  private List<Product> products = Arrays.asList(new Product("asdf", new BigDecimal(13.3)),
      new Product("", new BigDecimal(150)));

  @Override
  public List<Product> getData() {
    return products;
  }
}

package br.com.devencer.update.driven.sourceupdate;

import br.com.devencer.update.core.domain.entity.Product;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class AdapterCollector implements UpdateData{
  List<Product> products = Arrays.asList(new Product("Feijao JJ", BigDecimal.valueOf(13.3)));


  @Override
  public List<Product> getData() {
    return null;
  }
}

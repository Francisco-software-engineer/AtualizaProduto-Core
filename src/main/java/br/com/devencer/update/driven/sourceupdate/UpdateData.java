package br.com.devencer.update.driven.sourceupdate;

import br.com.devencer.update.core.domain.entity.Product;
import java.util.List;

public interface UpdateData {
  public List<Product> getProductList();
  public boolean isEmpty();

}

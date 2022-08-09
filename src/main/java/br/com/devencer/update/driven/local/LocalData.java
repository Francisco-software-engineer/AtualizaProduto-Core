package br.com.devencer.update.driven.local;

import br.com.devencer.update.core.domain.entity.Product;
import br.com.devencer.update.driven.sourceupdate.UpdateData;
import java.util.List;

public interface LocalData {
  List<Product> getProductList();

}

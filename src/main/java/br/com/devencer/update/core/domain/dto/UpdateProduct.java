package br.com.devencer.update.core.domain.dto;

import br.com.devencer.update.core.domain.entity.Product;
import br.com.devencer.update.core.domain.filters.UpdateProductList;
import br.com.devencer.update.driven.local.AdapterLocalMock;
import br.com.devencer.update.driven.local.LocalData;
import br.com.devencer.update.driven.sourceupdate.AdapterUpdateMock;
import br.com.devencer.update.driven.sourceupdate.UpdateData;
import java.util.List;

public class UpdateProduct {
  private LocalData localData;
  private UpdateData updateData;
  public UpdateProduct() {
    localData = new AdapterLocalMock();
    updateData = new AdapterUpdateMock();
  }

  public void update() {

  }

  private List<Product> getUpdateProductList() {
    return new UpdateProductList(updateData, localData).getList();
  }


}

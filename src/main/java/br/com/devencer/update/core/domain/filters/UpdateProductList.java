package br.com.devencer.update.core.domain.filters;

import static br.com.devencer.update.core.domain.error.Error.emptyUpdateTable;

import br.com.devencer.update.core.domain.entity.Product;
import br.com.devencer.update.driven.local.LocalData;
import br.com.devencer.update.driven.sourceupdate.UpdateData;
import java.util.List;

public class UpdateProductList {
  private final UpdateData allDataFromExternalSource;
  private final LocalData allDataFromLocalSource;

  public List<Product> getList() {
    error();

    return null;
  }

  public UpdateProductList(UpdateData allDataFromExternalSource, LocalData allDataFromLocalSource) {
    this.allDataFromExternalSource = allDataFromExternalSource;
    this.allDataFromLocalSource = allDataFromLocalSource;
  }

  private boolean error() {
    if (allDataFromExternalSource.isEmpty()) {
      //"Error: Empty update table - Nothing to update."
      emptyUpdateTable("Error: Empty update table");
      return true;
    }

    return false;
  }

}

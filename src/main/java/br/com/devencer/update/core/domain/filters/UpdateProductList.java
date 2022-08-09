package br.com.devencer.update.core.domain.filters;

import static br.com.devencer.update.core.domain.error.Error.*;

import br.com.devencer.update.core.domain.entity.Product;
import br.com.devencer.update.driven.local.LocalData;
import br.com.devencer.update.driven.sourceupdate.UpdateData;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UpdateProductList {
  private List<Product> allDataFromExternalSource;
  private List<Product> allDataFromLocalSource;

  public List<Product> getList() {
    error();
    return null;
  }

  public UpdateProductList(UpdateData externalSource, LocalData localSource) {
    allDataFromExternalSource = externalSource.getProductList();
    allDataFromLocalSource = localSource.getProductList();

    allDataFromExternalSource.retainAll(allDataFromLocalSource);

    Collections.sort(allDataFromExternalSource);
    //allDataFromExternalSource = allDataFromExternalSource.stream().sorted().collect(Collectors.toList());
    Collections.sort(allDataFromLocalSource);
    //allDataFromLocalSource = allDataFromLocalSource.stream().sorted().collect(Collectors.toList());

  }

  private boolean error() {
    if (allDataFromExternalSource.isEmpty()) {
      //"Error: Empty update table - Nothing to update."
      emptyUpdateTable("Error: Empty update table");
      return true;
    }

    System.out.println(allDataFromLocalSource.toString());

    if (allDataFromLocalSource.toString().equals(allDataFromExternalSource.toString())) {
      //"Error: Content Equals - Nothing to update."
      contentEquals("Error: Content Equals");
      return true;
    }

    return false;
  }

}

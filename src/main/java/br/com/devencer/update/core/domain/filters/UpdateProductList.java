package br.com.devencer.update.core.domain.filters;

import static br.com.devencer.update.core.domain.error.Error.*;

import br.com.devencer.update.core.domain.entity.Product;
import br.com.devencer.update.driven.local.LocalData;
import br.com.devencer.update.driven.sourceupdate.UpdateData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpdateProductList {
  private List<Product> allDataFromExternalSource = new ArrayList<>();
  private List<Product> allDataFromLocalSource = new ArrayList<>();

  private List<Product> returnList;

  public List<Product> getList() {
    error();
    return null;
  }

  public UpdateProductList(UpdateData externalSource, LocalData localSource) {
    allDataFromExternalSource.addAll(externalSource.getProductList());
    allDataFromLocalSource.addAll(localSource.getProductList());

    //remove all content that is equal and is not necessary any update
    allDataFromExternalSource.removeAll(allDataFromLocalSource);

    System.out.println("external "+allDataFromExternalSource.size());
    System.out.println("local "+allDataFromLocalSource.size());
    allDataFromExternalSource.forEach(System.out::println);

  }

  private boolean error() {
    if (allDataFromExternalSource.isEmpty()) {
      //"Error: Empty update table - Nothing to update."
      emptyUpdateTable("Error: Empty source/update table");
      return true;
    }
    return false;
  }

}

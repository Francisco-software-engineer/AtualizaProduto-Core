package br.com.devencer.update.core.domain.filters;

import br.com.devencer.update.driven.local.LocalData;
import br.com.devencer.update.driven.sourceupdate.UpdateData;

public class UpdateList {
  private UpdateData allDataFromExternalSource;
  private LocalData allDataFromLocalSource;

  public UpdateList(UpdateData allDataFromExternalSource, LocalData allDataFromLocalSource) {
    this.allDataFromExternalSource = allDataFromExternalSource;
    this.allDataFromLocalSource = allDataFromLocalSource;

  }

}

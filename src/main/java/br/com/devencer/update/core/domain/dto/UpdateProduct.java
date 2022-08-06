package br.com.devencer.update.core.domain.dto;

import br.com.devencer.update.driven.local.AdapterLocalMock;
import br.com.devencer.update.driven.local.LocalData;
import br.com.devencer.update.driven.sourceupdate.AdapterUpdateMock;
import br.com.devencer.update.driven.sourceupdate.UpdateData;

public class UpdateProduct {
  private LocalData localData = new AdapterLocalMock();
  private UpdateData updateData = new AdapterUpdateMock();

  public UpdateProduct() {

  }

  public void update() {

  }


}

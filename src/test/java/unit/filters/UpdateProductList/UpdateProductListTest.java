package unit.filters.UpdateProductList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import br.com.devencer.update.core.domain.entity.Product;
import br.com.devencer.update.core.domain.error.CoreError;
import br.com.devencer.update.core.domain.filters.UpdateProductList;
import br.com.devencer.update.driven.local.AdapterLocalMock;
import br.com.devencer.update.driven.local.LocalData;
import br.com.devencer.update.driven.sourceupdate.AdapterUpdateMock;
import br.com.devencer.update.driven.sourceupdate.UpdateData;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Update Filter accuracy test")
public class UpdateProductListTest {
  List<Product> localProductList = Arrays.asList(
      new Product(1, "7891008121025","CAIXA DE BOMBOM GAROTO 400G", new BigDecimal(6.99)),
      new Product(2, "7891000140307","LEITE EM PO INTEGRAL NINHO 400G", new BigDecimal(13.99)),
      new Product(3, "7891000064276","MUCILON ARROZ NESTLE 400G", new BigDecimal(7.99)),
      new Product(4, "7898461320323","ARROZ DOURA TIPO 1 COM 5 KG", new BigDecimal(11.5)));
  List<Product> updateProductList = Arrays.asList();

  @BeforeEach
  void load() {
    LocalData localData = new AdapterLocalMock(localProductList);
    UpdateData updateData = new AdapterUpdateMock(updateProductList);
    //UpdateProductList updateList = ;

  }

  @Test
  @DisplayName("Error: Empty update table - Nothing to update.")
  void emptyUpdateTable() {
    try {
      new UpdateProductList(updateData, localData);
      fail("Error: Empty update table - Nothing to update.");
    } catch (CoreError e) {
      assertEquals(e.getMessage(), "Valor da transferência é obrigatório.");
      System.out.println(e.getMessage());
    }
  }


}

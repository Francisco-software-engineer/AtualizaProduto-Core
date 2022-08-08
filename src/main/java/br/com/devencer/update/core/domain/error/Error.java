package br.com.devencer.update.core.domain.error;

public class Error {
  public static void emptyUpdateTable(String param) {
    //"Error: Empty update table - Nothing to update."
    throw new CoreError(param + " - Nothing to update.");
  }

}

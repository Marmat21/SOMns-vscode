package som.langserv;

import org.eclipse.lsp4j.DocumentSymbol;


public class Matcher {
  public static boolean fuzzyMatch(final DocumentSymbol symbol, final String query) {
    return fuzzyMatch(symbol.getName(), query);
  }

  public static boolean fuzzyMatch(final String string, final String query) {
    if (query == null) {
      return true;
    }

    // simple prefix
    if (string.startsWith(query)) {
      return true;
    }

    // trivial case
    if (query.equals(string)) {
      return true;
    }

    // TODO: camel case matching etc...
    return false;
  }
}

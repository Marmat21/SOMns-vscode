package som.langserv.structure;

import java.util.List;

import org.eclipse.lsp4j.DocumentSymbol;
import org.eclipse.lsp4j.Hover;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.SignatureHelp;
import org.eclipse.lsp4j.SignatureHelpContext;
import org.eclipse.lsp4j.SymbolInformation;


public interface DocumentData {
  List<? extends DocumentSymbol> getRootSymbols();

  Hover getHover(Position position);

  SignatureHelp getSignatureHelp(Position position, SignatureHelpContext context);

  void symbols(List<SymbolInformation> results, String query);
}

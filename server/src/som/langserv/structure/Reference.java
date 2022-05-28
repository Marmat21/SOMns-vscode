package som.langserv.structure;

import org.eclipse.lsp4j.DocumentHighlight;
import org.eclipse.lsp4j.DocumentHighlightKind;
import org.eclipse.lsp4j.Range;


public class Reference implements WithRange {

  public final LanguageElementId id;

  private final Range range;

  private boolean isWrite;
  private boolean isRead;

  public Reference(final LanguageElementId id, final Range range) {
    this.id = id;
    this.range = range;
  }

  @Override
  public LanguageElementId getId() {
    return id;
  }

  public void markAsRead() {
    isRead = true;
  }

  public void markAsWrite() {
    isWrite = true;
  }

  @Override
  public Range getRange() {
    return range;
  }

  public DocumentHighlight createHighlight() {
    DocumentHighlight highlight = new DocumentHighlight();
    highlight.setRange(range);
    highlight.setKind(getHighlightkind());
    return highlight;
  }

  public DocumentHighlightKind getHighlightkind() {
    if (isWrite) {
      return DocumentHighlightKind.Write;
    }

    if (isRead) {
      return DocumentHighlightKind.Read;
    }

    return DocumentHighlightKind.Text;
  }
}

/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package io.typefox.lsapi;

import io.typefox.lsapi.CompletionItem;
import io.typefox.lsapi.TextEditImpl;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * The Completion request is sent from the client to the server to compute completion items at a given cursor position.
 * Completion items are presented in the IntelliSense user interface. If computing complete completion items is expensive
 * servers can additional provide a handler for the resolve completion item request. This request is send when a
 * completion item is selected in the user interface.
 */
@SuppressWarnings("all")
public class CompletionItemImpl implements CompletionItem {
  /**
   * The label of this completion item. By default also the text that is inserted when selecting this completion.
   */
  private String label;
  
  @Pure
  @Override
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(final String label) {
    this.label = label;
  }
  
  /**
   * The kind of this completion item. Based of the kind an icon is chosen by the editor.
   */
  private Integer kind;
  
  @Pure
  @Override
  public Integer getKind() {
    return this.kind;
  }
  
  public void setKind(final Integer kind) {
    this.kind = kind;
  }
  
  /**
   * A human-readable string with additional information about this item, like type or symbol information.
   */
  private String detail;
  
  @Pure
  @Override
  public String getDetail() {
    return this.detail;
  }
  
  public void setDetail(final String detail) {
    this.detail = detail;
  }
  
  /**
   * A human-readable string that represents a doc-comment.
   */
  private String documentation;
  
  @Pure
  @Override
  public String getDocumentation() {
    return this.documentation;
  }
  
  public void setDocumentation(final String documentation) {
    this.documentation = documentation;
  }
  
  /**
   * A string that shoud be used when comparing this item with other items. When `falsy` the label is used.
   */
  private String sortText;
  
  @Pure
  @Override
  public String getSortText() {
    return this.sortText;
  }
  
  public void setSortText(final String sortText) {
    this.sortText = sortText;
  }
  
  /**
   * A string that should be used when filtering a set of completion items. When `falsy` the label is used.
   */
  private String filterText;
  
  @Pure
  @Override
  public String getFilterText() {
    return this.filterText;
  }
  
  public void setFilterText(final String filterText) {
    this.filterText = filterText;
  }
  
  /**
   * A string that should be inserted a document when selecting this completion. When `falsy` the label is used.
   */
  private String insertText;
  
  @Pure
  @Override
  public String getInsertText() {
    return this.insertText;
  }
  
  public void setInsertText(final String insertText) {
    this.insertText = insertText;
  }
  
  /**
   * An edit which is applied to a document when selecting this completion. When an edit is provided the value of
   * insertText is ignored.
   */
  private TextEditImpl textEdit;
  
  @Pure
  @Override
  public TextEditImpl getTextEdit() {
    return this.textEdit;
  }
  
  public void setTextEdit(final TextEditImpl textEdit) {
    this.textEdit = textEdit;
  }
  
  /**
   * An data entry field that is preserved on a completion item between a completion and a completion resolve request.
   */
  private Object data;
  
  @Pure
  @Override
  public Object getData() {
    return this.data;
  }
  
  public void setData(final Object data) {
    this.data = data;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("label", this.label);
    b.add("kind", this.kind);
    b.add("detail", this.detail);
    b.add("documentation", this.documentation);
    b.add("sortText", this.sortText);
    b.add("filterText", this.filterText);
    b.add("insertText", this.insertText);
    b.add("textEdit", this.textEdit);
    b.add("data", this.data);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CompletionItemImpl other = (CompletionItemImpl) obj;
    if (this.label == null) {
      if (other.label != null)
        return false;
    } else if (!this.label.equals(other.label))
      return false;
    if (this.kind == null) {
      if (other.kind != null)
        return false;
    } else if (!this.kind.equals(other.kind))
      return false;
    if (this.detail == null) {
      if (other.detail != null)
        return false;
    } else if (!this.detail.equals(other.detail))
      return false;
    if (this.documentation == null) {
      if (other.documentation != null)
        return false;
    } else if (!this.documentation.equals(other.documentation))
      return false;
    if (this.sortText == null) {
      if (other.sortText != null)
        return false;
    } else if (!this.sortText.equals(other.sortText))
      return false;
    if (this.filterText == null) {
      if (other.filterText != null)
        return false;
    } else if (!this.filterText.equals(other.filterText))
      return false;
    if (this.insertText == null) {
      if (other.insertText != null)
        return false;
    } else if (!this.insertText.equals(other.insertText))
      return false;
    if (this.textEdit == null) {
      if (other.textEdit != null)
        return false;
    } else if (!this.textEdit.equals(other.textEdit))
      return false;
    if (this.data == null) {
      if (other.data != null)
        return false;
    } else if (!this.data.equals(other.data))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.label== null) ? 0 : this.label.hashCode());
    result = prime * result + ((this.kind== null) ? 0 : this.kind.hashCode());
    result = prime * result + ((this.detail== null) ? 0 : this.detail.hashCode());
    result = prime * result + ((this.documentation== null) ? 0 : this.documentation.hashCode());
    result = prime * result + ((this.sortText== null) ? 0 : this.sortText.hashCode());
    result = prime * result + ((this.filterText== null) ? 0 : this.filterText.hashCode());
    result = prime * result + ((this.insertText== null) ? 0 : this.insertText.hashCode());
    result = prime * result + ((this.textEdit== null) ? 0 : this.textEdit.hashCode());
    result = prime * result + ((this.data== null) ? 0 : this.data.hashCode());
    return result;
  }
}
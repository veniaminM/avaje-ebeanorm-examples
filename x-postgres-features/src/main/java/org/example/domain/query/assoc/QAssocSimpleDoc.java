package org.example.domain.query.assoc;

import org.avaje.ebean.typequery.PJson;
import org.avaje.ebean.typequery.PLong;
import org.avaje.ebean.typequery.PString;
import org.avaje.ebean.typequery.TQAssocBean;
import org.avaje.ebean.typequery.TQProperty;
import org.avaje.ebean.typequery.TypeQueryBean;
import org.example.domain.SimpleDoc;
import org.example.domain.query.QSimpleDoc;

/**
 * Association query bean for AssocSimpleDoc.
 */
@TypeQueryBean
public class QAssocSimpleDoc<R> extends TQAssocBean<SimpleDoc,R> {

  public PLong<R> id;
  public PLong<R> version;
  public PString<R> name;
  public PJson<R> content;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QSimpleDoc>... properties) {
    return fetchProperties(properties);
  }

  public QAssocSimpleDoc(String name, R root) {
    super(name, root);
  }
}
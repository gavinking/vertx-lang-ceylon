import ceylon.json {
  JsonObject=Object,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter
}
import io.vertx.core.net {
  TrustOptions_=TrustOptions
}
/* Generated from io.vertx.core.net.TrustOptions */
shared interface TrustOptions satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    return json;
  }
}

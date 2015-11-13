package io.vertx.ceylon.web.handler;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Name("virtualHostHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class virtualHostHandler_ {

  private static final virtualHostHandler_ instance = new virtualHostHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::virtualHostHandler")
  public static virtualHostHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::VirtualHostHandler")
  public static VirtualHostHandler create(
    final @TypeInfo("ceylon.language::String") @Name("hostname") @DocAnnotation$annotation$(description = "todo") ceylon.language.String hostname, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web::RoutingContext)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(hostname);
    io.vertx.core.Handler<io.vertx.ext.web.RoutingContext> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.RoutingContext>() {
      public void handle(io.vertx.ext.web.RoutingContext event) {
        handler.$call$((Object)io.vertx.ceylon.web.RoutingContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    VirtualHostHandler ret = io.vertx.ceylon.web.handler.VirtualHostHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.VirtualHostHandler.create(arg_0, arg_1));
    return ret;
  }

}

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
import io.vertx.ceylon.web.sstore.SessionStore;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class SessionHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.SessionHandler, SessionHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.SessionHandler, SessionHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.SessionHandler, SessionHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.SessionHandler, SessionHandler>() {
        public SessionHandler convert(io.vertx.ext.web.handler.SessionHandler src) {
          return new SessionHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SessionHandler, io.vertx.ext.web.handler.SessionHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<SessionHandler, io.vertx.ext.web.handler.SessionHandler>() {
    public io.vertx.ext.web.handler.SessionHandler convert(SessionHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SessionHandler.class);
  @Ignore private final io.vertx.ext.web.handler.SessionHandler delegate;

  public SessionHandler(io.vertx.ext.web.handler.SessionHandler delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setSessionTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeout") @DocAnnotation$annotation$(description = "todo") long timeout) {
    long arg_0 = timeout;
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setSessionTimeout(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setNagHttps(
    final @TypeInfo("ceylon.language::Boolean") @Name("nag") @DocAnnotation$annotation$(description = "todo") boolean nag) {
    boolean arg_0 = nag;
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setNagHttps(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setCookieSecureFlag(
    final @TypeInfo("ceylon.language::Boolean") @Name("secure") @DocAnnotation$annotation$(description = "todo") boolean secure) {
    boolean arg_0 = secure;
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setCookieSecureFlag(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setCookieHttpOnlyFlag(
    final @TypeInfo("ceylon.language::Boolean") @Name("httpOnly") @DocAnnotation$annotation$(description = "todo") boolean httpOnly) {
    boolean arg_0 = httpOnly;
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setCookieHttpOnlyFlag(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public SessionHandler setSessionCookieName(
    final @TypeInfo("ceylon.language::String") @Name("sessionCookieName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String sessionCookieName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(sessionCookieName);
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(delegate.setSessionCookieName(arg_0));
    return this;
  }

}

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
import java.util.List;
import java.util.Set;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class JWTAuthHandler implements ReifiedType,  AuthHandler {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.JWTAuthHandler, JWTAuthHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.JWTAuthHandler, JWTAuthHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.JWTAuthHandler, JWTAuthHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.JWTAuthHandler, JWTAuthHandler>() {
        public JWTAuthHandler convert(io.vertx.ext.web.handler.JWTAuthHandler src) {
          return new JWTAuthHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<JWTAuthHandler, io.vertx.ext.web.handler.JWTAuthHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<JWTAuthHandler, io.vertx.ext.web.handler.JWTAuthHandler>() {
    public io.vertx.ext.web.handler.JWTAuthHandler convert(JWTAuthHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(JWTAuthHandler.class);
  @Ignore private final io.vertx.ext.web.handler.JWTAuthHandler delegate;

  public JWTAuthHandler(io.vertx.ext.web.handler.JWTAuthHandler delegate) {
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
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthority(
    final @TypeInfo("ceylon.language::String") @Name("authority") @DocAnnotation$annotation$(description = "todo") ceylon.language.String authority) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(authority);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(delegate.addAuthority(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::AuthHandler")
  public AuthHandler addAuthorities(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("authorities") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> authorities) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertSet(authorities, io.vertx.lang.ceylon.ToJava.String);
    AuthHandler ret = io.vertx.ceylon.web.handler.AuthHandler.TO_CEYLON.converter().safeConvert(delegate.addAuthorities(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::JWTAuthHandler")
  public JWTAuthHandler setAudience(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("audience") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> audience) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(audience, io.vertx.lang.ceylon.ToJava.String);
    JWTAuthHandler ret = io.vertx.ceylon.web.handler.JWTAuthHandler.TO_CEYLON.converter().safeConvert(delegate.setAudience(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::JWTAuthHandler")
  public JWTAuthHandler setIssuer(
    final @TypeInfo("ceylon.language::String") @Name("issuer") @DocAnnotation$annotation$(description = "todo") ceylon.language.String issuer) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(issuer);
    JWTAuthHandler ret = io.vertx.ceylon.web.handler.JWTAuthHandler.TO_CEYLON.converter().safeConvert(delegate.setIssuer(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::JWTAuthHandler")
  public JWTAuthHandler setIgnoreExpiration(
    final @TypeInfo("ceylon.language::Boolean") @Name("ignoreExpiration") @DocAnnotation$annotation$(description = "todo") boolean ignoreExpiration) {
    boolean arg_0 = ignoreExpiration;
    JWTAuthHandler ret = io.vertx.ceylon.web.handler.JWTAuthHandler.TO_CEYLON.converter().safeConvert(delegate.setIgnoreExpiration(arg_0));
    return this;
  }

}

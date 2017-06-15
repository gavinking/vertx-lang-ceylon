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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " This handler adds a CSRF token to requests which mutate state. In order change the state a (XSRF-TOKEN) cookie is set\n with a unique token, that is expected to be sent back in a (X-XSRF-TOKEN) header.\n\n The behavior is to check the request body header and cookie for validity.\n\n This Handler requires session support, thus should be added somewhere below Session and Body handlers.\n")
public class CSRFHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.CSRFHandler, CSRFHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.CSRFHandler, CSRFHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.CSRFHandler, CSRFHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.CSRFHandler, CSRFHandler>() {
        public CSRFHandler convert(io.vertx.ext.web.handler.CSRFHandler src) {
          return new CSRFHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<CSRFHandler, io.vertx.ext.web.handler.CSRFHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<CSRFHandler, io.vertx.ext.web.handler.CSRFHandler>() {
    public io.vertx.ext.web.handler.CSRFHandler convert(CSRFHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(CSRFHandler.class), io.vertx.ext.web.handler.CSRFHandler.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.handler.CSRFHandler delegate;

  public CSRFHandler(io.vertx.ext.web.handler.CSRFHandler delegate) {
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

  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = " Set the cookie name. By default XSRF-TOKEN is used as it is the expected name by AngularJS however other frameworks\n might use other names.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setCookieName(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "a new name for the cookie.\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setCookieName(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the cookie path. By default / is used.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setCookiePath(
    final @TypeInfo("ceylon.language::String") @Name("path")@DocAnnotation$annotation$(description = "a new path for the cookie.\n") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setCookiePath(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the header name. By default X-XSRF-TOKEN is used as it is the expected name by AngularJS however other\n frameworks might use other names.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setHeaderName(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "a new name for the header.\n") ceylon.language.String name) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setHeaderName(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Should the handler give warning messages if this handler is used in other than https protocols?\n")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setNagHttps(
    final @TypeInfo("ceylon.language::Boolean") @Name("nag")@DocAnnotation$annotation$(description = "true to nag\n") boolean nag) {
    boolean arg_0 = nag;
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setNagHttps(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the body returned by the handler when the XSRF token is missing or invalid.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setResponseBody(
    final @TypeInfo("ceylon.language::String") @Name("responseBody")@DocAnnotation$annotation$(description = "the body of the response. If null, no response body will be returned.\n") ceylon.language.String responseBody) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(responseBody);
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setResponseBody(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the timeout for tokens generated by the handler, by default it uses the default from the session handler.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public CSRFHandler setTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeout")@DocAnnotation$annotation$(description = "token timeout\n") long timeout) {
    long arg_0 = timeout;
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(delegate.setTimeout(arg_0));
    return this;
  }

}

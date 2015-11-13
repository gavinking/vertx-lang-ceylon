package io.vertx.ceylon.web.sstore;

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
import io.vertx.ceylon.web.Session;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class SessionStore implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.sstore.SessionStore, SessionStore> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.sstore.SessionStore, SessionStore>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.sstore.SessionStore, SessionStore> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.sstore.SessionStore, SessionStore>() {
        public SessionStore convert(io.vertx.ext.web.sstore.SessionStore src) {
          return new SessionStore(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SessionStore, io.vertx.ext.web.sstore.SessionStore> TO_JAVA = new io.vertx.lang.ceylon.Converter<SessionStore, io.vertx.ext.web.sstore.SessionStore>() {
    public io.vertx.ext.web.sstore.SessionStore convert(SessionStore src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SessionStore.class);
  @Ignore private final io.vertx.ext.web.sstore.SessionStore delegate;

  public SessionStore(io.vertx.ext.web.sstore.SessionStore delegate) {
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
  @TypeInfo("io.vertx.ceylon.web::Session")
  public Session createSession(
    final @TypeInfo("ceylon.language::Integer") @Name("timeout") @DocAnnotation$annotation$(description = "todo") long timeout) {
    long arg_0 = timeout;
    Session ret = io.vertx.ceylon.web.Session.TO_CEYLON.converter().safeConvert(delegate.createSession(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void get(
    final @TypeInfo("ceylon.language::String") @Name("id") @DocAnnotation$annotation$(description = "todo") ceylon.language.String id, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.web::Session)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(id);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.web.Session>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.ext.web.Session>(resultHandler) {
      public Object toCeylon(io.vertx.ext.web.Session event) {
        return io.vertx.ceylon.web.Session.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.get(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void delete(
    final @TypeInfo("ceylon.language::String") @Name("id") @DocAnnotation$annotation$(description = "todo") ceylon.language.String id, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(id);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.delete(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void put(
    final @TypeInfo("io.vertx.ceylon.web::Session") @Name("session") @DocAnnotation$annotation$(description = "todo") Session session, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.ext.web.Session arg_0 = io.vertx.ceylon.web.Session.TO_JAVA.safeConvert(session);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.put(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void clear(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    delegate.clear(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void size(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Integer)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Integer>> arg_0 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Integer>(resultHandler) {
      public Object toCeylon(java.lang.Integer event) {
        return io.vertx.lang.ceylon.ToCeylon.Integer.safeConvert(event);
      }
    };
    delegate.size(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}

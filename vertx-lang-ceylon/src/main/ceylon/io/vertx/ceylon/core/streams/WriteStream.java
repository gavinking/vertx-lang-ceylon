package io.vertx.ceylon.core.streams;

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
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public interface WriteStream<T> extends StreamBase {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.WriteStream, WriteStream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.WriteStream, WriteStream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.streams.WriteStream, WriteStream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.streams.WriteStream, WriteStream>() {
        public WriteStream convert(io.vertx.core.streams.WriteStream src) {
          return new WriteStream.Impl(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<WriteStream, io.vertx.core.streams.WriteStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<WriteStream, io.vertx.core.streams.WriteStream>() {
    public io.vertx.core.streams.WriteStream convert(WriteStream src) {
      return (io.vertx.core.streams.WriteStream)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WriteStream.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> write(
    final @TypeInfo("T?") @Name("data") @DocAnnotation$annotation$(description = "todo") T data);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "todo") long maxSize);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @Ignore
  public class Impl<T> implements WriteStream<T> {
    @Ignore private final TypeDescriptor $TypeDescriptor$;
    @Ignore private final TypeDescriptor $reified$T;
    @Ignore private final io.vertx.core.streams.WriteStream delegate;

    public Impl(@Ignore TypeDescriptor $reified$T, io.vertx.core.streams.WriteStream delegate) {
      this.$TypeDescriptor$ = TypeDescriptor.klass(WriteStream.class, $reified$T);
      this.$reified$T = $reified$T;
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
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.exceptionHandler(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> write(
    final @TypeInfo("T?") @Name("data") @DocAnnotation$annotation$(description = "todo") T data) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(data);
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.write(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.setWriteQueueMaxSize(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
      return ret;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.drainHandler(arg_0));
      return this;
    }
  }

}
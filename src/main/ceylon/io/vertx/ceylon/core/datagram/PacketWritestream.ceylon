import java.lang {
  Void_=Void
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core.datagram {
  PacketWritestream_=PacketWritestream
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.core.streams {
  WriteStream_=WriteStream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.datagram.PacketWritestream */
shared interface PacketWritestream satisfies WriteStream<Buffer> {

  shared actual formal PacketWritestream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal PacketWritestream(*<[Buffer]>) write;
  shared actual formal PacketWritestream(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal PacketWritestream(*<[Anything()]>) drainHandler;
}
/* Generated from io.vertx.core.datagram.PacketWritestream */

shared abstract class PacketWritestream_Impl(PacketWritestream_ delegate) satisfies PacketWritestream & Delegating<PacketWritestream_> {

  shared actual PacketWritestream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual PacketWritestream(*<[Buffer]>) write => flatten(write_impl);
  shared actual PacketWritestream(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual PacketWritestream(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);

  PacketWritestream exceptionHandler_impl([Anything(Throwable)] args) {
    Handler_<Throwable> arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  PacketWritestream write_impl([Buffer] args) {
    assert(is Delegating<Buffer_> arg_0 = args[0]);
    Anything v = delegate.write(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  PacketWritestream setWriteQueueMaxSize_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setWriteQueueMaxSize(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  PacketWritestream drainHandler_impl([Anything()] args) {
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.drainHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}

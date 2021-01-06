module io.ballerina.observe.trace.extension.choreo {
    requires jaeger.core;
    requires opentracing.api;
    requires io.ballerina.runtime;
    requires grpc.api;
    requires com.google.common;
    requires grpc.stub;
    requires grpc.protobuf;
    requires com.google.protobuf;
    requires io.ballerina.config;

    provides io.ballerina.runtime.observability.tracer.spi.TracerProviderFactory
            with io.ballerina.observe.choreo.ChoreoTracerProviderFactory;
    provides io.ballerina.runtime.observability.metrics.spi.MetricReporterFactory
            with io.ballerina.observe.choreo.ChoreoMetricReporterFactory;
}

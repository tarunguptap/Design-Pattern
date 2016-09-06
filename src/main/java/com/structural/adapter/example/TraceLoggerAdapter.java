package com.structural.adapter.example;

public class TraceLoggerAdapter implements Logger {

    private final TraceLogger traceLogger;

    public TraceLoggerAdapter() {
        traceLogger = new TraceLogger();
    }

    @Override
    public void log(String text) {
        traceLogger.printToLog(text + " composition");
    }

}

package com.structural.adapter.example;

public class TraceLoggerInheritanceAdapter extends TraceLogger implements Logger {

    @Override
    public void log(String text) {
        printToLog(text + " inheritance");
    }

}

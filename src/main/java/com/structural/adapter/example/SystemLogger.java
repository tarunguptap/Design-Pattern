package com.structural.adapter.example;

class SystemLogger implements Logger {
    @Override
    public void log(String text) {
        System.out.println("System Logger" + text);
    }
}

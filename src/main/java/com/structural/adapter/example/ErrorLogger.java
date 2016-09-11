package com.structural.adapter.example;

class ErrorLogger implements Logger {

    @Override
    public void log(String text) {
        System.out.println("ERROR:Error Logger" + text);
    }

}

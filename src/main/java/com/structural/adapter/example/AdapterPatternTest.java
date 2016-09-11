package com.structural.adapter.example;

import java.util.ArrayList;
import java.util.List;

public class AdapterPatternTest {

    public static void main(String[] args) {
        Logger logger = null;
        List<Logger> loggerList = new ArrayList<Logger>();
        /*
         * here SystemLogger and error logger are implementation of an internal interface so the method remains same
         */
        logger = new SystemLogger();
        loggerList.add(logger);

        Logger logger1 = null;
        logger1 = new ErrorLogger();
        loggerList.add(logger1);

        /*
         * TraceLogger is a 3rd party implementation which does not implement our internal interface and it also doesn't
         * have the same logging method as the other implementations. so Here we make an adapter which implements the
         * internal interface and the adapter class internally uses the 3rd party class now this can be done via
         * composition as well as inheritance , this example uses composition
         */
        Logger logger2 = null;
        logger2 = new TraceLoggerAdapter();
        loggerList.add(logger2);

        // this example uses inheritance
        Logger logger3 = null;
        logger3 = new TraceLoggerInheritanceAdapter();
        loggerList.add(logger3);

        for (Logger genericLogger : loggerList) {
            genericLogger.log("test");
        }

    }

}

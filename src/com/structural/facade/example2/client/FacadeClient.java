package com.structural.facade.example2.client;

import com.structural.facade.example2.facade.ComputerFacade;

public class FacadeClient {
    public static void main(String[] args) {
        ComputerFacade facade = new ComputerFacade();
        facade.start();
    }
}


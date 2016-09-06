package com.structural.facade.example2;

public class HardDrive {
    public byte[] read(long lba, int size) {
        // ......
        byte[] byteArray = new byte[1000];
        // some processing

        return byteArray;
    }
}

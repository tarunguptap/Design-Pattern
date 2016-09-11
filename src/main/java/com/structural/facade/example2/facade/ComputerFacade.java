package com.structural.facade.example2.facade;

import com.structural.facade.example2.CPU;
import com.structural.facade.example2.HardDrive;
import com.structural.facade.example2.Memory;

public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    private static final long BOOT_ADDRESS = 1L; // This is just a dummy value. It will have some address value
    private static final long BOOT_SECTOR = 1L; // This is just a dummy value. It will have some sector value
    private static final int SECTOR_SIZE = 2; // This is just a dummy value.

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}

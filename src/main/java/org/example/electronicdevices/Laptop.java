package org.example.electronicdevices;

public class Laptop extends Device {
    private int ramSize;
    private String processorType;

    public Laptop(String name, double price, double weight, int ramSize, String processorType) {
        super(Type.LAPTOP, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return super.toString() + ", RAM Size=" + ramSize + "GB, Processor=" + processorType;
    }
}



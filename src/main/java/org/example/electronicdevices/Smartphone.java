package org.example.electronicdevices;

public class Smartphone extends Device {
    private final double screenSize;
    private final double cameraResolution;

    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super(DeviceType.SMARTPHONE, name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return String.format("%s (Smartphone): $%.2f, %.2f g, %.1f\" screen, %.1f MP camera",
                getName(), getPrice(), getWeight(), screenSize, cameraResolution);
    }
}



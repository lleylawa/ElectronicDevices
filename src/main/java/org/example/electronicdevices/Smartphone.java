package org.example.electronicdevices;

public class Smartphone extends Device {
    private double screenSize;
    private double cameraResolution;

    public Smartphone(String name, double price, double weight, double screenSize, double cameraResolution) {
        super(DeviceType.SMARTPHONE, name, price, weight);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
    }

    // Getters and Setters
    public double getScreenSize() { return screenSize; }
    public void setScreenSize(double screenSize) { this.screenSize = screenSize; }

    public double getCameraResolution() { return cameraResolution; }
    public void setCameraResolution(double cameraResolution) { this.cameraResolution = cameraResolution; }

    @Override
    public String toString() {
        return super.toString() + ", Screen Size: " + screenSize + "\", Camera: " + cameraResolution + "MP";
    }
}


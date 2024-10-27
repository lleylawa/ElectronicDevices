package org.example.electronicdevices;

public class Device {

    private final DeviceType type;
    private final String name;
    private final double price;
    private final double weight;

    public Device(DeviceType type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public DeviceType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s: $%.2f, %.2f g", name, price, weight);
    }
}


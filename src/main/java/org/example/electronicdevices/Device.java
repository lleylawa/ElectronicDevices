package org.example.electronicdevices;

public class Device {
    public enum Type {
        SMARTPHONE, LAPTOP, TABLET
    }

    private Type type;
    private String name;
    private double price;
    private double weight;

    public Device(Type type, String name, double price, double weight) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Device [Type=" + type + ", Name=" + name + ", Price=" + price + ", Weight=" + weight + "]";
    }
}


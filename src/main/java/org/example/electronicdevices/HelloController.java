package org.example.electronicdevices;

import javafx.fxml.FXML;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TabPane tabPane; // The TabPane containing the device tabs
    @FXML
    private TextField nameField; // TextField for name input
    @FXML
    private TextField priceField; // TextField for price input
    @FXML
    private TextField weightField; // TextField for weight input
    @FXML
    private ListView<Device> listView; // ListView to display added devices

    private ObservableList<Device> deviceList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        listView.setItems(deviceList);
    }

    @FXML
    public void addSmartphone() {
        String name = nameField.getText();
        double price = Double.parseDouble(priceField.getText());
        double weight = Double.parseDouble(weightField.getText());
        // You can add more input fields for smartphone attributes like screen size, camera resolution
        double screenSize = 6.5; // Example value, you can get this from another TextField
        double cameraResolution = 12.0; // Example value

        Smartphone smartphone = new Smartphone(name, price, weight, screenSize, cameraResolution);
        deviceList.add(smartphone);
        clearFields();
    }

    @FXML
    public void addLaptop() {
        String name = nameField.getText();
        double price = Double.parseDouble(priceField.getText());
        double weight = Double.parseDouble(weightField.getText());
        int ramSize = 16; // Example value
        String processorType = "Intel i7"; // Example value

        Laptop laptop = new Laptop(name, price, weight, ramSize, processorType);
        deviceList.add(laptop);
        clearFields();
    }

    @FXML
    public void addTablet() {
        String name = nameField.getText();
        double price = Double.parseDouble(priceField.getText());
        double weight = Double.parseDouble(weightField.getText());
        double batteryLife = 10.0; // Example value
        boolean hasStylus = true; // Example value

        Tablet tablet = new Tablet(name, price, weight, batteryLife, hasStylus);
        deviceList.add(tablet);
        clearFields();
    }

    @FXML
    public void removeSelectedDevice() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        if (selectedDevice != null) {
            deviceList.remove(selectedDevice);
        }
    }

    private void clearFields() {
        nameField.clear();
        priceField.clear();
        weightField.clear();
    }
}

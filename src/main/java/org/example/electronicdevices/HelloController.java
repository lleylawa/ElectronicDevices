package org.example.electronicdevices;

import javafx.fxml.FXML;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TabPane tabPane;
    @FXML
    private TextField nameField, priceField, weightField, screenSizeField, cameraResolutionField, ramSizeField, processorTypeField, batteryLifeField;
    @FXML
    private CheckBox stylusCheckBox;
    @FXML
    private ListView<Device> listView;
    private ObservableList<Device> deviceList;

    @FXML
    public void initialize() {
        deviceList = FXCollections.observableArrayList();
        listView.setItems(deviceList);
    }

    @FXML
    protected void onAddButtonClick() {
        try {
            String name = nameField.getText();
            double price = Double.parseDouble(priceField.getText());
            double weight = Double.parseDouble(weightField.getText());

            Device device;
            if (tabPane.getSelectionModel().getSelectedItem().getText().equals("Smartphone")) {
                double screenSize = Double.parseDouble(screenSizeField.getText());
                double cameraResolution = Double.parseDouble(cameraResolutionField.getText());
                device = new Smartphone(name, price, weight, screenSize, cameraResolution);
            } else if (tabPane.getSelectionModel().getSelectedItem().getText().equals("Laptop")) {
                int ramSize = Integer.parseInt(ramSizeField.getText());
                String processorType = processorTypeField.getText();
                device = new Laptop(name, price, weight, ramSize, processorType);
            } else {
                double batteryLife = Double.parseDouble(batteryLifeField.getText());
                boolean hasStylus = stylusCheckBox.isSelected();
                device = new Tablet(name, price, weight, batteryLife, hasStylus);
            }
            deviceList.add(device);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @FXML
    protected void onRemoveButtonClick() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        if (selectedDevice != null) {
            deviceList.remove(selectedDevice);
        }
    }
}

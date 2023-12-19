package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Window2 implements Refresh {

    @FXML
    private Label lblName;

    public void setName(String name) {
        lblName.setText(name);
    }

    @Override
    public void refresh() {
        lblName.setText(String.valueOf(Resource.RESOURCES.size()));
    }
}

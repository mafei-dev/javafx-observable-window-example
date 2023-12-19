package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController  {

    @FXML
    public TextField txtName;
    @FXML
    private Label welcomeText;



    @FXML
    protected void onHelloButtonClick(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Window2.fxml"));
        Parent root = fxmlLoader.load();
        Refresh window2 = fxmlLoader.getController();
        Resource.add(window2);
        Scene scene = new Scene(root);
//        this.stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Stage stage1 = new Stage();
        stage1.setOnCloseRequest(windowEvent -> {
            Resource.remove(window2);
        });
        stage1.setScene(scene);
        stage1.show();
    }

}
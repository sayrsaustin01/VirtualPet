package com.virtuaalpet.virtualpet;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Window;

public class PlayScreen {
    @FXML
    private Button backButton;

    @FXML
    public void handleBackButton(ActionEvent event) {
        try {
            Stage stage = (Stage) Stage.getWindows().filtered(Window::isShowing).get(0);
            Parent root = FXMLLoader.load(getClass().getResource("main_menu.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private Button newGame;

    @FXML
    public void handlenewGame(ActionEvent event) {
        try {
            Stage stage = (Stage) Stage.getWindows().filtered(Window::isShowing).get(0);
            Parent root = FXMLLoader.load(getClass().getResource("pet_choose.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

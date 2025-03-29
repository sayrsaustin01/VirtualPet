package com.virtuaalpet.virtualpet;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class MainMenu {
    public static void load() {
        try {
            Stage stage = (Stage) Stage.getWindows().filtered(Window::isShowing).get(0);
            Parent root = FXMLLoader.load(MainMenu.class.getResource("main_menu.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    private Button playButton;

    @FXML
    private Button quitButton;

    @FXML
    public void handlePlayButton(ActionEvent event) {
        try {
            Stage stage = (Stage) Stage.getWindows().filtered(Window::isShowing).get(0);
            Parent root = FXMLLoader.load(getClass().getResource("play_screen.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void handleQuitButton(ActionEvent event) {
        Stage stage = (Stage) Stage.getWindows().filtered(Window::isShowing).get(0);
        stage.close();
    }
}

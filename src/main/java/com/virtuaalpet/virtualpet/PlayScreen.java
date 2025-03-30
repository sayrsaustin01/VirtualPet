package com.virtuaalpet.virtualpet;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class PlayScreen {

    @FXML
    public void handleNewGameButton(ActionEvent event) {
        System.out.println("[INFO] NEW GAME button clicked!");  // Debugging line

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tutorial_screen.fxml"));
            Parent root = loader.load();

            // Get the current stage from the button press event
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            System.out.println("[SUCCESS] Tutorial screen loaded!");  // Debugging line
        } catch (Exception e) {
            System.err.println("[ERROR] Failed to load tutorial_screen.fxml:");
            e.printStackTrace();
        }
    }

    @FXML
    public void handleBackButton(ActionEvent event) {
        System.out.println("[INFO] BACK button clicked!");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("main_menu.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            System.out.println("[SUCCESS] Main menu loaded!");
        } catch (Exception e) {
            System.err.println("[ERROR] Failed to load main_menu.fxml:");
            e.printStackTrace();
        }
    }
}

package com.virtuaalpet.virtualpet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayScreen {

    @FXML
    private void handleNewGameButton(ActionEvent event) {
        System.out.println("🟢 NEW GAME button clicked!");  // Debugging log

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/virtuaalpet/virtualpet/tutorial_screen.fxml"));
            Parent root = loader.load();

            // Get the current stage
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

            System.out.println("✅ Tutorial screen loaded successfully!");
        } catch (IOException e) {
            System.err.println("❌ Error loading tutorial_screen.fxml:");
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBackButton(ActionEvent event) {
        System.out.println("🔵 BACK button clicked!");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/virtuaalpet/virtualpet/main_menu.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

            System.out.println("✅ Main menu loaded successfully!");
        } catch (IOException e) {
            System.err.println("❌ Error loading main_menu.fxml:");
            e.printStackTrace();
        }
    }
}

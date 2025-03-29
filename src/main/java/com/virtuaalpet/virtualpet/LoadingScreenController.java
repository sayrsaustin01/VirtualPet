package com.virtuaalpet.virtualpet;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class LoadingScreenController {
    @FXML
    private Rectangle progressFill;
    @FXML
    private Label loadingText;

    public void initialize() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), new KeyValue(progressFill.widthProperty(), 0)),
                new KeyFrame(Duration.seconds(1), new KeyValue(progressFill.widthProperty(), 64.75)), // 25%
                new KeyFrame(Duration.seconds(2), new KeyValue(progressFill.widthProperty(), 129.5)), // 50%
                new KeyFrame(Duration.seconds(3), new KeyValue(progressFill.widthProperty(), 194.25)), // 75%
                new KeyFrame(Duration.seconds(4), new KeyValue(progressFill.widthProperty(), 259))
        );

        timeline.setCycleCount(1);
        timeline.setOnFinished(event -> MainMenu.load()); // Load main menu after animation completes
        timeline.play();

        FadeTransition fade = new FadeTransition(Duration.seconds(0.5), loadingText);
        fade.setFromValue(1.0);
        fade.setToValue(0.3);
        fade.setCycleCount(Animation.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();
    }

}



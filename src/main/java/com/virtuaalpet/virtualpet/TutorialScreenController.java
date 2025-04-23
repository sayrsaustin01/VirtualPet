package com.virtuaalpet.virtualpet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class TutorialScreenController {

    @FXML
    private Label tutorialText; // Label for tutorial text

    @FXML
    private ImageView arrowImage; // ImageView for arrow

    @FXML
    private Button nextButton; // Next button

    private int textIndex = 0; // Tracks tutorial progress

    // Tutorial messages
    private final String[] tutorialMessages = {
            "HI THERE, SINCE YOU HAVE CHOSEN YOUR PET, YOU ARE RESPONSIBLE TO TAKE CARE OF THIS PET, FOR THE REST OF YOUR LIFE",
            "ON THE TOP RIGHT CORNER, YOU CAN SEE THREE BARS, WHICH INDICATES YOUR PET STATUS",
            "THE FIRST BAR INDICATES YOUR PET’S LIFE/HEALTH",
            "THE SECOND BAR INDICATES YOUR PET’S HUNGER",
            "THE THIRD BAR INDICATES YOUR PET’S THIRSTINESS",
            "THAT’S ALL FOR TODAY, GOOD LUCK!"
    };

    // Adjusted Arrow Positions (Shifted Left by 20px)
    private final double[][] arrowPositions = {
            {700, 30},  // Hidden at start
            {590, 40},  // Pointing at status bars (top right)
            {610, 0},  // First bar (Health)
            {610, 40},  // Second bar (Hunger)
            {610, 95},  // Third bar (Thirstiness)
            {0, 0}      // Hide arrow at last message
    };

    @FXML
    private void handleNextButton(ActionEvent event) {
        textIndex++;

        // Update the text
        if (textIndex < tutorialMessages.length) {
            tutorialText.setText(tutorialMessages[textIndex]);

            // Move the arrow slightly left
            arrowImage.setLayoutX(arrowPositions[textIndex][0]);
            arrowImage.setLayoutY(arrowPositions[textIndex][1]);

            // Show or hide arrow
            arrowImage.setVisible(textIndex > 0 && textIndex < tutorialMessages.length - 1);
        }

        // Hide the Next button at the last message
        if (textIndex == tutorialMessages.length - 1) {
            nextButton.setVisible(false);
        }
    }
}

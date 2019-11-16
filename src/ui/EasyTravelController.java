package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class EasyTravelController {

    @FXML
    private Pane credits;

    @FXML
    private Pane instructions;

    @FXML
    private Pane EasyTravel;

    @FXML
    private Pane pointsOfInterest;

    @FXML
    private Pane unconnectedZones;

    @FXML
    private Pane PaneCalculateTime;

    @FXML
    void ActivateCredits(ActionEvent event) {
    	credits.setVisible(true);
    	instructions.setVisible(false);
    	EasyTravel.setVisible(false);
    	pointsOfInterest.setVisible(false);
    	unconnectedZones.setVisible(false);
    	PaneCalculateTime.setVisible(false);
    }

    @FXML
    void ActivateInstructions(ActionEvent event) {
    	credits.setVisible(true);
    	instructions.setVisible(true);
    	EasyTravel.setVisible(false);
    	pointsOfInterest.setVisible(false);
    	unconnectedZones.setVisible(false);
    	PaneCalculateTime.setVisible(false);
    }
    
    @FXML
    void ActivateCalculateTime(ActionEvent event) {
    	credits.setVisible(false);
    	instructions.setVisible(false);
    	EasyTravel.setVisible(false);
    	pointsOfInterest.setVisible(false);
    	unconnectedZones.setVisible(false);
    	PaneCalculateTime.setVisible(true);
    }

    @FXML
    void ActivateEasyTravel(ActionEvent event) {
    	credits.setVisible(false);
    	instructions.setVisible(false);
    	EasyTravel.setVisible(true);
    	pointsOfInterest.setVisible(false);
    	unconnectedZones.setVisible(false);
    	PaneCalculateTime.setVisible(false);
    }

    @FXML
    void ActivatePointsOfInterest(ActionEvent event) {
    	credits.setVisible(false);
    	instructions.setVisible(false);
    	EasyTravel.setVisible(false);
    	pointsOfInterest.setVisible(true);
    	unconnectedZones.setVisible(false);
    	PaneCalculateTime.setVisible(false);
    }

    @FXML
    void ActivateUnconnectedZones(ActionEvent event) {
    	credits.setVisible(false);
    	instructions.setVisible(false);
    	EasyTravel.setVisible(false);
    	pointsOfInterest.setVisible(false);
    	unconnectedZones.setVisible(true);
    	PaneCalculateTime.setVisible(false);
    }

    @FXML
    void Exit(ActionEvent event) {
    	System.exit(0);
    }

}

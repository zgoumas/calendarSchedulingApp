package sample.Utility;

import javafx.scene.control.Alert;

public class Toolbox {

    public void displayAlertBox(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);

        alert.showAndWait();
    }

    public void printStatementLocator(String fileName) {
        System.out.println("The above print statement was generated from " + fileName);
    }
}

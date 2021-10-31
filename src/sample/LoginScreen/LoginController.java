package sample.LoginScreen;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Utility.JDBC;
import sample.Utility.Toolbox;

import java.sql.Connection;


public class LoginController {


    public Button onExitButton;
    public Button onResetButton;
    public TextField usernameTextField;
    public TextField passwordTextField;
    public Button onLoginButton;


    public void onLoginButton(ActionEvent actionEvent) throws Exception {

            Parent root = FXMLLoader.load(getClass().getResource("../MainScreen/MainScreen.fxml"));
            Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root, 800, 600);
            stage.setScene(scene);
            stage.show();

            new Toolbox().displayAlertBox("Login", "Error", "The username or password is incorrect.");

    }


    public void onResetButton(ActionEvent actionEvent) {
    usernameTextField.setText("");
    passwordTextField.setText("");
    }


    public void onExitButton(ActionEvent actionEvent) {
        Stage stage = (Stage) onExitButton.getScene().getWindow();
        stage.close();
        System.out.println("The application has exited");
        new Toolbox().printStatementLocator("LoginController.java");

    }

}

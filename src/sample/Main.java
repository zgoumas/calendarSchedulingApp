package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.Utility.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("LoginScreen/LoginScreen.fxml"));
            primaryStage.setTitle("Login");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }


    public static void main(String[] args) throws SQLException {
        JDBC.openConnection();

        Statement statement = JDBC.getStatement();


        String selectStatement = "SELECT * FROM users"; //The SQL query
        statement.execute(selectStatement); //Sending the query to MyWorkbench
        ResultSet results = statement.getResultSet(); // The returned query

        while (results.next()) {
            int userID = results.getInt("User_ID");
            String User_Name = results.getString("User_Name");
            String Password = results.getString("Password");

            System.out.println(userID + " | " + User_Name + " | " + Password);
        }

        launch(args);
        JDBC.closeConnection();
    }
}

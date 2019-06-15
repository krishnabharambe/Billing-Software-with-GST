package Startup;

import Database.db;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../login/login.fxml"));
        primaryStage.setMaximized(true);
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //creating user table
        db.setdata("CREATE table if not exists userManager(id integer primary key autoincrement,Name text,contact text,email text,aboutUser text,joiningDate text,leavingDate text,username text,password text,dated_on text,updated_on text,timestamp text)");
        launch(args);
    }
}

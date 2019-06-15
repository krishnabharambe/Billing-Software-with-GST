package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import javax.management.Notification;
import java.net.URL;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;

public class logincontroller implements Initializable {
    @FXML
    private TextField txtLogin;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Label lbReset;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    void txtLoginAction(ActionEvent event) {
            }

    @FXML
    void btnLoginAction(ActionEvent event) {
        String username = txtLogin.getText().trim();
        String password  = txtPassword.getText().trim();


        if (username.isEmpty()){

            //error in username
            Notifications notifications = Notifications.create();
            notifications.title("Check Username");
            notifications.text("Please, Check Your username.");
            notifications.hideAfter(Duration.seconds(5));
            notifications.position(Pos.TOP_RIGHT);
            notifications.showError();

        }else if (password.isEmpty()){
            //error in password
            Notifications notifications = Notifications.create();
            notifications.title("Check Password");
            notifications.text("Please, Check Your Password.");
            notifications.hideAfter(Duration.seconds(5));
            notifications.position(Pos.TOP_RIGHT);
            notifications.showError();
        }else{
            //towards the login

        }
    }
}

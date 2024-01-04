package com.mycompany.plainemrsjfx;

import java.io.IOException;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class LoginController {

    @FXML private Text actiontarget;

    @FXML protected void handleSubmitPasswordAction(ActionEvent event) {
	    actiontarget.setText("Submit button has been pressed.");
    }
}

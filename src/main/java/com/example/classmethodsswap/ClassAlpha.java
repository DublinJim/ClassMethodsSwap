package com.example.classmethodsswap;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import com.example.classmethodsswap.ClassBravo;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassAlpha implements Initializable {

    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Text txt1;
    public ClassBravo classBravo;

    public void makeItBlue() {
        txt1.setFill(Color.BLUE);
        txt1.setText("Blue");
    }

    public void makeItRed() {
        txt1.setFill(Color.RED);
        txt1.setText("Red");
    }

    public void makeitGreen() {
        classBravo.sayHi();
        classBravo.makeItGreen();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        classBravo = new ClassBravo();
    }
}
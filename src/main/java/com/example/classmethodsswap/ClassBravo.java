package com.example.classmethodsswap;

import javafx.fxml.Initializable;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;


//        C:\Users\james.keogh\IdeaProjects\proto\ClassMethodsSwap\src\main\java\com\example\classmethodsswap\ClassAlpha.java
public class ClassBravo implements Initializable {

    private ClassAlpha classAlpha;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        classAlpha = new ClassAlpha();

    }
public void sayHi()
{
    System.out.println("Say hi");
}

    public void makeItGreen() {
        classAlpha.txt1.setFill(Color.GREEN);
        classAlpha.txt1.setText("Red");
    }
}

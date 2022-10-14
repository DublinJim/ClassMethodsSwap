module com.example.classmethodsswap {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.classmethodsswap to javafx.fxml;
    exports com.example.classmethodsswap;
}
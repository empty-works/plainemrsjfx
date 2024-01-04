module com.mycompany.plainemrsjfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.plainemrsjfx to javafx.fxml;
    exports com.mycompany.plainemrsjfx;
}

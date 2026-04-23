module com.mycompany.demosimpleproject1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.demosimpleproject1 to javafx.fxml;
    exports com.mycompany.demosimpleproject1;
}

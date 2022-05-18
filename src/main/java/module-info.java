module com.formulario1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.formulario1 to javafx.fxml;
    exports com.formulario1;
    exports com.formulario1.controlador;
    opens com.formulario1.controlador to javafx.fxml;
}
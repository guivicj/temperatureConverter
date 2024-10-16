module org.example.conversortemperatura {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.example.conversortemperatura to javafx.fxml;
    exports org.example.conversortemperatura;
}
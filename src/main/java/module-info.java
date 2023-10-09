module com.example.carreracaballos {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
                    requires org.kordamp.bootstrapfx.core;
            
    opens com.example.carreracaballos to javafx.fxml;
    exports com.example.carreracaballos;
}
module ehu.eus.demo21 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ehu.eus.demo21 to javafx.fxml;
    exports ehu.eus.demo21;
}
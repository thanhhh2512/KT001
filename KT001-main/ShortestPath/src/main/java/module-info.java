module com.kt.shortestpath {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires lombok;

    opens com.kt.shortestpath to javafx.fxml;
    exports com.kt.shortestpath;
}
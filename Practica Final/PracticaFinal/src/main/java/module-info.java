module org.example.practicafinal {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.persistence;
    requires org.hibernate.orm.core;

    opens org.example.practicafinal to javafx.fxml;
    exports org.example.practicafinal;
}
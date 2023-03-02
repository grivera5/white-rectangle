// This allows JavaFX to be used. -Cabeo
module white.rectangle {
    requires javafx.controls;
    opens edu.daltonstate.diskoflasers to javafx.graphics;
}
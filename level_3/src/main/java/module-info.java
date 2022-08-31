module gb.level_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens gb.level_3 to javafx.fxml;
    exports gb.level_3;
}
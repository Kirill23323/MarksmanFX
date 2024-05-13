module labs.marksman_game {
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.graphics;
  requires javafx.base;
  requires com.google.gson;

  opens labs.marksman_game to javafx.fxml,com.google.gson;

  exports labs.marksman_game;
}

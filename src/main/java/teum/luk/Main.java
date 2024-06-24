package teum.luk;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static final String FXML_MAIN_WINDOW = "fxml/mainWindow.fxml";

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(FXML_MAIN_WINDOW));
        Scene scene = new Scene(root,800,800);
        primaryStage.setTitle("ArduinoLab");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

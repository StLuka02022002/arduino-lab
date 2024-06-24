package teum.luk;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import teum.luk.config.Version;
import teum.luk.fxml.FXMLFinder;
import teum.luk.image.ImageFinder;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLFinder.getMainWindowParent();
        Scene scene = new Scene(root);
        primaryStage.setTitle(Version.NAME);
        primaryStage.getIcons()
                .add(ImageFinder.getMainIcon());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

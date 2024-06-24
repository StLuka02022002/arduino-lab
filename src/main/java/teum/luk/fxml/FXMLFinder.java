package teum.luk.fxml;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import lombok.SneakyThrows;
import teum.luk.Main;

import java.io.IOException;

public class FXMLFinder {

    public static final String PATH_FOLDER = "./fxml/";

    public static final String FXML_MAIN_WINDOW = PATH_FOLDER + "main-window.fxml";

    public static Parent getParent(String pathToFXML) throws IOException {
        return FXMLLoader.load(Main.class.getResource(pathToFXML));
    }

    public static Parent getMainWindowParent() throws IOException{
        return getParent(FXML_MAIN_WINDOW);
    }

}

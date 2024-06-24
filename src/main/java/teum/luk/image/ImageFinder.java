package teum.luk.image;

import javafx.scene.image.Image;
import teum.luk.Main;

public class ImageFinder {
    public static final String PATH_FOLDER = "image/";

    public static final String MAIN_ICON = PATH_FOLDER + "icon.png";

    public static Image getImage(String imagePath){
        return new Image(Main.class.getResourceAsStream(imagePath));
    }

    public static Image getMainIcon(){
        return getImage(MAIN_ICON);
    }
}

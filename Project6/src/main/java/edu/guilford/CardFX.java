package edu.guilford;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * JavaFX App
 */
public class CardFX extends Application {

    
    
    //create the stage
    @Override
    public void start(Stage stage) throws IOException {
            stage.setTitle("Card Window");
            
            CardPane layout = new CardPane();
    
        layout.addDisplay();
         
         Scene scene = new Scene(layout, 640, 480);
         stage.setScene(scene);
         stage.show();


    }


    public static void main(String[] args) {
        launch();
    }

}
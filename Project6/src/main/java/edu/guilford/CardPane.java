package edu.guilford;

import java.io.File;


import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CardPane extends Pane {
   static Pane layout = new Pane();
//create scene constrcutor that can be used in CardFX
Button button = new Button("BlackJack");
Label label = new Label("Click the button to show results from a blackjack game");
Label scorelabel = new Label("");
CheckBox checkBox = new CheckBox("Click me for a cool image:");
//add a textfield
TextField usertext = new TextField("Bowling score?"); 
Label errorlabel = new Label("");
//add the textfield to the pane
public void addTextField() {
   
}


//create a method to add the image to the pane
public void addDisplay() {
    //create an imageview object
    ImageView imageView;
    button.setLayoutX(200);
button.setLayoutY(200);
checkBox.setLayoutY(200);
errorlabel.setLayoutY(400);
errorlabel.setLayoutX(300);
//move label
label.setLayoutX(300);
label.setLayoutY(200);
scorelabel.setLayoutX(300);
scorelabel.setLayoutY(350);
usertext.setLayoutX(300);
usertext.setLayoutY(300);
this.getChildren().add(button);
this.getChildren().add(checkBox);
this.getChildren().add(label);
this.getChildren().add(errorlabel);

this.getChildren().add(scorelabel);
this.getChildren().add(usertext);

    //create a file object
   //create image and siplay it
    File space = new File(this.getClass().getResource("imagesofspacee.jpg").getPath());
    imageView = new ImageView(space.toURI().toString());
   
    this.getChildren().add(imageView);
//mkae it so if checkbox is clicked, image is visible
//mkae image invisible
imageView.setVisible(false);
   checkBox.setOnAction(e -> {
      if (imageView.isVisible() == false) {
           imageView.setVisible(true);
        } else {
            imageView.setVisible(false);
        }
    });

    button.setOnAction(e -> {
        label.setText(handgen.playGame());
        //add a event listner for the textfield that will then add to 1 then set scorelabel as it
       
       
    });

    usertext.setOnAction(f -> {
         int score;
       try{  score = Integer.parseInt(usertext.getText());
       } catch (NumberFormatException e) {
           errorlabel.setText("You have entered a non-integer");
           
              score = 0;
              
       }
         try {
          if (score < 0) {
                throw new NegativeNumberException("You have entered a negative number");
          }
        } catch (NegativeNumberException e) {
            errorlabel.setText("You have entered a negative number");
            score = 0;

       
       
       }  scorelabel.setText("Your score is: " + score);
    });
    //add exception for NumberFormatException

    
}




//method to change visibility of image if checkbox is pressed
public void imagevisible(ImageView imageView) {
    imageView.setVisible(true);
}
//make NegativeNumException class extending exception

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        //tell the user that they have entered a negative number
        super(message);

    }

}}
     



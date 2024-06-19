package org.example.testjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        /* FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show(); */

    //OVERALL
    /*
    Design and implement a JavaFX application that allows the user to change the color of a displayed circle
    by selecting a color out of three options provided by a set of radio buttons.

    The application also comes with a slider that controls the size of the circle.

    You must use the JavaFX property value to observe the slider value change and then update the circle
    size based on slider value.

    In addition, the application expects the user to select either a radio button control or the slider control only.

    When the user selects areas other than these controls,
    a sound effect with each mouse click on these areas will be played.
     */
//----------------------------------------------------------------------------------------------------------------------
    /*
    The application has an instruction (e.g., Change the circle color using the radio buttons.
    Change the scale of the circle between 0-100% using the slider) about its usage.

    It is placed at the top of the application window.
     */

    /*
    The set of radio buttons and the circle shape are placed below the instruction.

    The three radio buttons must be aligned and placed on the left side of the application window.

    The circle is placed on the right side of the application window.

    The color of the circle is changed immediately based on the choice of the radio button.
     */

    /*
    A slider is placed horizontally below both the set of radio buttons and the circle shape.

    The size of the circle (between 0% and 100%) is updated when the slider is moving along its scale.
     */

    /*
    When the application is launched, the radio button “orange” has been selected, the displayed circle is orange,
    the size of the orange is 25% and the knob of the slider is selected at 25 on the scale.
     */

    /*
    A warning message (e.g., Select the radio buttons or the slider only. You’ll hear a warning sound if
    the mouse is clicked elsewhere!) is placed at the bottom of the application.
     */

    /*
    The application plays a “warning” sound when the user is selecting neither any radio button nor the slider.
    An example of the sound could be “a beeping sound”, or a “telephone ringing sound”.
    Search a sound clip online or create it yourself.
     */






    }

    public static void main(String[] args)
    {
        //launch();
    }
}
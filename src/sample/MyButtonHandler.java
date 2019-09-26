package sample;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MyButtonHandler implements EventHandler<MouseEvent> {


    @Override
    public void handle(MouseEvent mouseEventB) {
        if (mouseEventB.isPrimaryButtonDown())  {

        }
    }
}

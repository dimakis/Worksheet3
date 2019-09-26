package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class MyKeyHandler implements EventHandler<KeyEvent> {

    public void handle(KeyEvent e)   {
        if(e.getCode()== KeyCode.ENTER) {
            TextField tf=(TextField)e.getSource();
            CharSequence selectedTextField =  tf.getCharacters();

        }
    }

}

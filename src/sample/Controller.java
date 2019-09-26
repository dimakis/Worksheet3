package sample;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Popup;

import java.io.*;
import java.util.ArrayList;


public class Controller {
    @FXML
    public GridPane dateGrid;

    @FXML
    public Label personalAssistantLabel;

    @FXML
    public Button addAppointment;

    @FXML
    public DatePicker datePicker;

    @FXML
    public Button saveChanges;

    public void initialize() throws IOException {
        TextField t = null;
        MyKeyHandler kh = new MyKeyHandler();
        ArrayList<String> gridSlots = new ArrayList<>();
        Button apointmentSceneButton = new Button()
        int d = 0;
        try {
            XStream xstream = new XStream(new DomDriver());
            ObjectInputStream is = xstream.createObjectInputStream(new FileReader("gridTasks.xml"));
            gridSlots.addAll((ArrayList<String>) is.readObject());
            is.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (int r = 1; r <= 7; r++) {
            for (int c = 1; c <= 14; c++) {
                //if (dateGrid.getAccessibleText() == "Free")
                dateGrid.add(t = new TextField(gridSlots.get(d++)), r, c);
                t.setOnKeyPressed(kh);
            }
        }
    }

    public void addAptmnt(ActionEvent actionEvent) {
        Popup addAptmntPopup = new Popup();
        Label popUpLabel = new Label("Add Appointment");
        popUpLabel.setStyle(" -fx-color-label-visible: true");
        popUpLabel.setStyle(" -fx-background-color: aliceblue;");
        addAptmntPopup.getContent().add(popUpLabel);
        //if (!addAptmntPopup.isShowing()) addAptmntPopup.show();
    }


    public void saveChanges(ActionEvent actionEvent) throws IOException {
        ArrayList<String> gridSlots = new ArrayList<>();
        for (int c = 1; c <= 7; c++) {
            for (int r = 1; r <= 14; r++) {
                gridSlots.add(dateGrid.getAccessibleText());
                //System.out.println(dateGrid.getAccessibleText());
                System.out.println(dateGrid.getOnInputMethodTextChanged());
                //?????????? why?
            }
        }
        XStream xStream = new XStream(new DomDriver());
        ObjectOutputStream out = xStream.createObjectOutputStream(new FileWriter("gridTasks.xml"));
        out.writeObject(gridSlots);
        out.close();
        //System.out.println("saving ");
    }
}


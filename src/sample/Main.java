package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public Scene scene1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        //VBox root = new VBox();
        Parent root = FXMLLoader.load(getClass().getResource("personalAssistant.fxml"));
        primaryStage.setTitle("Your Very Own P.A");
        primaryStage.setScene(new Scene(root, 1100, 775));
        primaryStage.show();


        //MyActionHandler gridCell = new MyActionHandler();



    }


    public static void main(String[] args) {
        launch(args);
    }
}


/*
        TableView tableView = new TableView();

        TableColumn<String, AppointmentSlot> column1 = new TableColumn<>("Time");
        column1.setCellValueFactory(new PropertyValueFactory<>("time"));

        TableColumn<String, AppointmentSlot> column2 = new TableColumn<>("Monday");
        TableColumn<String, AppointmentSlot> column3 = new TableColumn<>("Tuesday");
        TableColumn<String, AppointmentSlot> column4 = new TableColumn<>("Wednesday");
        TableColumn<String, AppointmentSlot> column5 = new TableColumn<>("Thursday");
        TableColumn<String, AppointmentSlot> column6 = new TableColumn<>("Friday");
        TableColumn<String, AppointmentSlot> column7 = new TableColumn<>("Saturday");
        TableColumn<String, AppointmentSlot> column8 = new TableColumn<>("Sunday");
  */
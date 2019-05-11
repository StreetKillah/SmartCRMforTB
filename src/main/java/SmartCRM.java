import javafx.application.Application;
import javafx.stage.Stage;
import ru.gtmk.control.Controller;

public class SmartCRM extends Application {
    //TODO switch on SQL base for translators
    //TODO add translators
    //TODO search base
    //TODO for list of mistakes and their values

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        Controller controller = new Controller();
        controller.start(primaryStage);

    }

}


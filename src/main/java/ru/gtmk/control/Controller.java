package ru.gtmk.control;

import javafx.stage.Stage;
import ru.gtmk.model.Model;
import ru.gtmk.view.View;

import javax.jws.WebParam;

public class Controller {

    private Model mModel;
    private View mView;

    public Controller() {
        this(new Model(), new View());
    }


    public Controller(Model model, View view) {
        mModel = model;
        mView = view;

    }

    public void start(Stage primaryStage){
      mView.drawPrimaryStage(primaryStage);

      //Adding a TopMenu
        mView.drawTopMenu();
        setTopMenuControl();

      mView.getPrimaryStage().setOnCloseRequest(e->{
          e.consume();
          exitFromProgram();
      });


    }

    public void exitFromProgram(){
        System.out.println("Closing program...");
        mView.getPrimaryStage().close();
    }

    private void setTopMenuControl(){
        mView.getTopMenuBar().getExitItem().setOnAction(e->{
            e.consume();
            exitFromProgram();
        });
    }
}

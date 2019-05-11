package ru.gtmk.view;


import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class View {

    private Stage mPrimaryStage;
    private ScrollPane mScrollPane;

    private BorderPane mMainPane;
    private Scene mMainScene;



    private TopMenuBar mTopMenuBar;

    public void drawPrimaryStage(Stage primaryStage){
        mPrimaryStage=primaryStage;
        mPrimaryStage.setTitle("Smart CRM for Translation business");

        mScrollPane=new ScrollPane();
        mMainPane=new BorderPane();

        mScrollPane.setContent(mMainPane);
        mMainScene=new Scene(mScrollPane,600,600);
        mPrimaryStage.setScene(mMainScene);
        mPrimaryStage.show();

    }

    public Stage getPrimaryStage(){
        return mPrimaryStage;
    }


    public void drawTopMenu(){
        mTopMenuBar=new TopMenuBar();
        mMainPane.setTop(mTopMenuBar);

    }

    public TopMenuBar getTopMenuBar() {
        return mTopMenuBar;
    }

}

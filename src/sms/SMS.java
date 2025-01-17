/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sms.SwitchBetweenScreens.ScreensController;
import sms.SwitchBetweenScreens.ScreensFramework;

/**
 *
 * @author uejaz
 */
public class SMS extends Application {
    public static String screen1ID = "main";
    public static String screen1File = "FXMLDocument.fxml";
    public static String screen2ID = "screen2";
    public static String screen2File = "Screen2.fxml";
    public static String screen3ID = "screen3";
    public static String screen3File = "Screen3.fxml";
    
    @Override
    public void start(Stage stage) throws Exception {
       
       ScreensController mainContainer = new ScreensController();
        mainContainer.loadScreen(ScreensFramework.screen1ID, ScreensFramework.screen1File);
        mainContainer.loadScreen(ScreensFramework.screen2ID, ScreensFramework.screen2File);
        mainContainer.loadScreen(ScreensFramework.screen3ID, ScreensFramework.screen3File);
        
        mainContainer.setScreen(ScreensFramework.screen1ID);
        
        Group root = new Group();
        root.getChildren().addAll(mainContainer);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}

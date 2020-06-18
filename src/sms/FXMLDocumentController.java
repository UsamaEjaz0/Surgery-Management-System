/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author uejaz
 */
public class FXMLDocumentController implements Initializable {

    /**
     * initialises the controller class.
     */
   
    @FXML
    private Button Login;
 @FXML
    private FontAwesomeIcon minimize;

    @FXML
    void close_app(MouseEvent event) {

    }

    @FXML
    void minimize(MouseEvent event) {
      
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
         }
    
      
 
    
}

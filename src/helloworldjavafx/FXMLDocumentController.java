/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author MW03
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    
    /*here is show all elements you want to use in fxml*/
    private Label labelHere;
    private Button buttonHere;

    
    @FXML
    private void clicouBotao(ActionEvent event) {
        labelHere.setText("Hellooo");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

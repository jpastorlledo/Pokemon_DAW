package pokemon.controladores;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class TestController implements Initializable{

    @FXML
    private Button btnEntrar;

    @FXML
    private void entrar(ActionEvent event){
        System.out.println("Hello World!");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        
    }


    
}

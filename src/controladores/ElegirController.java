package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ElegirController implements Initializable{

    @FXML Button btnCapturar;

    @FXML Button btnCombate;
     
    @FXML
    private void capturar(ActionEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../vistas/menuCapturar.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        //stage.close();

    }

    @FXML
    private void combate(ActionEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../vistas/menupokemon.fxml"));
        Parent root = loader.load();
        ElegirController controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        stage.close();

    }
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
}

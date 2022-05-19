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
import javafx.stage.Stage;

public class TestController implements Initializable{

    @FXML
    private Button btnEntrar;
    private Object stage;

    @FXML
    private void entrar(ActionEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/btnEntrar.fxml"));
        Parent root = loader.load();
        ElegirController controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.showAndWait();
        ((Stage) this.stage).close();

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        
    }


    
}

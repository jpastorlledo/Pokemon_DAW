package controladores;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


import modelo.Pokemon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuCapturarController implements Initializable{
    @FXML
    private Button btngenerarPok;

    @FXML 
    private Button btnCapturar;
   

    @FXML
    private void capturar(ActionEvent event)throws IOException{
        
        Connection con;
        String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(url, login, password);

		    System.out.println("Conexión establecida");
            
            probabilidadCaptura(con);

            try {
				con.close();
				System.out.println("Conexión cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
        
    }

    private void probabilidadCaptura(Connection con) {}

        @FXML
        private void generarPokemon(ActionEvent event)throws IOException{
            
        Connection con;
        String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		    con = DriverManager.getConnection(url, login, password);

		    System.out.println("Conexión establecida");
            
            generarPokemonBDDD(con);

            try {
				con.close();
				System.out.println("Conexión cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 

    }

    private void calcularMayorId(Connection con) {}
    private void generarPokemonAleatorio(Connection con) {}
    private void generarPokemonBDDD(Connection con) {}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    }

    
    
}

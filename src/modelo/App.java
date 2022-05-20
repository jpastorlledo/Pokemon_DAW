package modelo;


import java.sql.Connection;
import java.io.IOException;
import java.sql.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection = DriverManager.getConnection(url, login, password);

		    System.out.println("Conexión establecida");


			launch(args);
            /*
            mostrarPokemon(connection);

            Pokemon poke= new Pokemon(152,"Chikorita","Planta","");

            insertarPokemon(connection,poke);
            */


            try {
				connection.close();
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

	@Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../vistas/menuInicial.fxml"));
            Scene scene = new Scene (root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
        
    }
}

    


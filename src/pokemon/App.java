package pokemon;

import java.sql.Connection;
import java.sql.*;


import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection = DriverManager.getConnection(url, login, password);

		    System.out.println("Conexión establecida");
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
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        
    }
}

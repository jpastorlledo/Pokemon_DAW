package pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conec;
        String url="jdbc:mysql://localhost:3306/pokemon";
        String login="root";
        String pass="";
 
        try{
 
            Class.forName("com.mysql.cj.jdbc.Driver");
            conec = DriverManager.getConnection(url, login, pass);
 
            System.out.println("Conexión establecida");
 
            try{
                conec.close();
                System.out.println("Conexión cerrada");
            }catch(SQLException e3){
                e3.printStackTrace();
            }
 
        }catch(ClassNotFoundException e1){
            e1.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

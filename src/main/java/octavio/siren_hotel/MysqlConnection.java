package octavio.siren_hotel;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {
    
    
    MysqlConnection(){}

    public Connection get_connection(){
        Connection connection= null;

        try {
            //configuracion predeterminada para ambiente local y Xampp
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/siren_hotel","root","");
            
            if(connection == null){
                new Exception();
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return connection;
    }
}

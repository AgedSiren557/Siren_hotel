package octavio.siren_hotel;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {
    
    private static Connection connection;

    MysqlConnection(){}

    public static Connection get_connection(){
        if(connection != null){
            try {
                //configuracion predeterminada para ambiente local y Xampp
                connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/siren_hotel","root","");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return connection;
    }
}

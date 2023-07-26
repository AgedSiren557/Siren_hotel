package octavio.siren_hotel;

import java.sql.Connection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SirenHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SirenHotelApplication.class, args);
		MysqlConnection conexion = new MysqlConnection();
		if(conexion != null){
			System.out.println("Coonexion establecida con exito");

			try (Connection cnx = conexion.get_connection()){
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

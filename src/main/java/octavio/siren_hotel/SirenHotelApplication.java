package octavio.siren_hotel;

// import java.sql.Connection;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SirenHotelApplication {

	
	public static void printMenuHotel(){
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("\t\tSelect an option");
		System.out.println("1.-Add a hotel");
		System.out.println("2.-Get all hotels");
		System.out.println("3.-Get a hotel from his id");
		System.out.println("4.-Update a hotel");
		System.out.println("5.-Delete a hotel");
		System.out.println("6.-Exit");
		System.out.print("\t> ");
	}

	public static void menuAction(Scanner sc){
		int option = 0;
		do {
			printMenuHotel();
			option = Integer.valueOf( sc.nextLine() );
			switch (option) {
				case 1:
					HotelService.createHotel();
					break;
				
				case 2:
					HotelService.showHotels();
					break;
				
				case 3:
					
					break;
				
				case 4:
					HotelService.updateHotel();
					break;
				
				case 5:
					HotelService.deleteHotel();
					break;
				
				case 6:
					
					break;
				
				
				default:
					break;
			}

		} while (option != 6);
	}



	public static void main(String[] args) {
		SpringApplication.run(SirenHotelApplication.class, args);
		Scanner sc = new Scanner(System.in);
		menuAction(sc);
	}


	
}

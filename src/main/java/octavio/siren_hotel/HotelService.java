package octavio.siren_hotel;

import java.sql.ResultSet;
import java.util.Scanner;

public class HotelService {
    public static void createHotel(){
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.println("Enter the state");
        String state = sc.nextLine();
        System.out.println("Enter the city");
        String city = sc.nextLine();
        System.out.println("Enter the direction");
        String direction = sc.nextLine();
        System.out.println("Enter the letter for the size of the hotel (S small, M medium, B big)");
        String size = sc.nextLine();
        System.out.println("Enter the number of rooms");
        int number_of_rooms = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the postal code");
        int postal_code = Integer.parseInt(sc.nextLine());

        hotel.setCity(city);
        hotel.setState(state);
        hotel.setDirection(direction);
        hotel.setNumberOfRooms(number_of_rooms);
        hotel.setSize(size);
        hotel.setPostal_code(postal_code);

        HotelDAO.addHotelDB(hotel);

    }

    public static void showHotels(){
        ResultSet result = HotelDAO.showHotelsDB();
        try {
            while(result.next()){
                System.out.println("hotel_id: "+ result.getInt("hotel_id"));
                System.out.println("state: "+ result.getString("state"));
                System.out.println("city: "+ result.getString("city"));
                System.out.println("direction: "+ result.getString("direction"));
                System.out.println("number of rooms: "+ result.getInt("number_of_rooms"));
                System.out.println("size: "+ result.getString("size"));
                System.out.println("postal code: "+ result.getInt("postal_code"));
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Cant retrieve the hotels");
            System.out.println(e);
        }
    }

    public static void deleteHotel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the id of the 5hotel you want to delete");
        int hotel_id = Integer.parseInt(sc.nextLine());
        HotelDAO.deleteHotelDB(hotel_id);
        System.out.println("Hotel with the id "+ hotel_id +" was deleted succesfully");

    }

    public static void updateHotel(){
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        System.out.println("Enter the hotel_id");
        int hotel_id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the state");
        String state = sc.nextLine();
        System.out.println("Enter the city");
        String city = sc.nextLine();
        System.out.println("Enter the direction");
        String direction = sc.nextLine();
        System.out.println("Enter the letter for the size of the hotel (S small, M medium, B big)");
        String size = sc.nextLine();
        System.out.println("Enter the number of rooms");
        int number_of_rooms = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the postal code");
        int postal_code = Integer.parseInt(sc.nextLine());

        hotel.setHotel_id(hotel_id);
        hotel.setCity(city);
        hotel.setState(state);
        hotel.setDirection(direction);
        hotel.setNumberOfRooms(number_of_rooms);
        hotel.setSize(size);
        hotel.setPostal_code(postal_code);
        HotelDAO.updateHotelDB(hotel);
        System.out.println("Updated succesfully");
    }
}

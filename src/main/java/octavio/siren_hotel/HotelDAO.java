package octavio.siren_hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class HotelDAO {
    public static void addHotelDB(Hotel hotel) {
        Connection connection = MysqlConnection.get_connection();
        PreparedStatement ps = null;
        try {
            String query =
                    "INSERT INTO hotel (state, city, direction, size, number_of_rooms, postal_code)" +
                    " VALUES (?,?,?,?,?,?)";
            ps = connection.prepareStatement(query);
            ps.setString(1, hotel.getState());
            ps.setString(2, hotel.getCity());
            ps.setString(3, hotel.getDirection());
            ps.setString(4, hotel.getSize());
            ps.setInt(5, hotel.getNumberOfRooms());
            ps.setInt(6, hotel.getPostal_code());
            ps.executeUpdate();
            System.out.println("Hotel added correctly :D");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void showHotelsDB() {

    }

    public static void deleteHotelDB(int hotel_id) {

    }

    public static void updateHotelDB(Hotel hotel) {

    }
}

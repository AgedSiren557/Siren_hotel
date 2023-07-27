package octavio.siren_hotel;

public class Hotel {
    int hotel_id;
    String state;
    String city;
    String direction;
    String size;
    int numberOfRooms;
    int postal_code;

    public Hotel(){
    }
    
    public Hotel(int hotel_id, String state, String city, String direction, String size, int numberOfRooms,
            int postal_code) {
        this.hotel_id = hotel_id;
        this.state = state;
        this.city = city;
        this.direction = direction;
        this.size = size;
        this.numberOfRooms = numberOfRooms;
        this.postal_code = postal_code;
    }
    public int getHotel_id() {
        return hotel_id;
    }
    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public int getPostal_code() {
        return postal_code;
    }
    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

}

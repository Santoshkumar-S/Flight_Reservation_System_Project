public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] touristLocations;

    public TouristTicket(){
        this.hotelAddress = hotelAddress;
        this.touristLocations = touristLocations;
    }

    public String getHotelAddress(){
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress){
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocations(){
        return touristLocations;
    }

    public void setTouristLocations(String[] touristLocations){
        this.touristLocations = touristLocations;
    }

    public void addTouristLocations(String chooseLocations){

    }

    public void removeTouristLocations(String chooseLocations){

    }
}

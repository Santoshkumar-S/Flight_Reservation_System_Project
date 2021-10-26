public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] touristLocations;

    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNumber, float price, boolean isTicketCancelled, String hotelAddress, String[] touristLocations){
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNumber, price, isTicketCancelled);
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
        int index = -1;
        for(int i = 0; i<touristLocations.length; i++){
            if(touristLocations[i] == null){
                index = i;
                break;
            }
            if(index != i){
                touristLocations[index] = chooseLocations;
            }
        }

    }

    public void removeTouristLocations(String chooseLocations){
        int index = -1;
        for(int i = 0; i<touristLocations.length; i++){
            if(touristLocations[i].equals(chooseLocations)){
                index = i;
                break;
            }
        }
        if(index == -1){
            return;
        }
        for(int i = index; i<touristLocations.length-1; i++){
            touristLocations[i] = touristLocations[i+1];
        }
        touristLocations[touristLocations.length-1] = null;
    }
}

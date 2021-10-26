public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int numberOfSeatsBooked;

    public Flight(String flightNumber, String airline, int capacity, int numberOfSeatsBooked){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.numberOfSeatsBooked = numberOfSeatsBooked;
    }

    public String getFlightDetails(){
        return "Flight Details";
    }

    public boolean availableSeats(){
        return (numberOfSeatsBooked < capacity);
    }

    public void updateBookingCount(){
        numberOfSeatsBooked++;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber){
        this.flightNumber = flightNumber;
    }

    public String getAirline(){
        return airline;
    }

    public void setAirline(String airline){
        this.airline = airline;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getNumberOfSeatsBooked(){
        return numberOfSeatsBooked;
    }

    public void setNumberOfSeatsBooked(int numberOfSeatsBooked){
        this.numberOfSeatsBooked = numberOfSeatsBooked;
    }
}

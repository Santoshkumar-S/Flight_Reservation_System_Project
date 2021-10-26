public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private int numberOfSeatsBooked;

    public Flight(){
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
}

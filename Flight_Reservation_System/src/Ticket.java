import java.time.LocalDateTime;

public class Ticket{
    private String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDateTime;
    private Passenger passenger;
    private String seatNumber;
    private float price;
    private boolean isTicketCancelled;

    public String checkStatus(){
        return isTicketCancelled ? "Ticket Cancelled" : "Ticket Approved";
    }

    public int durationOfJourney(){
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) *24 + (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }
}

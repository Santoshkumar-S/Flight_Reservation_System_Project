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

    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNumber, float price, boolean isTicketCancelled){
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isTicketCancelled = isTicketCancelled;
    }

    public String checkStatus(){
        return isTicketCancelled ? "Ticket Cancelled" : "Ticket Approved";
    }

    public int durationOfJourney(){
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDateTime);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDateTime);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) *24 + (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public void cancelTicket(){
        isTicketCancelled = true;
    }

    public String getPnr(){
        return pnr;
    }

    public void setPnr(String pnr){
        this.pnr = pnr;
    }

    public String getFrom(){
        return from;
    }

    public void setFrom(String from){
        this.from = from;
    }

    public String getTo(){
        return to;
    }

    public void setTo(String to){
        this.to = to;
    }

    public Flight getFlight(){
        return flight;
    }

    public void setFlight(Flight flight){
        this.flight = flight;
    }

    public String getDepartureDateTime(){
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime){
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime(){
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime){
        this.arrivalDateTime = arrivalDateTime;
    }

    public Passenger getPassenger(){
        return passenger;
    }

    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
    }

    public String getSeatNumber(){
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber){
        this.seatNumber = seatNumber;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public boolean getIsTicketCancelled(){
        return isTicketCancelled;
    }

    public void setIsTicketCancelled(boolean isTicketCancelled){
        this.isTicketCancelled = isTicketCancelled;
    }
}

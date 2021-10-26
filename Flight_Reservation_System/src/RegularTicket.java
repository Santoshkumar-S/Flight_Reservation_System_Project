public class RegularTicket extends Ticket{
   private String specialServices;

   public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNumber, float price, boolean isTicketCancelled, String specialServices){
       super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNumber, price, isTicketCancelled);
       this.specialServices = specialServices;
   }

   public String getSpecialServices(){
       return specialServices;
   }

   public void setSpecialServices(String specialServices){
       this.specialServices = specialServices;
   }
}

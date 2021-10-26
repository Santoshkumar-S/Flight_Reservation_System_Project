public class Main {
    public static void main(String[] args){
        Ticket regularTicket = new RegularTicket("AR99XC", "CHENNAI", "NEW DELHI", null, "19SEP2021 07:05", "19SEP2021 09:55", null, "16 B", 2656, false, "Snacks and Water");

        Ticket touristTicket = new TouristTicket("MZXT1F", "MUMBAI", "DUBAI", null, "23JAN2021 15:10", "23JAN2021 18:20", null, "24 A", 29623, false, "Hotel Atlantis, Crescent Road, The Palm Jumeirah, Dubai, United Arab Emirates", new String []{"Burj Khalifa", "Dubai Frame", "Dubai Miracle Garden", "The Dubai Mall", "Global Village"});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

}


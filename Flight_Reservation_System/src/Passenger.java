import java.lang.String;
public class Passenger {
    private int id;
    private Address address;
    private Contact contact;

    private static class Address{
        String street;
        String city;
        String state;

        Address(){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact{
        String contactName;
        String contactPhoneNumber;
        String contactEmailId;

        Contact(){
            this.contactName = contactName;
            this.contactPhoneNumber = contactPhoneNumber;
            this.contactEmailId = contactEmailId;
        }
    }

    public Passenger(){
        this.id = id;
        this.address = new Address();
        this.contact = new Contact();
    }

    public String getContactDetails(){
        return "Name, PhoneNumber, EmailId";
    }

    public String getAddressDetails(){
        return "Street, City, State";
    }

    public void updateContactDetails(String contactDetails){

    }
}

import java.lang.String;
public class Passenger {
    private static int idCounter = 0;
    private int id;
    private Address address;
    private Contact contact;

    private static class Address{
        String street;
        String city;
        String state;

        Address(String street, String city, String state){
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private static class Contact{
        String contactName;
        String contactPhoneNumber;
        String contactEmailId;

        Contact(String contactName, String contactPhoneNumber, String contactEmailId){
            this.contactName = contactName;
            this.contactPhoneNumber = contactPhoneNumber;
            this.contactEmailId = contactEmailId;
        }
    }

    public Passenger(String street, String city, String state, String contactName, String contactPhoneNumber, String contactEmailId){
        this.id = ++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(contactName, contactPhoneNumber, contactEmailId);
    }

    public String getContactDetails(){
        return "Name: " + contact.contactName + ", PhoneNumber: " + contact.contactPhoneNumber + ", EmailId: " + contact.contactEmailId;
    }

    public String getAddressDetails(){
        return "Street: " + address.street + ", City: " + address.city + ", State: " + address.state;
    }

    public int getId(){
        return this.id;
    }

    public static int getPassengerCount() {
        return idCounter;
    }

}

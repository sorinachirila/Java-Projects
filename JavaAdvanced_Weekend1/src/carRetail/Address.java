package carRetail;

public class Address {

    //define members
    private String city;
    private String street;
    private Integer streetNumber;

    //constructor
    public Address(String city, String street, Integer streetNumber){
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    //setter city
    public void setCity(String city){
        this.city = city;
    }

    //getter city
    public String getCity(){
        return this.city;
    }

    //setter street
    public void setStreet(String street){
        this.street = street;
    }

    //getter street
    public String getStreet(){
        return this.street;
    }

    //setter streetNumber
    public void setStreetNumber(Integer streetNumber){
        this.streetNumber = streetNumber;
    }

    //getter streetNumber
    public Integer getStreetNumber(){
        return this.streetNumber;
    }

    @Override
    public String toString(){
       return "Address: " + city + " " + street + " " + streetNumber + "\n";
    }
}

package carRetail;

public class Owner {

    //define variables
    private Name name;
    private Address address;

    //constructor
    public Owner(Name name, Address address) {
        this.name = name;
        this.address = address;
    }

    //setter name
    public void setName(Name name){
        this.name = name;
    }

    //getter name
    public Name getName(){
        return this.name;
    }

    //setter address
    public void setAddress(Address address){
        this.address = address;
    }

    //getter address
    public Address getAddress(){
        return this.address;
    }

    @Override
    public String toString(){
        //return name.toString() + address.toString()
        return this.name + " " + this.address;
    }


}

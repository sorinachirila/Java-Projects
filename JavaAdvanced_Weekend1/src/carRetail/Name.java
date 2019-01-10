package carRetail;

public class Name {

    //define memebers
    String firstName;
    String middleName;
    String lastName;

    //constructor
    public Name(String firstName, String middleName, String lastName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    //setter firstName
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //getter firstName
    public String getFirstName(){
        return this.firstName;
    }

    //setter middleName
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }

    //getter middleName
    public String getMiddleName(){
        return this.middleName;
    }

    //setter lastName
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //getter lastName
    public String getLastName(){
        return this.lastName;
    }
    @Override
    public String toString() {
        return "Name: " + firstName + " " + middleName + " " + lastName + "\n";
    }
}

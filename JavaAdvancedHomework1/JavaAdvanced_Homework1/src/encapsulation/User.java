package encapsulation;

public class User {

    //declare necessary fields/members
     private final String username;
     private final String firstName;
     private final String lastName;

   //constructor with 3 paramaters
   public User(String username, String firstName, String lastName){
       this.username = username;
       this.firstName = firstName;
       this.lastName = lastName;
   }

    //getters, setters
    public String getUsername() {
        return username;
    }

    //combination: private final for fields + no setters = imutable object

//    public void setUsername(String username) {
//        this.username = username;
//    }
    public String getFirstName() {
        return firstName;
    }

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    public String getLastName() {
        return lastName;
    }

//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    //method to display the full name of the user
    public void generateDisplayName(){
        System.out.println("User: " + this.getUsername() + " has full name: " +  this.getFirstName() + this.getLastName());
    }






}

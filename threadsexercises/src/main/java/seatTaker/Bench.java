package seatTaker;

public class Bench {

    private int availableSeats;

    public Bench(int nrSeats){
        this.availableSeats = nrSeats;
    }

    public synchronized void takeASeat(String name){

        if(availableSeats>0){
            System.out.println(name + " taking a seat ");
            availableSeats--;
            System.out.println( name + " available seats left " + availableSeats);
        }
        else{
            System.out.println(name + " no seats available ");
        }

    }
   /* st2 available seats left 0
    st1 no seats available cu synchronized*/
}

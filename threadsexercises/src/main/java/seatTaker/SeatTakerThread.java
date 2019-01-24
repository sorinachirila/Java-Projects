package seatTaker;

public class SeatTakerThread extends  Thread{

    Bench bench;
    String name;

    public SeatTakerThread(Bench bench, String name){
        this.bench = bench;
        this.name = name;

    }
    public void run(){

        bench.takeASeat(name);
    }
}

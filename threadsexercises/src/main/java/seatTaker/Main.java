package seatTaker;

public class Main {
    public static void main(String[] args) {
        //creare Bench si spun cate locuri are
        Bench bench = new Bench(1);

        SeatTakerThread st1 = new SeatTakerThread(bench, "st1");
        SeatTakerThread st2 = new SeatTakerThread(bench, "st2");

        st1.start();
        st2.start();

//        st1 taking a seat
//        st1 available seats left 0
//        st2 taking a seat
//        st2 available seats left -1



    }


}

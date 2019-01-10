package swimbreathwalk;

public class Walker implements Walk, Breath {
    //3.e

    @Override
    public void breath() {
        System.out.println("The Walker is breathing fresh sea air.");
    }

    @Override
    public void walk() {
        System.out.println("The Walker is running in the forest!");
    }
}

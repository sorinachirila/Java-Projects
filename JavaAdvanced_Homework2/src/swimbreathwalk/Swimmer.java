package swimbreathwalk;

public class Swimmer implements Swim, Breath {
    //3.d
    @Override
    public void breath() {
        System.out.println("The Swimmer is breathing fresh air!!");
    }

    @Override
    public void swim() {
        System.out.println("The swimmer is swimming at stage 1 of the contest!");
    }
}

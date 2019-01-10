package swimbreathwalk;

public class Main {
    public static void main(String[] args) {
//        3.  A swimmer can swim and breath.
//        A walker can walk and breath.

        //3.f
        Swimmer AvramIancu = new Swimmer();
        AvramIancu.breath();//The Swimmer is breathing fresh air!!
        AvramIancu.swim();//The swimmer is swimming at stage 1 of the contest!

        System.out.println();

        Walker TibiUseriu = new Walker();
        TibiUseriu.breath();//The Walker is breathing fresh sea air.
        TibiUseriu.walk();//The Walker is running in the forest!

    }
}

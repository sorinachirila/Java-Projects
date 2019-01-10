package multime;

public class Main {
    public static void main(String[] args) {
        //1
        Multime m = new Multime(10);
        m.adauga(4);
        m.adauga(3);
        m.afisare();//4 3

        System.out.println();
        m.extrage(4);
        m.extrage(4);
        m.afisare(); //3

        System.out.println();

        m.adauga(9);
        m.adauga(2);
        m.adauga(2);
        m.afisare();//3 9 2

    }
}

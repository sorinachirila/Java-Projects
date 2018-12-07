package array;

public class Main {

    public static void main(String[] args) {

        MyArrayList myArrayList1 = new MyArrayList();
        myArrayList1.add(4);
        myArrayList1.add(7);
        myArrayList1.add(3);
        myArrayList1.add(9);
        myArrayList1.add(11);
        myArrayList1.add(21);
        myArrayList1.add(17);
        myArrayList1.add(17);
        myArrayList1.showArray();
        myArrayList1.add(17);
        myArrayList1.showArray();
        myArrayList1.add(2);
        myArrayList1.showArray();
        myArrayList1.add(17);
        myArrayList1.add(17);
        myArrayList1.add(17);
        myArrayList1.showArray();
        myArrayList1.add(17);
        myArrayList1.add(17);
        myArrayList1.add(17);
        myArrayList1.add(17);
        myArrayList1.add(17);
        myArrayList1.add(17);
        myArrayList1.add(32);
        myArrayList1.add(17);
        myArrayList1.showArray();
        myArrayList1.add(17);
        myArrayList1.add(34);
        myArrayList1.showArray();
        myArrayList1.add(17);
        myArrayList1.showArray();


        //17
        System.out.println(myArrayList1.getAt(7));
//        int exampleValue = myArrayList1.getAt(45);//returneaza NullPointerException, trebuie schimbat in tip de date complex Integer
//        System.out.println(exampleValue);
        //setAt testare metoda
        myArrayList1.setAt(7, 10);
        System.out.println(myArrayList1.getAt(7));
        //contains testare metoda
        boolean gasit = myArrayList1.contains(11);
        System.out.println(gasit);
        myArrayList1.showArray();
        int i = myArrayList1.indexOf(17);
        System.out.println(i);
        //remove testare metoda
        myArrayList1.remove(6);
        myArrayList1.showArray();
        //addAll testare metoda
        int [] v = new int[]{1, 2, 5, 8, 9, 90,91};
        myArrayList1.addAll(v);
        myArrayList1.showArray();

        myArrayList1.addAll(v);
        myArrayList1.showArray();

        myArrayList1.addAll(v);
        myArrayList1.showArray();

        myArrayList1.addAll(v);
        myArrayList1.showArray();
    }
}

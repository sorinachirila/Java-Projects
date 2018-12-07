public class MultiplicationTable {
    public static void main(String[] args) {
//        Tema1.E12.
//        Scrieti un program ce afiseaza tabla inmultirii in forma:
//        1 x 1 = 1
//        1 x 2 = 2
//                .
//.
//        1 x 9 = 9
//
//        2 x 1 = 1
//                .
//.
//        10 x 10 = 100
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i);
                System.out.print("X");
                System.out.print(j);
                System.out.print(" = ");
                System.out.print(i*j);
                System.out.println();
            }
            System.out.println();
        }

    }
}

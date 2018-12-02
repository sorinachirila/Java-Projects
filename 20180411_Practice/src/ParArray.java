public class ParArray {

    public static void main(String[] args) {



        int[] a = new int[]{3, 9, 6, 4, 11, 12, 8};
        //afisare numere pare

        for (int i = 0; i < a.length ; i++){

            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

        //afisare invers pentru numere pare
        for (int i = a.length-1; i >=0 ; i--){

            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        //minSum


//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//            pos = i;
//            //compar suma
//            if(sum > minSum){
//                System.out.println("suma este: " + sum + "pozitia este: " + pos);
//                //afisez valorile pana
//                for (int j = 0; j <= pos ; j++) {
//                    System.out.println(a[j] + " ");
//                }
//                break;
//            }
//
//
//        }
        //afisare elemente pentru care suma > minSum
        //declarare variabile necesare
        int minSum = 21;
        int sum = 0;
        int i = 0;
       //int pos;

        while(sum <= minSum && i < a.length){
            //suma elemente array
            sum += a[i];

            if(i != 0){
                System.out.print(" + ");
            }
            //afisare elemente suma
            System.out.print(a[i]);

            //incrementare
            i += 1;

        }
        System.out.print(" = " + sum );
        System.out.println();

        //afisare valori array, pe fiecare linie
        for (i = 0; i < a.length ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();

        }
        System.out.println(7+3+" = "+ 7 + " + " + 3); //10 = 7 + 3
    }


}






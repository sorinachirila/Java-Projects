public class TwoArrays {
    public static void main(String[] args) {
        //Tema2.E3.
        // Realizati un proiect Java ce primeste 2 array-uri de tip int
        // Parcurgeti elementele din primul array si afisati indexul primei aparitii a elementului in al doilea array.
        // Primul index de accesare a elementelor dintr-un array este 0, iar ultimul este n - 1 , unde n este dimensunea array-ului.
        // Cum se schimba rezolvarea problemei daca dorim sa afisam indexul ultimei prezente a elementui in al doilea array?
        // parcurgand invers array-ul 2

//        exemplu:
//        int[] a = new int[]{56, 93, 12, 31};
//        int[] b = new int[]{17, 37, 12, 31, 48, 12, 93, 5, 63, 68};
//        output:
//        56 nu este prezent
//        93 la index 6
//        12 la index 2
//        31 la index 3

        //datele din array sunt furnizate
        int[] a = new int[]{56, 93, 12, 31};
        int[] b = new int[]{17, 37, 12, 31, 48, 12, 93, 5, 63, 68};

        //declar si initializez variabile necesare
        //dimensiunea celor doi vectori
        int m = b.length;
        int n = a.length;
       // int iter = 0;

//            while(iter < n) {
//                for (int i = 0; i < m ; i++) {
//                    if(a[iter] == b[i]){
//
//                        System.out.println(a[iter] + " la index " + i);
//                    }else{
//                        System.out.println(a[iter] + " nu este prezent ");
//                    }
//                    //incrementare numar de iteratii, pentru array-ul a
//                    iter++;
//                }
//
//
//            }
            //parcurgere pentru cei doi vectori
            for (int i = 0; i < a.length ; i++) {
                int j = 0; boolean found = false;
                while(j < b.length && !found){
                    //testare egalitate elemente intre cei doi vectori
                    if(a[i] == b[j]){
                            found = true;
                    }else{
                        j++;
                    }

                }
                if(found){
                    System.out.println(a[i] + " la index " + j);

                }else{
                    System.out.println(a[i] + " nu este prezent ");
                }
            }




    }
}


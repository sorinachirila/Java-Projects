package array;

public class MyArrayList {

    static int DEFAULT_SEGMENT_LENGTH = 10;

    int[] values;//length meu intern

    int length; //lungime virtuala

    //constructor
    MyArrayList() {
        this.values = new int[DEFAULT_SEGMENT_LENGTH];
        this.length = 0;
    }

    void increaseSize() {
        //1.create new array
        int[] newValues = new int[values.length + DEFAULT_SEGMENT_LENGTH];
        //2.copy values
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        //3.transfer reference - atribuirea
        values = newValues; //schimba referinta

    }

    void add(int value) {
        //1. test if we are at max capacity
        if (length == values.length) {
            increaseSize();
        }
        //2. set value
        values[length] = value;
        //3. increase current length
        length++;
    }

    void showArray() {

        System.out.println(length + " / " + values.length);
        for (int i = 0; i < length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    Integer getAt(int index){
        if(index >= 0 && index < length){
            return values[index];
        }
        return null;
    }
//    3.Adaugati o metoda in clasa MyArrayList, setAt(int index, int value). Rolul metodei
//    este sa inlocuiasca valoarea de la un anumit index.
//    Daca indexul este mai mare sau egal cu lungimea curenta
//    ( repet: pentru un array de dimensiune length avem indecsi 0 .. length -1 ).

    void setAt(int index, int value){
        if(index > length){
            return;
        }else{
            values[index] = value;
        }
    }
    //4.Adaugati o metoda in clasa MyArrayList , boolean contains(int valueWeSearch).
//    Rolul metodei este sa determine daca o anumita valoare (adica valueWeSearch)
//    exista in array-ul nostru. Metoda va returna true daca valoarea exista sau false daca valoarea nu exista.
    boolean contains(int valueWeSearch){
        boolean gasit = false;
        for (int i = 0; i < values.length; i++) {
            if(values[i] == valueWeSearch){
                gasit = true;
            }
        }
        return gasit;
    }

    // 5.Adaugati o metoda in clasa MyArrayList , Integer indexOf(int valueWeSearch).
//    Rolul metodei este sa returneze indexul primei aparitii a valorii trimise ca parametru (adica valueWeSearch)
//    in array-ul nostru de valori, adica values. Daca valoarea nu exista metoda trebuie sa returneze null.
    Integer indexOf(int valueWeSearch){
        for (int i = 0; i < values.length; i++) {
            if(values[i] == valueWeSearch){
                return i;
            }
        }
        return null;
    }

    // 6.Adaugati o metoda in clasa MyArrayList , void addAll(int[] valuesToAdd).
//    Rolul metodei este sa adauge toate elementele din array-ul trimis ca parametru valuesToAdd in array-ul nostru intern values.
    void addAll(int[] valuesToAdd){
        //1. test if we are at max capacity
        if ((length == values.length) || (length + valuesToAdd.length >= values.length)) {
            increaseSize();
        }
        //2. set value

        for (int j = 0; j < valuesToAdd.length; j++) {
            values[length] = valuesToAdd[j];
            length++;
        }

    }

//    7.Adaugati o metoda in clasa MyArrayList, void remove(int indexToRemove).
//    Scopul metodei este sa elimine din array elementul de la indexul indexToRemove.
    void remove(int indexToRemove){
        if(indexToRemove >= 0 && indexToRemove < length){
            for (int i = indexToRemove; i < length - 1; i++) {
                values[i] = values[i+1];
            }
            length--;
        }
    }

}

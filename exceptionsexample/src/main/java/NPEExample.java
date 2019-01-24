public class NPEExample {

    public static void main(String[] args) {


        //Null Pointer Exception
        Integer a = null;
        try {
            a.toString();  //java.lang.NullPointerException
        }catch (NullPointerException ex){
            System.out.println("Object is null!");
        }
    }
}

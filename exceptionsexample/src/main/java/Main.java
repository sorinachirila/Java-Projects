public class Main {

    public static void main(String[] args) throws CustomExc { //CustomExc
        IOService io = new IOService();
        io.doLogic(); //java.lang.RuntimeException: Exception from doLogic
       /* try {
            io.doLogic();
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }*/
    }
}

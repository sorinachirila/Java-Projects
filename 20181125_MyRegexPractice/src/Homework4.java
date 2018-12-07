public class Homework4 {
    public static void main(String[] args) {
        String [] myStringsArray = new String[]{"Hello World", "Hey", "How are you?"};

        System.out.println(myStringsArray[0].matches("Hello World")); //true
        System.out.println(myStringsArray[1].matches("[^a-zA-Z]*")); //false
        System.out.println(myStringsArray[2].matches("[a-zA-Z]+")); //false
    }
}

/*
4.
        https://dzone.com/articles/random-number-generation-in-java
        Use the class `Random` from the java library to generate random numbers.
        Create a simple project ( a couple of lines ) that:
        generates a random number
        generates a random number between 0 - 49
        generates a random number between 10 - 20
        How did you enforce lower and upper boundaries to the random generated value ?
*/
import java.util.Random;

public class NumbersRandom {
    public static void main(String[] args) {
/*        Homework3.E4.
        https://dzone.com/articles/random-number-generation-in-java
        Use the class `Random` from the java library to generate random numbers.
        Create a simple project ( a couple of lines ) that:
        generates a random number
        generates a random number between 0 - 49
        generates a random number between 10 - 20
        How did you enforce lower and upper boundaries to the random generated value ?*/

        //generate a random number
        Random random = new Random();
        System.out.println(random.nextInt()); ///1024142087
        System.out.println(random.nextInt(50)); //4
       /* generates a random number between 10 - 20
        r.nextInt((max - min) + 1) + min;*/
        int max = 20;
        int min = 10;
        System.out.println(random.nextInt((max - min) + 1) + min);//bound 21

        /* Homework3.E5.
        How would you generate a random string of length 8 containing only lowercase letters ?
        Use stuff learned at ex.4*/
        int n = 8;
        String lowercaseCharacters = "abcdefghijklmnopqrstuvxyz";
        char[] randomCharacter = new char[n];
        for (int i = 0; i < n; i++) {
            // generate a random number between
            // 0 to lowercaseCharacters  variable length
            int index = (int)(lowercaseCharacters.length() * Math.random());
            /*Math.random() * ( max - min ) returns a value in the range [0, max – min] where max is excluded.
            For example, if you want [5,10], you need to
            cover 5 integer values so you can use Math.random()*5.
            This would return a value in the range [0,5], where 5 is not included.*/
            //add Character one by one, to randomCharacter
            randomCharacter[i] = lowercaseCharacters.charAt(index);
        }
        for (int i = 0; i < randomCharacter.length; i++) {
            System.out.print(randomCharacter[i]);
        }

        }


    }
   /* The nextInt() method of Random accepts
    a bound integer and returns a random integer from 0 (inclusive) to the specified bound (exclusive).
    The nextFloat() and nextDouble() methods allow generating float and double values between 0.0 and 1.0.
*/

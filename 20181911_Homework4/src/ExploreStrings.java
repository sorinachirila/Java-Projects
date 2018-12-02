public class ExploreStrings {
    public static void main(String[] args) {
/*      Homework3.E1.
        What are the String methods we discussed about in class ?
        Create a simple Main with a main and do at least one example for each method.*/


        //explore String methods
        String s1 = "hello";
        String s2 = "hello";

        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2));//true

        // compare returns true only on equals method
        String s3 = "he" + new String("llo");
        System.out.println(s1 == s3); //false
        System.out.println(s1.equals(s3));

        String myHello = " Hello world";
        System.out.println(myHello.toLowerCase()); //hello world
        System.out.println(myHello.toUpperCase());  //HELLO WORLD
        //pentru modificare trebuie facuta atribuirea
        //to see modification, you need to do the assignment
        System.out.println(myHello);// Hello world


        String randomNames = "Sorina zambet.soare@gmail.com Georgiana ";
        System.out.println(randomNames.startsWith("abc")); //false
        System.out.println(randomNames.substring(0, 3)); //Sor
        System.out.println(randomNames.substring(randomNames.lastIndexOf("."), randomNames.length())); //.com Georgiana

        for (int i = 0; i < randomNames.length(); i++) {
            System.out.println(i + " " + randomNames.charAt(i));
        }

        String[] split = randomNames.split("@");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);

        }
        System.out.println(randomNames.length()); //42
        System.out.println(randomNames.charAt(0));//S
        System.out.println(randomNames.charAt(1));//o
        System.out.println(randomNames.charAt(randomNames.length() - 1));// ''

        System.out.println(randomNames.indexOf("!"));//-1
        System.out.println(randomNames.indexOf(".com"));//index 217 - where it starts
        System.out.println(randomNames.lastIndexOf("a"));//40
        System.out.println(randomNames.contains("@")); //true
        System.out.println(randomNames.contains("!")); //false
        System.out.println(randomNames.endsWith("ana ")); //true

        //replaces only the first aparition
        System.out.println(randomNames.replace("gmail.com", "yahoo.com"));//Sorina chirila.sorina@yahoo.com Georgiana
        System.out.println(randomNames); //Sorina zambet.soare@gmail.com Georgiana unchanged
        System.out.println(randomNames.replaceAll("o", "09"));
        System.out.println(randomNames.trim().toUpperCase().replaceAll(" ", ","));//SORINA,ZAMBET.SOARE@GMAIL.COM,GEORGIANA

        System.out.println(s1.concat(",".concat(randomNames))); //hello,Sorina zambet.soare@gmail.com Georgiana
        System.out.println(s1);//hello
        System.out.println(s1.isEmpty()); //false
        String s1Modified = s1.concat(",".concat(randomNames));
        System.out.println(s1Modified); //hello,Sorina zambet.soare@gmail.com Georgiana


    }


}

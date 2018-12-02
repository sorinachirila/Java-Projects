public class CastPractice {
    public static void main(String[] args) {
        //iau ca int 7
        //vreau sa fac conversie la byte
        //byte b1 = 7;

        byte b2 = (byte) 56;
        System.out.println(b2);

        short s1 = (short) 35000; //atentie int catre short, nu e bine  -30536
        System.out.println(s1); // -30536

        short s2 = b2; //good
        System.out.println(s2);

        int i1 = s2;//good
        System.out.println(i1);

        int i2 = 40000;
        s2 = (short) i2;
        System.out.println(s2); ///-25536

        long l1 = 70000000000L;
        System.out.println(l1);//70000000000


        long l2 = 70_000_000_000L;
        System.out.println(l2); //70000000000

        float f1 = (float) 3.5;//double e tipul implicit in Java
        System.out.println(f1);//3.5

        double d1 = 3.5D;
        System.out.println(d1);//3.5

        double d2 = 7D;
        System.out.println(d2); //7.0

        double d3 = 3147483647D;//3.147483647E9
        System.out.println(d3);

        char c1 = 'a';//a
        System.out.println(c1);

        int i3 = (int) c1;
        System.out.println(i3); //97

        char c2 = '\u0041';
        System.out.println(c2); //A

        System.out.println("showing all bytes");
        for (byte b = -128; b <= 127; b++){
            System.out.print(b + " ");
            if (b == 127){
                break;
            }
        }

        //for prin caractere
        System.out.println("showing all chars");
        char cStart = '\u0000';
        char cEnd = '\uFFFF';

        for (char ci = cStart; ci <= cEnd; ci++){
            System.out.print(ci + " ");
            if (ci % 16 == 0) {
                System.out.println();
            }
            if (ci == cEnd){
                break;
            }
        }

    }
}

public class Main {

    public static void main(String[] args) {

        //instantiate a Person
        Person p = new Person();

        //display first person
        p.display();
        p.displayName();
        p.displayName("Mr ");

        //second person with specific state display
        Person p2 = new Person("Vasile", "12345");
        p2.display();
        p2.displayName("Mr ");
        p2.displayName(1);

        //return current object
        Person p3 = p2.returnInstance();
        p3.display();

        Person p4 = new Person();

        Integer sum = 0;
        //definim inainte de for si poate fi vizibil
        //int i = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + 1;
        }
        // s-a terminat durata de viata pentru i, vizibil doar intre acolade
        //i = i + 1;
        System.out.println(sum);

        //3 - persoane
        System.out.println(Person.count);
        //System.out.println(p.count);

    }
}


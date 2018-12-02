public class MyClass {

    public static void main(String[] args) {
/*
        Tutorial based on:
        https://www.youtube.com/watch?v=ZHLdVRXIuC8
        https://www.youtube.com/watch?v=0Jc_rT7t1W8
        https://www.youtube.com/watch?v=OHw2t8BaIUg
        https://www.youtube.com/watch?v=0NPR8GFHNmE
        https://www.youtube.com/watch?v=cwtBfVFuiBo
*/


        Student student = new Student(); //student is an instance of class Student -> object, instance

       // student.age = 29;
        student.setAge(29);
       //student.id = 123456;
        student.id = 123456;
        //student.name = "Sorina";
        student.setName("Sorina");

        System.out.println("Studentul " + student.getId() + "  are varsta " + student.getAge() + " si numele " + student.getName());

        Student student2 = new Student(); //student2 is an instance of class Student -> object, instance

        //student2.age = 30;
        student2.setAge(30);
       // student2.id = 12345;
        student2.id = 12345;
        //student2.name = "Georgiana";
        student2.setName("Georgiana");
        System.out.println("Studentul " + student2.getId() + "  are varsta " + student2.getAge() + " si numele " + student2.getName());
    }
}

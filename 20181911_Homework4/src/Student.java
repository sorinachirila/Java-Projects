
public class Student{
    /*
        Tutorial based on:
        https://www.youtube.com/watch?v=ZHLdVRXIuC8
        https://www.youtube.com/watch?v=0Jc_rT7t1W8
        https://www.youtube.com/watch?v=OHw2t8BaIUg
        https://www.youtube.com/watch?v=0NPR8GFHNmE
        https://www.youtube.com/watch?v=cwtBfVFuiBo
*/
    int id;
    String name;
    int age;

/*    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //encapsulation of a variabile, when we have such kind of methods
    //protectsthe data when someone wants to modify it
}

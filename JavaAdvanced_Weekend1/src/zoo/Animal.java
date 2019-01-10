package zoo;

public abstract class Animal {

    //define members variables
    private Integer age;
    private String color;

    //define constructor
    public Animal(Integer age, String color){
        this.age = age;
        this.color = color;
    }

    public abstract void move();
    public abstract void sound();
    public abstract Integer healthCheck();

    //setter age
    public void setAge(int age){
        this.age = age;
    }

    //getter age
    public int getAge(){
        return this.age;
    }
    //setter color
    public void setColor(String color){
        this.color = color;
    }

    //getter color
    public String getColor(){
        return this.color;
    }

//    public void move(){
//        System.out.println("Animal is moving...");
//    }



    @Override
    public String toString(){
       return "Age: " + age + " Color: " + color;
    }


}

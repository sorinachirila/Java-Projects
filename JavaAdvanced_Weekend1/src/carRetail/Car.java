package carRetail;

public class Car {
    //incapsulation

    //define the variables
    private String model;
    private String color;
    private Integer price;

    //constructor
    public Car(String model, String color, Integer price){
        this.model = model;
        //color uppercase
        this.color = color.toUpperCase();
        this.price = price;
    }

    //setter model
    public void setModel(String model){
        this.model = model;
    }

    //getter model
    public String getModel(){
        return this.model;
    }

    //setter color
    public void setColor(String color){
        //color uppercase
        this.color = color.toUpperCase();
    }

    //getter color
    public String getColor(){
        return this.color;
    }

    //setter price
    public void setPrice(Integer price){
        this.price = price;
    }

    //getter color
    public Integer getPrice(){
        return this.price;
    }


}

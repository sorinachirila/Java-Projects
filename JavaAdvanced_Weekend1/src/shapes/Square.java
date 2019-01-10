package shapes;

public class Square implements Shape{

    //define variables
    private Double l;

    //constructor
    public Square(Double l){
        this.l = l;
    }

    @Override
    public Double calculatePerimeter() {
        return 4 * l;
    }

    @Override
    public Double calculateArea() {
        return  l * l;
    }
}

package shapes;

public class Circle implements Shape{

    private static Double r;

    //constructor
    public Circle(Double r){
        this.r = r;
    }

    public Double getR() {
        return r;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public Double calculateArea() {
        return Math.PI * r * r;
    }
}

package shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(1d));
        shapeList.add(new Circle(2d));
        shapeList.add(new Circle(3d));
        shapeList.add(new Circle(4d));
        shapeList.add(new Circle(0d));

        shapeList.add(new Square(1d));
        shapeList.add(new Square(2d));
        shapeList.add(new Square(3d));
        shapeList.add(new Square(4d));

        //metoda de clasa
        Main m = new Main();
        System.out.println("Maximum  perimeter is: " + m.findMaxPerimeter(shapeList));
        System.out.println("Maximum  area is: " + m.findMaxArea(shapeList));

        //
        Circle c1 = new Circle(1d);
        Circle c2 = new Circle(2d);
        System.out.println(c1.getR());
        System.out.println(c2.getR());

    }

    //sau fac aceasta metoda statica
    //metoda de obiect, fara static
    public Double findMaxPerimeter(List<Shape> shapes){
        Double max = 0d;
        for(Shape s: shapes){
            if (max < s.calculatePerimeter()){
                max = s.calculatePerimeter();
            }
        }
        return max;
    }

    public Double findMaxArea(List<Shape> shapes){
        Double max = 0d;
        for(Shape s: shapes){
            if (max < s.calculateArea()){
                max = s.calculateArea();
            }
        }
        return max;
    }

}

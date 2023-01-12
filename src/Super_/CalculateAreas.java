package Super_;

public class CalculateAreas {
    public static void main(String arg[]) {
        Circle circle = new Circle();
        circle.radius = 7.5;
        System.out.println("Area of circle is " + circle.getArea());
    }
}
abstract class Shape {
    abstract double getArea();
}
class Circle extends Shape {
    double radius;
    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }
}
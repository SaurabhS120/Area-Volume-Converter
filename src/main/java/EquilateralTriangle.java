import java.math.*;
public class EquilateralTriangle implements Shape{
    double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }
    public double area() {
        return ((Math.sqrt(3))/4)*side*side;
    }
}

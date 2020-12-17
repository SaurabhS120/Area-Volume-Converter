public class Triangle implements Shape{
    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    public double area() {
        return (height*base)/2;
    }
}

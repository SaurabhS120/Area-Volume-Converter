public class Cone implements ThreeDShape {
    double height;
    double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    public double area() {
        return (pi*radius*radius)+pi*radius*height;
    }
    public double volume() {
        return 1/3*pi*radius*radius*height;
    }
}

public class Cylinder implements ThreeDShape{
    double height;
    double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    public double area(){
        return pi*radius*height;
    }
    public double volume() {
        return (2*pi*radius*radius)+(2*pi*radius*height);
    }
}

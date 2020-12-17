public class Ellipse implements Shape{
    double major_axis;
    double minor_axis;

    public Ellipse(double major_axis, double minor_axis) {
        this.major_axis = major_axis;
        this.minor_axis = minor_axis;
    }
    public double area(){
        return pi*(major_axis/2)*(minor_axis/2);
    }
}

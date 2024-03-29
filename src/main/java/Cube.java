
public class Cube extends Square implements ThreeDShape {

	private double side, area, volume;
	
	public Cube(double side) {
		this.side = side;
		this.area = side * side * 6;
		this.volume = side * side * side;
	}
	
	public double volume() {
		return this.volume;
	}
	
	public double area() {
		return this.area;

	}
}

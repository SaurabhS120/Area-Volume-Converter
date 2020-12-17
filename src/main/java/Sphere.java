
public class Sphere extends Circle implements ThreeDShape {

	private double volume, pi, area;
		
	public Sphere(double radius) {
		this.pi = 3.14;
		this.area = 4.0 * pi * radius * radius;
		this.volume = 4.0/3.0  * pi * radius * radius * radius; 
	}

	public double volume() {
		return this.volume;
	}
	
	public double area() {
		return this.area;

	}
}

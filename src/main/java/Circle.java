
public class Circle implements Shape {
	
	private double radius, area;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.area = pi * radius * radius;
	}

	public double area() {
		return this.area;
		
		
	
	}

}

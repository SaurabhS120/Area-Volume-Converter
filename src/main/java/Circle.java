
public class Circle extends Shape {
	
	private double radius, pi, area;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.pi = 3.14;
		this.area = pi * radius * radius;
	}

	public double area() {
		return this.area;
		
		
	
	}

}

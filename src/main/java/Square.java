
public class Square implements Shape {
	private double width, height, area;
	
	public Square() {
		
	}
	
	public Square(double width, double height) {
		this.width = width;
		this.height = height;
		this.area = width * height;
	}
	
	public double area() {
		return this.area;
		
		
	}
	

}

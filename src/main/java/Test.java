
public class Test {
	
	public static void main(String[] args) {
		
		Shape[] array = new Shape[2];
		
		double width = 9;
		double height = 10;
		double radius = 5;
		int side = 5;
		
		Shape square = new Square(width, height);
		array[0] = square;
		System.out.println("Area of Square: " + array[0].area());
		

		Shape circle = new Circle(radius);
		array[1] = circle;
		System.out.println("Area of Circle: " + array[1].area());
		
		
		ThreeDShape[] array2 = new ThreeDShape[2];
		ThreeDShape sphere = new Sphere(radius);
		array2[0] = sphere;
		System.out.println("Volume of Sphere: " + array2[0].volume());
		
		array2[1] = sphere;
		System.out.println("Surface area of Sphere: " + array2[1].area());
		
		ThreeDShape[] array3 = new ThreeDShape[2];
		ThreeDShape cube = new Cube(side);
		array3[0] = cube;
		System.out.println("Volume of cube: " + array3[0].volume());
		
		array3[1] = cube;
		System.out.println("Surface area of cube " + array3[1].area());
	
		

	}
	
}


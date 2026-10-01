
public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(5);
		circle.Area();
		System.out.println();
		
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(15.5);
		rectangle.setBreadth(5.5);
		rectangle.Area();
		
		System.out.println();
		Sphere sphere = new Sphere();
		sphere.setRadius(5);
		sphere.Area();
		sphere.volume();
		
		System.out.println();
		Cube cube = new Cube();
		cube.setSide(25);
		cube.Area();
		cube.volume();

	}
}

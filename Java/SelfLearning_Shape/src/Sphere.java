
public class Sphere extends ThreeDShape {
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void Area() {
		double area = 4 * PI * radius * radius; 
		System.out.println("Area of cube is: "+area);
	}
	@Override
	public void volume() {
		double volume = 4/3*(PI * radius * radius);
		System.out.println("Volume of cube is: "+volume);
	}

}

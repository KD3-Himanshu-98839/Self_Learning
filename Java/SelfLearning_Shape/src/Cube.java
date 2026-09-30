
public class Cube extends ThreeDShape {
	private int side;
	
	public void setSide(int side) {
		this.side = side;
	}
	@Override
	public void Area() {
		double area = 6 * side; 
		System.out.println("Area of cube is: "+area);
	}
	@Override
	public void volume() {
		double volume = side * side * side;
		System.out.println("Volume of cube is: "+volume);
	}

}


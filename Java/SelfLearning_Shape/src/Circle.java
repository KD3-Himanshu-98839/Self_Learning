
public class Circle extends TwoDShape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void Area() {

		double area = PI * radius * radius;
		System.out.println("Area of circle is: "+ area);
	}

}

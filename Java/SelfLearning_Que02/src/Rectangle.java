
public class Rectangle extends TwoDShape {

	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public void Area() {
		double area = length * breadth;
		System.out.println("Area of Rectangel is: "+area);
	}

}

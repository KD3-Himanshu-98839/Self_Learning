package comparator;
public class Student {
	private int rollNo;
	private String name;
	private String city;
	private double marks;
	public Student(int rollNo, String name, String address, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = address;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String address) {
		this.city = address;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return String.format("%-10d %-20s %-20s %-20f", rollNo,name,city,marks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return this.rollNo == other.rollNo;
	}

}

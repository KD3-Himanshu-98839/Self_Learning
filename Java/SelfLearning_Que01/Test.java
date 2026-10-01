package SelfLearning_Que01;

public class Test {
	public static void main(String[] args) {


		Student s1 = new Student(101, "Himanshu", "Pune");

		// Shallow copy
		Student s2 = new Student(s1);

		// Deep copy
		Student s3 = s1.deepCopy(s1);

		s1.address = "Mumbai";

		System.out.println("Original:");
		s1.display();

		System.out.println("Shallow Copy:");
		s2.display();

		System.out.println("Deep Copy:");
		s3.display();
	}
}
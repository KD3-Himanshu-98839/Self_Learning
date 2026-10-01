package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> listOfStudents = new ArrayList<>();

		Student s1 = new Student(05, "Himanshu Vinchurkar", "Amravati", 81);
		Student s2 = new Student(53, "Siddharth Sathe", "Sangli", 66);
		Student s3 = new Student(23, "Aarav Joshi", "Nagpur", 45);
		Student s4 = new Student(83, "Riya Shinde", "Aurangabad", 45);
		Student s5 = new Student(81, "Vikram Kadam", "Amravati", 81);
		Student s6 = new Student(30, "Isha Chavan", "Akola", 91);
		Student s7 = new Student(57, "Gaurav Bhosale", "Sangli", 66);
		Student s8 = new Student(17, "Shruti Kale", "Jalgaon", 91);
		Student s9 = new Student(10, "Rahul Mane", "Nagpur", 52);
		Student s10 = new Student(99, "Yash Tambe", "Thane", 68);

		Collections.addAll(listOfStudents, s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);

		Comparator< Student> comparator = new CombineSort();
		listOfStudents.sort(comparator);
		for (Student student : listOfStudents) {
			System.out.println(student);
		}
	}

}

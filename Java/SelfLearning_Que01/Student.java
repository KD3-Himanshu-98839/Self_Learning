package SelfLearning_Que01;


class Student {
	int rollNo;
	String name;
	String address;

	Student() {
	}

	Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	Student(Student s) {
		this.rollNo = s.rollNo;
		this.name = s.name;
		this.address = s.address;
	}

	Student deepCopy(Student s) {
		return new Student(s.rollNo, s.name, s.address);
	}

	void display() {
		System.out.println(rollNo + " " + name + " " + address);
	}
}


package comparator;

import java.util.Comparator;

public class CombineSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getCity()!=o2.getCity()) {
			
			return o2.getCity().compareTo(o1.getCity());
		}
		else if(o1.getMarks()!=o2.getMarks()){
			
			return Double.compare(o2.getMarks(),o1.getMarks());
		}
		else {
			
			return o2.getName().compareTo(o1.getName());
		}
	}

}

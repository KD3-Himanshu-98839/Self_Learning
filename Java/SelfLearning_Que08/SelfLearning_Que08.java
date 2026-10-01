package SelfLearning_Que08;

import java.util.stream.Stream;

public class SelfLearning_Que08 {
	
	public static void main(String[] args) {
		Stream.of(10)
		.map(n-> {
			int fact = 1;
			for (int i = 1; i <= 10; i++) 
				fact = fact * i;
			return fact;
		})
		.forEach(n-> System.out.println(n));
	}

}

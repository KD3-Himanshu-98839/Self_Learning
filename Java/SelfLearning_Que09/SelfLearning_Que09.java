package SelfLearning_Que09;

import java.util.stream.Stream;

public class SelfLearning_Que09 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		Stream.of(a)
		.map(n -> a+b)
		.forEach(e-> System.out.println("Sum of integers: "+e));
	}

}

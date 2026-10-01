package SelfLearning_Que10;

import java.util.stream.IntStream;

public class SelfLearning_Que10 {

	public static void main(String[] args) {
		 IntStream stream = IntStream.rangeClosed(1, 10);

	        System.out.println("Sum = " + stream.sum());

	        IntStream.rangeClosed(1, 10)
	                .summaryStatistics();
	}

}

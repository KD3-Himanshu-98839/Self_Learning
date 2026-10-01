package SelfLearning_Que11;


public class SelfLearning_Que11_Generic {


	public static <T extends Number> T minimum(T[] arr) {
		T min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].doubleValue() < min.doubleValue()) {
				min = arr[i];
			}
		}
		

		return min;
	}
	
	public static <T> void main(String[] args) {
		Integer[] arr = {1,2,5,7,3,9,5};
		System.out.println("Minimum is: "+minimum(arr));

	}

}

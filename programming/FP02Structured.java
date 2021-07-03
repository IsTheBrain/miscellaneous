package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 23, 434, 321, 21, 2, 3);

		int sum = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		//how to loop and store
		int sum = 0;
		for (int number:numbers){
			sum+= number;
		}
		
		return sum;
	}


}

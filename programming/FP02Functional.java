package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 23, 434, 321, 21, 2, 3);

		int sum = addListFunctional(numbers);
		System.out.println(sum);
	}

	private static int sum(int aggregate, int number) {
		// TODO Auto-generated method stub
		System.out.println(aggregate + " " + number);
		return aggregate + number;
	}

	private static int addListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		//return numbers.stream()
				// combine in one result
				// start from 0 and sum the numbers thanks to the sum function
				// reduce operation
		//		.reduce(0, FP02Functional::sum);
		
		//lambda expression
//		return numbers.stream()
//					.reduce(0,  (x,y)->y);
		
		//lambda expression
		return numbers.stream()
					.reduce(Integer.MIN_VALUE,  (x,y)->x>y ? x:y);
		
		//or easier
		//return numbers.stream()
		//		.reduce(0,  Integer::sum);
	}

}

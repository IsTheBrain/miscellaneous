package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbersInListStructured(Arrays.asList(12, 23, 434, 321, 21, 2, 3));
		System.out.println("\nEven Number\n");
		printEvenNumbersInListStructured(Arrays.asList(12, 23, 434, 321, 21, 2, 3));
	}

	private static void printAllNumbersInListStructured(List<Integer> asList) {
		// How to loop numbers?

		for (Integer integer : asList) {
			System.out.println(integer);
		}
	}

	private static void printEvenNumbersInListStructured(List<Integer> asList) {
		// TODO Auto-generated method stub
		for (Integer integer : asList) {
			if (integer % 2 == 0) {
				System.out.println(integer);
			}
		}
	}
}

package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		printAllNumbersInListFunctional(Arrays.asList(12, 23, 434, 321, 21, 2, 3));
		System.out.println("\nEven Number\n");
		printEvenNumbersInListFunctional(Arrays.asList(12, 23, 434, 321, 21, 2, 3));
	}

	private static void printEvenNumbersInListFunctional(List<Integer> asList) {
		// TODO Auto-generated method stub

		asList.stream().filter(FP01Functional::isEven) // Allow only even number
				.forEach(System.out::println); // method Reference

		System.out.println("\nWith Lambda Expression\n");
		
		asList.stream().filter(number -> number % 2 == 0) // Allow only even number
				.forEach(System.out::println); // method Reference
	}

	private static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	private static void print(Integer number) {
		// TODO Auto-generated method stub
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> asList) {
		// having a sequence of elements
		// method reference
		// What to do?

		asList.stream().forEach(FP01Functional::print);
		// System.out.println("second Approach");
		// Second possibility
		// asList.stream().forEach(System.out::println);
	}

	// lambda expression, an easier way to write method
	// number -> number % 2 == 0;
	// checking id what is on the right is true

}

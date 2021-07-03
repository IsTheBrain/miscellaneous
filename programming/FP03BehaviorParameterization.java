package programming;

import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;

public class FP03BehaviorParameterization {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(12, 23, 434, 321, 21, 2, 3);

		filterAndPrint(numbers, x -> x % 2 == 0);

		filterAndPrint(numbers, x -> x % 2 != 0);
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}

package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterExercises {

	public static void main(String[] args) {
		//SumBinaryOperator

		List<Integer> numbers = Arrays.asList(12, 23, 434, 321, 21, 2, 3);
		
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		Function<Integer, Integer> squareFunction = x -> x*x;

		Consumer<Integer> sysoutConsumer = System.out::println;
				

		//BinaryOperator<Integer> sumBinaryOperator  = sum2BinaryOperator;
		
		BinaryOperator<Integer> sumBinaryOperator2  = new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0+arg1;
			}
		};
		
		//int sum = numbers.stream().reduce(0, sumBinaryOperator);

		
		//BinaryOperator<Integer> sum2BinaryOperator = Integer::sum;
		
		BinaryOperator<Integer> sum2BinaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		
			
		};
		
		int sum2 = numbers.stream().reduce(0, sum2BinaryOperator);

		//System.out.println(sum);
		System.out.println(sum2);
		
	}
}

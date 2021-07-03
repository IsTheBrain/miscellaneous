package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {

	/*
	 * Boolean isEvent(int x){
	 * return x%2==0;
	 * }
	 * 
	 * int squared(int x){
	 * 	return x*x;
	 * }
	 */
	
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 23, 434, 321, 21, 2, 3);

		//Functional Interface has an abstract method
		
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		
		//up we have a easy way to do what is below
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer x) {
				// TODO Auto-generated method stub
				return x%2 == 0;
			}
		};
		
		Function<Integer, Integer> squareFunction = x -> x*x;

		Consumer<Integer> sysoutConsumer = System.out::println;
		
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		
		numbers.stream()
			.filter(isEvenPredicate2)
			.map(squareFunction)
			.forEach(sysoutConsumer2);
	}
}

package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FP03Exercises {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 23, 434, 321, 21, 2, 3);

		Function<Integer, Integer> mappingFunction = x -> x * x;
		Function<Integer, Integer> mappingFunction2 = x -> x * x * x;
		Function<Integer, Integer> mappingFunction3 = x -> x * x + 1;
		Function<Integer, String> mappingFunction4 = x -> x +"__ ";

		
		List<Integer> square = (List<Integer>) mapAndCreateNewList(numbers, mappingFunction);

		List<Integer> cube = (List<Integer>) mapAndCreateNewList(numbers, mappingFunction2);

		List<Integer> soOn = (List<Integer>) mapAndCreateNewList(numbers, mappingFunction3);
		List<String> tringFunc = (List<String>) mapAndCreateNewList(numbers, mappingFunction4);

		System.out.println(square);
		System.out.println(cube);
		System.out.println(soOn);
		
		System.out.println(tringFunc);
		
		//No input > Return Something
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return (int)(random.nextInt(100));
		};
	
		UnaryOperator<Integer> unaryOperator = (x) -> 3*x;
		
		System.out.println(unaryOperator.apply(10));
		
		
		System.out.println(randomIntegerSupplier.get());
	
		BiPredicate<Integer, String> bipredicate = (number,str) -> {
			return number <10 &&  str.length()>5;
		};
		
		System.out.println(bipredicate.test(2, "testString"));
	
		learnBiClass();
		
		learnBinaryOperator();
	}

	private static List<?> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, ?> mappingFunction) {
		return numbers.stream().map(mappingFunction).collect(Collectors.toList());
	}
	
	//Allows small code reducing
	private static void learnBiClass() {
		// TODO Auto-generated method stub

		BiFunction<Integer, String, String> bifunction = (number, str) -> {
			return number + " " + str;
		};
		
		System.out.println(bifunction.apply(15, "test"));
		
		BiConsumer<Integer, Integer> biConsumer = (s1,s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		
		biConsumer.accept(15, 98);
		

	}

	//Allows small code reducing avoiding un-useful structures
	private static void learnBinaryOperator() {
	//Only primitive operation
		BinaryOperator<Integer> sumBinaryOperator = (x,y) -> x+y;
		
		IntBinaryOperator sumBinaryOperator2  = (x,y) -> x+y;
	
		Consumer<String> consumer = (str) -> System.out.println(str);
		
		BiConsumer<String, String> consumer2 = (str, str2) -> System.err.println(str);

		Supplier<String> supplier = () -> {return "Ranga";};

		Consumer<String> secondConsumer = (str) -> {System.out.println(str);System.out.println(str);};
	}
}

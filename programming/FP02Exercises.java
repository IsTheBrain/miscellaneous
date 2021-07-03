package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FP02Exercises {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 4, 2, 2, 21, 2, 3);
		/*
		 * System.out.println(numbers.stream().reduce(0, (x, y) -> x * x + y * y));
		 * 
		 * // Square System.out.println(numbers.stream().map(x -> x * x).reduce(0,
		 * Integer::sum));
		 * 
		 * // Cube System.out.println(numbers.stream().map(x -> x * x * x).reduce(0,
		 * Integer::sum));
		 * 
		 * // odd number System.out.println(numbers.stream().filter(x -> x % 2 ==
		 * 1).reduce(0, Integer::sum));
		 * 
		 * // even number System.out.println(numbers.stream().filter(x -> x % 2 ==
		 * 0).reduce(0, Integer::sum));
		 * 
		 * // distinct number numbers.stream().distinct().forEach(System.out::print);
		 * 
		 * System.out.println(); // sort
		 * numbers.stream().sorted().distinct().forEach(System.out::println);
		 * 
		 */

		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");
		
		//alphabetic order
		//courses.stream().sorted().forEach(System.out::println);
		
		//courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		//reverse order
		//courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//length order
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
		
		
		List<Integer> doubleList= doubleList(numbers);
		System.out.println(doubleList);
		
		List<Integer> doubleEvenList= doubleEvenList(numbers);
		System.out.println(doubleEvenList);
		
		List<Integer> lenghtCourses = courses.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println(lenghtCourses);
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		return numbers.stream().map(x -> x*x).collect(Collectors.toList());
	}
	
	private static List<Integer> doubleEvenList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		
		return numbers.stream().filter(x->x % 2 == 0).map(x-> x*x).collect(Collectors.toList());
	}
	
	
	//INTERMEDIATE AND TERMINAL OPERATIONS
	//sorted, distinct, map, filter -> returns a stream and are Intermediate operation
	//foreach, collletc, reduce -> Terminal operation that are void or something is not a stream
}

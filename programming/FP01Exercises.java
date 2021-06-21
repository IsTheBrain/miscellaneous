package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {

		printOddNumbersInListFunctional(Arrays.asList(12, 23, 434, 321, 21, 2, 3));

		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");
		courses.stream().forEach(System.out::println);

		System.out.println("exercises 3 \n");
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);

		System.out.println("exercises 4 \n");
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);

		System.out.println("Square of even number \n");
		printSquaresOfEvenNumbersInListFunctional(Arrays.asList(12, 23, 434, 321, 21, 2, 3));

		System.out.println("Cubes of even number \n");
		printCubesOfOddNumbersInListFunctional(Arrays.asList(12, 23, 434, 321, 21, 2, 3));
		
		System.out.println("Lenght of Strings \n");
		courses.stream().map(course -> course + " "+ course.length()).forEach(System.out::println);
		

	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> asList) {
		// TODO Auto-generated method stub
		asList.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number * number)
		.forEach(System.out::println);	
	}

	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> asList) {
		// TODO Auto-generated method stub
		//mapping - x -> x*x

		asList.stream()
			.filter(number -> number % 2 == 0)
			.map(number -> number * number)
			.forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> asList) {

		asList.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
	}

}

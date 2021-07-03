package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReferences {

	public static void main(String[] args) {
	
		List<String> courses = Arrays.asList("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");
		
		courses.stream()
		.map(String::toUpperCase)
		.forEach(FP03MethodReferences::print);
	
		//almost everything could be done with double semicolon way
		Supplier<String> supplier = String::new;
	}

	private static void print(String str) {
		System.out.println(str);
	}
	
}

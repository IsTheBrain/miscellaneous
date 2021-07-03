package programming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudent;

	public Course(String name, String category, int reviewScore, int noOfStudent) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudent = noOfStudent;
	}

	@Override
	public String toString() {
		return "name=" + name + "," + " reviewScore=" + reviewScore + ", noOfStudent=" + noOfStudent;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {

		List<Course> courses = Arrays.asList(
				new Course("Spring", "Framework", 88, 5000),
				new Course("MSC", "Framework", 18, 18000),
				new Course("Full Stack", "Framework", 68, 9000),
				new Course("API", "Cloud", 91, 3000),
				new Course("Poppy", "Framework", 58, 10000),
				new Course("Lapas", "Cloud", 99, 6000)
				);
		
		//allMatch, noneMatch, anyMatch
		Predicate<Course> reviewScoreGraterThan94Predicate = course -> course.getReviewScore()>94;
		System.out.println(courses.stream().allMatch(reviewScoreGraterThan94Predicate));
		
		Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore()<90;
		System.out.println(courses.stream().noneMatch(reviewScoreGraterThan94Predicate));
		
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
		
		//some of that
		System.out.println(courses.stream().anyMatch(reviewScoreGraterThan94Predicate));
		
		Comparator comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudent);
		
		System.out.println(
		courses.stream().sorted(comparingByNoOfStudents).collect(Collectors.toList())
				);
		
		Comparator comparingByNoOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudent).reversed();
		
		System.out.println(
		courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList())
				);
		
		Comparator<Course> comparingByNoOfStudentAndNoOfReviews = 
				Comparator.comparing(Course::getNoOfStudent)
							.thenComparing(Course::getReviewScore)
							.reversed();
		
		System.out.println(
		courses.stream().sorted(comparingByNoOfStudentAndNoOfReviews).collect(Collectors.toList())
				);
		
		System.out.println(courses.stream()
				.sorted(comparingByNoOfStudentAndNoOfReviews)
				.skip(4)
				.collect(Collectors.toList()));
		
		System.out.println(courses.stream().max(comparingByNoOfStudentAndNoOfReviews));
		System.out.println(courses.stream().min(comparingByNoOfStudentAndNoOfReviews));
		
		
		System.out.println(
		courses.stream()
		.filter(reviewScoreLessThan90Predicate)
		.min(comparingByNoOfStudentAndNoOfReviews)
		.orElse(new Course("aaa", "12", 12, 1230)));

	
		System.out.println(
		courses.stream()
		.filter(reviewScoreLessThan90Predicate)
		.findFirst());
	}
}

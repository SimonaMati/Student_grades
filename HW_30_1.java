import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class HW_30_1 {

	public static void main(String[] args) {
		System.out.println("Enter the number of students: ");

		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();

		System.out.println("Enter " + numberOfStudents + " scores: ");
		int[] scores = new int[numberOfStudents];

		for (int i = 0; i < numberOfStudents; i++) {
			scores[i] = input.nextInt();
		}
		AtomicInteger index = new AtomicInteger();
		int highestGrade = Arrays.stream(scores).max().getAsInt();
		Arrays.stream(scores).forEach(e -> System.out.println("Student " + index.getAndIncrement() + " score is " + e
				+ " and grade is " + getGrade(e, highestGrade)));
	}

	public static char getGrade(int score, int bestGrade) {
		char grade = '\0';

		if (score >= (bestGrade - 5) && score <= bestGrade) {
			return grade = 'A';
		} else if (score < (bestGrade - 5) && score >= (bestGrade - 10)) {
			return grade = 'B';
		} else if (score < (bestGrade - 10) && score >= (bestGrade - 15)) {
			return grade = 'C';
		} else if (score < (bestGrade - 15) && score >= (bestGrade - 20)) {
			return grade = 'D';
		} else
			return grade = 'F';

	}
}
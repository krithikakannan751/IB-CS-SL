
/**
 * A class to test the Student class
 */
 public class StudentTester
{
	/**
	 * Tests the methods of the Student class.
	 * @param args not used
	 */
	 public static void main(String[] args)
	 {
	 	// creates a default student and displays the total quiz score
	 	Student s1 = new Student();	
	 	System.out.println(s1.getName() + " total quiz score: " + s1.getTotalQuizScore());

	 	// Create a student object called s2 with the name Peter Jackson
	 	Student s2 = new Student("Peter Jackson",0,0 );
	 		 	
	 	// add 3 quizzes for Peter Jackson with grades 88, 75 and 100
	 	s2.addQuiz(88);
	 	s2.addQuiz(75);
	 	s2.addQuiz(100);
	 	
	 	// display Peter's total quiz score in the format:
	 	// Peter Jackson total quiz score: ??
	 	// Access the instance field to display the name
	 System.out.println("Peter Jackson total quiz score: " + s2.getTotalQuizScore());
	 	
	 	// display Peter's average quiz score in the format:
	 	// Peter Jackson average quiz score: ??
	 	// Access the instance field to display the name
	 	System.out.println("Peter Jackson average quiz score: " + s2.getAverageScore());
	 	
	 }
}

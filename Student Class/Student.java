/**
 * @(#)Student.java
 *
 *
 * @author Krithika Kannan
 * @version 1.00 2017/10/5
 */


public class Student {
	
	private String name;
	private int numQuizzes;
	private int totalQuizScore;
	
    /** 
     *Constructs a student with a name "John Doe" 
     *number of quizzes and total quiz score 0
     */
    public Student() {
    	
    	name = "John Doe";
    	numQuizzes = 0;
    	totalQuizScore = 0;
    }
    
    /**
     *Constructs a student with a given name 
     *@param studentName name of the student
     *@param studentQuizzes number of quizzes
     *@param studentTotalQuizScore total student score
     */
     public Student(String studentName, int studentQuizzes, int studentTotalQuizScore){
     	
     	name = studentName;
     	numQuizzes = 0;
     	totalQuizScore = 0;
     }
     
     /**
      *Gets the name of the student
      *@return the name of the student
      */
      public String getName() {
      	return name;
      }
     
      /**
      *Gets the number of quizzes for the student
      *@return the number of quizzes for the student
      */
      public int getQuizzes() {
      	return numQuizzes;
      }
      
      /**
       *Adds a quiz with a specified score to the student record
       */
       public void addQuiz (int quizScore){
       numQuizzes = numQuizzes + 1;
       totalQuizScore = totalQuizScore + quizScore; 
       	
       }
       
       /**
        *Gets the current total quiz score for the student
        *@return the current total quiz score for the student
        */
       public int getTotalQuizScore(){
       	return totalQuizScore;
       }
       
       /**
        *Gets the current average quiz score for the student.
        *@return the average score
        */
       public double getAverageScore(){
       	
       	return totalQuizScore/numQuizzes;
       	
       }
}
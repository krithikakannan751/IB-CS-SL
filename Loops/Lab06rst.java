// Lab06rst.java
// Author: Krithika Kannan
// Student Version 

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class Lab06rst
{
	public static void main(String args[])
	{
		System.out.println("Lab 06r, Student Version");
		System.out.println("Repetition ");
		System.out.println();

		// Define variables needed
		int totalGrades = 0;
		int gradeCount = 0;
		boolean moreGrades = true;


		// (Must) use a while loop to read in daily grades from the screen.
	
		while (moreGrades)
		{
			int dailyGrades = Integer.parseInt(JOptionPane.showInputDialog("Please enter daily grades: ")); 
			gradeCount++;
			totalGrades += dailyGrades;
		

		// After reading in the grade, ask/prompt if there will be any more grades.
	
		String red =JOptionPane.showInputDialog("Do you have any more grades: ");
		red = red.toUpperCase();
		
		if(red.equals("N"))
			moreGrades = false;	
		else
			moreGrades = true;
	
		// Continue looping until the input from the screen indicates they are done
			
		}
		// Print out the average grades
		System.out.println("Average grade:");
		System.out.println(Math.round((double)totalGrades/gradeCount));


		// Reset grade accumulator field

		totalGrades = 0;
		gradeCount= 0;

		// Write a loop to read in your 3 six weeks grades.  
		// Must use a for loop(fixed loop)
		for(int i=1; i<3; i++)
		{
			
			int nineWeeksGrades = Integer.parseInt(JOptionPane.showInputDialog("Please enter nine weeks grades: ")); 
			totalGrades += nineWeeksGrades;
			gradeCount++;
			
		}
		
		//  Write a prompt and read the semester final grade 
		int semesterFinalGrade = Integer.parseInt(JOptionPane.showInputDialog("Please enter semester final grade: ")); 
		totalGrades += semesterFinalGrade;
		gradeCount++;
		

		// Average the three 6 weeks grades and the semester final to get the 
		// semester grade.  Print it 
		//(Hint, if you are doing bonus, save the six weeks 			
		//grades in a seperate variable before adding the semester grade.
		System.out.println("Semester grade: ");
		int SemesterGrade= (int)(totalGrades/gradeCount *0.8) + (int)(semesterFinalGrade*0.2);
		System.out.println(SemesterGrade);

		if(SemesterGrade>=70)
			System.out.println("Congrats, you are passing with a: \n" + SemesterGrade);
		else
			System.out.println("Oops, you didn’t study enough, you failed with a: " + SemesterGrade);
	}
}

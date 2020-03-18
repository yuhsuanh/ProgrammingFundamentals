package lab8;

import java.util.Random;
import java.util.Scanner;

public class CollegeCourseTestHarness {

	public static void main(String[] args) {
		CollegeCourse[][] courses = new CollegeCourse[200][10];
		
		int row = 0;
		int column = 0;
		
		//Set frist 100 rows with CollegeCourse Objects: Default values both are 0
		for(row=0; row<100; row++) { //for rows: 0-99
			for(column=0; column<10; column++) { //for columns: 0-10
				courses[row][column] = new CollegeCourse(0, 0);
			}
		}
		
		//Set second 100 rows with CollegeCourse Objects: Default values both are 9999
		for(; row<200; row++) { //for rows: 0-99
			for(column=0; column<10; column++) { //for columns: 0-10
				courses[row][column] = new CollegeCourse(0, 0);
			}
		}
		
		//Print out the state of each object		
//		printArray(courses);
		
		//Create an array include four random course numbers which are 5 digits.
		Random random = new Random(System.currentTimeMillis());
		int[]  courseNumberArray = { 
				createRandomNumber(random),
				createRandomNumber(random),
				createRandomNumber(random),
				createRandomNumber(random)};
		
		//Set unique course reference number with 7 digits
		//Set course number to one of four from a array
		int courseRefNum = 1000000;
		for(row=0; row<courses.length; row++) {
			for(column=0; column<courses[row].length; column++) {
				//randomly choose number from the course number array (index from 0-3)
				courses[row][column].setCourseNumber(courseNumberArray[random.nextInt(4)]);
				//set sequential number
				courses[row][column].setCourseReferenceNumber(courseRefNum++);
			}
		}
		
		//Print out the state of each object		
		printArray(courses);
		
		//Ask user row and column to print the object information
		//Use try...catch to handle the exception avoid the program will not crash.
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter \"ROW\" index: ");
		row = scan.nextInt();
		System.out.printf("Enter \"COLUMN\" index: ");
		column = scan.nextInt();
		try {
			System.out.printf("Row idx: %d, Column idx: %d\n", row, column);
			System.out.println(courses[row][column].toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("End...");
		}
	}
	
	/**
	 * Print all states of each CollegeCourses object in a Multidimensional Array.
	 * @param courses
	 */
	public static void printArray(CollegeCourse[][] courses) {
		for(int row=0; row<courses.length; row++) {
			for(int column=0; column<courses[row].length; column++) {
				System.out.printf("Row idx: %d, Column idx: %d\n", row, column);
				System.out.println("Course Number: " + courses[row][column].getCourseNumber());
				System.out.println("Course Reference Number: " + courses[row][column].getCourseReferenceNumber());
				System.out.println("-------------------------------------------");
			}
		}
	}

	/**
	 * Create random number for the course number array
	 * @param random
	 * @return
	 */
	public static int createRandomNumber(Random random) {
		int num = 0;
		for(int i=1; i<100000; i*=10) {
			if(i == 10000)
				num += (random.nextInt(8)+1) * i; //from 1-9
			else
				num += random.nextInt(10) * i; //from 0-9
		}
		return num;
	}
	
}

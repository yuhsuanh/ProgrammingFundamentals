/**
 * Test harness class to test the birth certificate class 
 *  
 * @author Yu-Hsuan Huang
 * 
 */

import java.util.Random;

public class BirthCertificateTestHarness {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		
		// Four different lists, of 5 entries each
		final String[] firstNameArray = {"Sean", "Winnie", "Luke", "Zack", "Eisen"};
		final String[] lastNameArray = {"Grey", "King", "Ross", "Cook", "Lee"};
		final String[] cityArray = {"Toronto", "Ottawa", "Mississauge", "Brampton", "Hamilton"};
		final String[] dateArray = {"1998-10-16", "2003-01-16", "1993-03-18", "1999-06-11", "2000-09-30"};
		int count = 1;
		
		/* 
		 * Test1
		 * Create a two dimensional array with 10 rows and 30 columns.
		 * Set all states random values based upon four different lists
		 */
		StringBuilder tempStrBuilder = new StringBuilder();
		BirthCertificate[][] birthCertiArray = new BirthCertificate[10][30];
		String toronto = "Toronto";
		boolean hasToronto = false;
		//Make sure Toronto is in the array
		for(int i=0; i<cityArray.length; i++) {
			if(cityArray[i].equals(toronto)) {
				hasToronto = true;
				break;
			}
		}
		//Instantiate all BirthCertificate object
		for(int i=0; i<10; i++) {
			for(int j=0; j<30; j++) {
				birthCertiArray[i][j] = new BirthCertificate(firstNameArray[random.nextInt(5)], lastNameArray[random.nextInt(5)], cityArray[random.nextInt(5)], dateArray[random.nextInt(5)]);
				
				//If the city of birth is Toronto insert a “#” symbol between each letter for the persons first name
				if(hasToronto && birthCertiArray[i][j].getCityOfBirth().equals(toronto)) {
					tempStrBuilder.append(birthCertiArray[i][j].getFirstName());
					for(int k=1; k<tempStrBuilder.length(); k+=2) {
						tempStrBuilder = tempStrBuilder.insert(k, "#");
					}
					birthCertiArray[i][j].setFirstName(tempStrBuilder.toString());
					tempStrBuilder.delete(0, tempStrBuilder.length());
				}
			}
		}
		
		
		/*
		 * Test2
		 * Print out the state of each object as well as the scrambled country name
		 * Print a dashed line after each block of object data
		 * Place the appropriate line(s) of code in a try catch block
		 */
		try {
			for(int i=0; i<10; i++) {
				for(int j=0; j<30; j++) {
					System.out.println("No." + count++);
					System.out.println("First Name:" + birthCertiArray[i][j].getFirstName());
					System.out.println("Last Name:" + birthCertiArray[i][j].getLastName());
					System.out.println("Country Name:" + BirthCertificate.createRandomCountry());
					System.out.println("City Name:" + birthCertiArray[i][j].getCityOfBirth());
					System.out.println("Date of birth:" + birthCertiArray[i][j].getDateOfBirth());
					System.out.println("------------------------------------------------------");
				}
			}
		} catch (IndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("Array index out of bounds!!!");
		}
		
		
		/*
		 * Test 3
		 * Test the last method of the birth certificate class
		 * Test two overload method
		 */
		System.out.println();
		BirthCertificate birthCerti = new BirthCertificate(firstNameArray[random.nextInt(5)], lastNameArray[random.nextInt(5)], cityArray[random.nextInt(5)], dateArray[random.nextInt(5)]);
		System.out.println("First Name:" + birthCerti.getFirstName());
		System.out.println("Last Name:" + birthCerti.getLastName());
		System.out.println("City Name:" + birthCerti.getCityOfBirth());
		System.out.println("Date of birth:" + birthCerti.getDateOfBirth());
		//Test pin number
		System.out.println("Pin number is 1234");
		CustomerInfo customerInfo = birthCerti.getCustomerInfo(1234);
		System.out.printf("Use Pin (5487): ");
		customerInfo.enterPinNumber(5487);
		System.out.printf("Use Pin (1234): ");
		customerInfo.enterPinNumber(1234);
		//Test two overload methods
		int countChar = birthCerti.checkNumberOfOccurrences('n');
		int countString = birthCerti.checkNumberOfOccurrences("to");
		System.out.println("Check the character \'n\' the number of occurrences in all states: " + countChar);
		System.out.println("Check the string \"to\" the number of occurrences in all states: " + countString);
		
		
		
		/*
		 * Test4
		 * Print out should be organized based upon the city of birth such that the data is sorted in groups based upon the city
		 */
		count = 1;
		System.out.println();
		for(int k=0; k<cityArray.length; k++) {
			System.out.println(cityArray[k] + " City");
			System.out.println("------------------------------------------------------");
			for(int i=0; i<10; i++) {
				for(int j=0; j<30; j++) {
					if(cityArray[k].equals(birthCertiArray[i][j].getCityOfBirth())) {
						System.out.println("No." + count++);
						System.out.println("First Name:" + birthCertiArray[i][j].getFirstName());
						System.out.println("Last Name:" + birthCertiArray[i][j].getLastName());
						System.out.println("Country Name:" + BirthCertificate.createRandomCountry());
						System.out.println("City Name:" + birthCertiArray[i][j].getCityOfBirth());
						System.out.println("Date of birth:" + birthCertiArray[i][j].getDateOfBirth());
						System.out.println("------------------------------------------------------");
					}
				}
			}
		}
	}
	
}

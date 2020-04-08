/**
 * This class represents a birth certificate.
 *  
 * @author Yu-Hsuan Huang
 * 
 */

import java.util.Random;
public class BirthCertificate {

	private static String country = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private String firstName;
	private String lastName;
	private String cityOfBirth;
	private String dateOfBirth;
	
	// Default constructor
	public BirthCertificate() {}
	// Constructor that takes 4 arguments
	public BirthCertificate(String firstName, String lastName, String cityOfBirth, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.cityOfBirth = cityOfBirth;
		this.dateOfBirth = dateOfBirth;
	}
	
	//Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCityOfBirth() {
		return cityOfBirth;
	}
	public void setCityOfBirth(String cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	// A static method which will randomly scramble and return the country name
	public static String createRandomCountry() {
		Random random = new Random(System.currentTimeMillis());
		
		char tempChar = ' ';
		int randomIndex = 0;
		// Initialize array
		char[] result = country.toCharArray();
		
		// Randomly assigned  a new location without vowels
		for(int i=0; i<country.length(); i++) {
			tempChar = country.charAt(i);
			//if the character is vowels don't need a new location
			if(tempChar == 'A' || tempChar == 'E' || tempChar == 'I' || tempChar == 'O' || tempChar == 'U')
				continue;
			else {
				while(true) {
					randomIndex = random.nextInt(country.length());
					// Switch character to random index except vowels index
					if(result[randomIndex] != 'A' && result[randomIndex] != 'E' && result[randomIndex] != 'I' && result[randomIndex] != 'O' && result[randomIndex] != 'U') {
						tempChar = result[randomIndex];
						result[randomIndex] = result[i];
						result[i] = tempChar;
						break;
					}
				}
			}
		}
		return String.valueOf(result);
	}
	
	// Determine the number of occurrences found that argument of the method occurs in any of the state of the object
	public int checkNumberOfOccurrences(String keyword) {
		int count = 0;
		int index = 0;
		
		String tempStr = "";
		String lowercaseKeyword = keyword.toLowerCase();
		
		//first name
		tempStr = firstName.toLowerCase();
		while(!tempStr.isEmpty()) {
			index = tempStr.indexOf(lowercaseKeyword);
			if(index != -1) {
				tempStr = tempStr.substring(index+1);
				count++;
			} else
				break;
		}
		//last name
		tempStr = lastName.toLowerCase();
		while(!tempStr.isEmpty()) {
			index = tempStr.indexOf(lowercaseKeyword);
			if(index != -1) {
				tempStr = tempStr.substring(index+1);
				count++;
			} else
				break;
		}
		//city of birth
		tempStr = cityOfBirth.toLowerCase();
		while(!tempStr.isEmpty()) {
			index = tempStr.indexOf(lowercaseKeyword);
			if(index != -1) {
				tempStr = tempStr.substring(index+1);
				count++;
			} else
				break;
		}
		//date of birth
		tempStr = dateOfBirth.toLowerCase();
		while(!tempStr.isEmpty()) {
			index = tempStr.indexOf(lowercaseKeyword);
			if(index != -1) {
				tempStr = tempStr.substring(index+1);
				count++;
			} else
				break;
		}
		
		return count;
	}
	public int checkNumberOfOccurrences(char keyword) {
		int count = 0;
		int index = 0;
		
		// Concatenate all state of object because we need find the character in the string. So, connect each state is not a problem.
		String tempStr = firstName + lastName + cityOfBirth + dateOfBirth;
		tempStr = tempStr.toLowerCase();
		// Convert to lower case
		char lowercaseKeyword = Character.toLowerCase(keyword);
		//Find how many keyword inside the string
		while(!tempStr.isEmpty()) {
			index = tempStr.indexOf(lowercaseKeyword);
			if(index != -1) {
				tempStr = tempStr.substring(index+1);
				count++;
			} else
				tempStr = "";
		}
		return count;
	}
	
	// A method which will store the first and last name in a new custom object, and will return object to the user.
	public CustomerInfo getCustomerInfo(int pinNumber) {
		CustomerInfo result = new CustomerInfo(firstName, lastName, pinNumber);
		return result;
	}
	
}

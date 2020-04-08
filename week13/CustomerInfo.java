/**
 * This class saves customer information. You need provide pin number to access the state of the this object.
 *  
 * @author Yu-Hsuan Huang
 * 
 */

public class CustomerInfo {
	private String firstName;
	private String lastName;
	private int pinNumber;
	
	// Default constructor
	public CustomerInfo() {}
	// Constructor that takes 2 arguments
	public CustomerInfo(String firstName, String lastName, int pinNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinNumber = pinNumber;
	}
	
	//No getters and setters, because we don't want others to access without enter correct pin number.
	
	//The user must provide a 4 digit pin number to retrieve the state of the new object.
	public void enterPinNumber(int pinNumber) {
		if(this.pinNumber == pinNumber)
			System.out.println("Pin Number Correct!! First Name: " + firstName + " Last Name: " + lastName);
		else
			System.out.println("Pin Number Error!!");
	}
}

    /**
     * @author Yu-Hsuan Huang
     *
     */
    
    public class AirlineReservation {
    	private String firstName;
    	private String lastName;
    	private String flightNumber;
    	private int seatNumber;
    	
    	/**
    	 * Empty constructor
    	 */
    	public AirlineReservation() {}
    	
    	/**
    	 * Constructor for all variables
    	 * @param firstName Passenger First Name
    	 * @param lastName Passenger Last Name
    	 * @param flightNumber Flight Number
    	 * @param seatNumber Seat Number
    	 */
    	public AirlineReservation(String firstName, String lastName, String flightNumber, int seatNumber) {
    		this.firstName = firstName;
    		this.lastName = lastName;
    		this.flightNumber = flightNumber;
    		this.seatNumber = seatNumber;
    	}
    
    	
    	//Getter and Setter
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
    
    	public String getFlightNumber() {
    		return flightNumber;
    	}
    
    	public void setFlightNumber(String flightNumber) {
    		this.flightNumber = flightNumber;
    	}
    
    	public int getSeatNumber() {
    		return seatNumber;
    	}
    
    	public void setSeatNumber(int seatNumber) {
    		this.seatNumber = seatNumber;
    	}
    	
    	/**
    	 * Assign this passenger seat class
    	 * @return Seat Class
    	 */
    	public String assignSeatClass() {
    		//1-2: First Class, 3-4: Second Class, 5-6: Third Class, 7-8: Fourth Class
    		int firstSeatNum = Integer.valueOf(String.valueOf(seatNumber).substring(0, 1));
    		
    		/*
    		if(seatNumber/10 > 0) {
    			firstSeatNum = seatNumber/10;
    		} else {
    			firstSeatNum = seatNumber%10;
    		}
    		*/
    		
    		switch(firstSeatNum) {
    		case 1: 
    		case 2:
    			return "First Class";
    		case 3:
    		case 4:
    			return "Second Class";
    		case 5:
    		case 6:
    			return "Third Class";
    		case 7:
    		case 8:
    			return "Fourth Class";
    		default:
    			return "";
    		}
    	}
    	
    	/**
    	 * Is this passenger on the blacklist
    	 * If this passenger on the list return Code 9999, else return Code 0
    	 * @return Code
    	 */
    	// Blacklist: Jack Blue, Jack Green, Jill White
    	public int isBlackList() {
    		String fullName = firstName.toLowerCase().trim() + " " + lastName.toLowerCase().trim();
    		if("jack blue".equals(fullName) || "jack green".equals(fullName) || "jill white".equals(fullName)) {
    			return 9999;
    		}
    		return 0;
    	}
    	
    	/**
    	 * if the seat number length is 2 and first digit smaller than second and second number is no greater than total number of characters
    	 * It will print substring in your passenger information string
    	 */
    	public void getSubString() {
    		//1. concatenate all object state into  string
    		//2. seat number is a two digit number
    		//3. the first digit is smaller than the second
    		//4. second number is no greater than the total number of characters
    		//5. will return a portion of that string
    		
    		String str = firstName + lastName + flightNumber + seatNumber;
    		String seatStr = String.valueOf(seatNumber);
    		
    		if(seatStr.length() == 2) {
    			int firstSeatNum = seatNumber / 10;
    			int secondSeatNum = seatNumber % 10;
    			
    			if(firstSeatNum < secondSeatNum && secondSeatNum < str.length()) {
    				System.out.println(str);
    				System.out.println(str.substring(firstSeatNum, secondSeatNum));
    			}
    			else {
    				System.out.println("Sorry!!");
    				System.out.println("First seat digit is not smaller than the second.");
    				System.out.println("or");
    				System.out.println("Second seat digit is greater than total number of characters.");
    			}
    		} else {
    			System.out.println("Sorry!!\nSeat Number length is not 2.");
    		}
    	}
    	
    	/**
    	 * Show this passenger information
    	 */
    	public void showInformation() {
    		System.out.println("==============================");
    		System.out.println("Passenger Name: " + firstName + " " + lastName);
    		System.out.println("Flight number: " + flightNumber);
    		System.out.println("Seat Class: " + this.assignSeatClass());
    		System.out.println("Seat Number: " + seatNumber);
    		System.out.println("------------------------------");
    		this.getSubString();
    		if(this.isBlackList() == 9999) {
    			System.out.println("------------------------------");
    			for(int i = 0; i < 7; i++) {
    			    System.out.println("ALERT!!! This passenger is on the blacklist!");
                            //delay 1 second
			    for(int j=0;j<747483647;j++){ //int max is 2147483647
			        for(int k=0;k<747483647;k++){}
			    }
				
			}
		}
	}
}

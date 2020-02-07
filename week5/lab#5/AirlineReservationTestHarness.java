/**
 * @author Yu-Hsuan Huang
 * 
 */

import java.util.Scanner;

public class AirlineReservationTestHarness {
	static Scanner inputText;
	static Scanner inputInt;
	
	public static void main(String[] args) {
		inputText =  new Scanner(System.in);
		inputInt = new Scanner(System.in);
		
		AirlineReservation order1 = new AirlineReservation("Yu-Hsuan", "Huang", "BR 35", 24);
		order1.showInformation();
		
		String next = "y";
		do {
			if("y".equals(next)) {
				AirlineReservation order2 = new AirlineReservation();
				
				System.out.println("==============================");
				System.out.print("Passenger First Name : ");
				order2.setFirstName(inputText.nextLine());
				
				System.out.print("Passenger Last Name : ");
				order2.setLastName(inputText.nextLine());
				
				System.out.print("Flight Number : ");
				order2.setFlightNumber(inputText.nextLine());
				
				System.out.print("Seat Number: ");
				order2.setSeatNumber(inputInt.nextInt());
				
				order2.showInformation();
			}
			
			//continue yes or not
			System.out.println("Do you want to input next reservation? (y/n)");
			next = inputText.nextLine();
		
		} while(!"n".equals(next));
	}
}

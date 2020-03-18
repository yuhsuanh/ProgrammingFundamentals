package lab6;

import java.util.Scanner;

public class MovieTicketTestHarness {

	public static void main(String[] args) {
		Scanner scanText = new Scanner(System.in);
		Scanner scanNumber = new Scanner(System.in);
		MovieTicket ticket = new MovieTicket();
		
		MovieTicketTestHarness.printMovieInfo();
		//Input Movie Name
		while(true) {
			System.out.printf("Please input movie name:");
			String movieName = scanText.nextLine();
			if(compareMovieName(movieName)) {
				ticket.setMovieName(movieName);
				break;
			} else {
				System.out.println("Please input the correct movie name!!!");
			}
		}
		//Input Ticket Number
		while(true) {
			System.out.printf("Please input ticket number:");
			int ticketNumber = scanNumber.nextInt();
			if(compareTicketNumber(ticket.getMovieName(), ticketNumber)) {
				ticket.setTicketNumber(ticketNumber);
				break;
			} else {
				System.out.println("Please input the correct ticket Number!!!");
			}
		}
		//Input Ticket
		while(true) {
			System.out.printf("Please input theater number:");
			int theaterNumber = scanNumber.nextInt();
			if(compareTheaterNumber(ticket.getTicketNumber(), theaterNumber)) {
				ticket.setTheatreNumber(theaterNumber);
				break;
			} else {
				System.out.println("Please input the correct theater Number!!!");
			}
		}
		System.out.printf("\n");
		System.out.println(ticket.toString());
		System.out.println("Ticket Price: " + MovieTicket.ticketPrice());
		
		
		System.out.printf("\n");
		System.out.printf("Please input movie name to search run date: ");
		System.out.println(ticket.runDate(scanText.nextLine()));
		
		System.out.printf("Please input your ticket number to search run date: ");
		System.out.println(ticket.runDate(scanNumber.nextInt()));
	}
	
	/**
	 * Show all movie information list
	 */
	public static void printMovieInfo() {
		System.out.println("Movie Name\t\tDate\t\tTicket\tTheater");
		System.out.println("--------------------------------------------------------");
		System.out.println("Avatar\t\t\t2020/03/05\t1___\t1");
		System.out.println("Avengers: Endgame\t2020/03/06\t2___\t2");
		System.out.println("Titanic\t\t\t2020/03/07\t3___\t3");
		System.out.println("Jurassic World\t\t2020/03/08\t4___\t4");
		System.out.println("========================================================\n");
	}
	
	/**
	 * Compare movie name is match the 4 movies name
	 * @param movieName
	 * @return
	 */
	public static boolean compareMovieName(String movieName) {
		if(movieName.equalsIgnoreCase("Avatar") ||
			movieName.equalsIgnoreCase("Avengers: Endgame") ||
			movieName.equalsIgnoreCase("Titanic") ||
			movieName.equalsIgnoreCase("Jurassic World"))
		return true;
		
		return false;
	}
	
	/**
	 * compare ticket number match the ticket number rules
	 * @param movieName
	 * @param ticketNumber
	 * @return
	 */
	public static boolean compareTicketNumber(String movieName,int ticketNumber) {
		int num = ticketNumber/1000;
		if(num <= 4  && num > 0) {
			if((movieName.equalsIgnoreCase("Avatar") && num == 1) ||
				(movieName.equalsIgnoreCase("Avengers: Endgame") && num == 2) ||
				(movieName.equalsIgnoreCase("Titanic") && num == 3) ||
				(movieName.equalsIgnoreCase("Jurassic World") && num == 4))
				return true;
		}
		return false;
	}
	
	/**
	 * compare theater number match the theater number rules
	 * @param ticketNumber
	 * @param theaterNumber
	 * @return
	 */
	public static boolean compareTheaterNumber(int ticketNumber, int theaterNumber) {
		int num = ticketNumber / 1000;
		if(num == theaterNumber)
			return true;
		return false;
	}

}

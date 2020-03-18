package lab6;

public class MovieTicket {
	private static double TICKET_PRICE = 12.99;
	
	private String movieName;
	private int ticketNumber;
	private int theatreNumber;
	
	
	//Getter and Setter
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public int getTheatreNumber() {
		return theatreNumber;
	}
	public void setTheatreNumber(int theatreNumber) {
		this.theatreNumber = theatreNumber;
	}
	
	//
	public static double ticketPrice() {
		return TICKET_PRICE * 1.13;
	}
	
	//Two overload method
	//
	public String runDate(String movieName) {
		switch(movieName) {
		case "Avatar":
			return "Avatar\t2020/03/05";
		case "Avengers: Endgame":
			return "Avengers: Endgame\t2020/03/06";
		case "Titanic":
			return "Titanic\t2020/03/07";
		case "Jurassic World":
			return "Jurassic World\t2020/03/08";
		default:
			return "Sorry movie name is wrong!";
		}
	}
	
	//
	public String runDate(int ticketNumber) {
		int num = ticketNumber / 1000;
		switch(num) {
			case 1:
				return "Avatar\t2020/03/05";
			case 2:
				return "Avengers: Endgame\t2020/03/06";
			case 3:
				return "Titanic\t2020/03/07";
			case 4:
				return "Jurassic World\t2020/03/08";
			default:
				return "Sorry your ticket number is wrong!";
		}
	}
	
	@Override
	public String toString() {
		String str = "Movie Name: " + movieName + "\n" + 
						"Ticket Number: " + ticketNumber + "\n" + 
						"Theater Number: " + theatreNumber;
		return str;
		//return super.toString();
	}
}

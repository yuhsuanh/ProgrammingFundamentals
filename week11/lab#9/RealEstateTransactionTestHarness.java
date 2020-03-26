package lab9;

import java.util.Scanner;

public class RealEstateTransactionTestHarness {

	public static void main(String[] args) {
		RealEstateTransaction transaction = new RealEstateTransaction("One", "Georgian Dr.", "Barrie", "One million");
		System.out.println(transaction.transformText());
		System.out.println(transaction.getSubString());
		
		System.out.println("--------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.printf("Enter char index which you want to replacement: ");
		int charIndex =  scan.nextInt();
		System.out.printf("Enter length after the char which you want to replacement: ");
		int encryptedLength = scan.nextInt();
		System.out.println(transaction.encryptedString(charIndex, encryptedLength));
		
	}
	
}

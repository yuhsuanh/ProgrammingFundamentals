package lab7;

import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness {

	public static void main(String[] args) {
		//functional variables
		Random random = new Random(System.currentTimeMillis());
		Scanner scanStr = new Scanner(System.in);
		
		//variables
		String option = "";
		
		//initialize BankTransactionRecord array
		BankTransactionRecord[] records = new BankTransactionRecord[500];
		//instantiate 500 BankTransactionRecord random data
		for (int i=0; i<records.length; i++) {
			records[i] = BankTransactionRecordTestHarness.createRandomData(random);
		}
		System.out.println("Trace:" + BankTransactionRecord.count);
		//Print all state of each objects
		for(int i=0; i<records.length; i++) {
			System.out.println("Recode#" + (i+1) + " " + records[i].toString());
			System.out.println("-------------------------------------------");
		}
		
		//Ask if users want to phase two of test
		do {
			System.out.printf("Phase two of test (y/n): ");
			option = scanStr.nextLine();
		} while(!"y".equalsIgnoreCase(option) && !"n".equalsIgnoreCase(option));
		
		//Base on the option y/n
		switch(option) {
			//test change exchange rate to default value on all records
			case "y":
			case "Y":
				System.out.println("\nChange Exchange Rate to Default value");
				//Change to default value
				for (int i=0; i<records.length; i++) {
					records[i].setCanadianFunds(true);
					records[i].setExchangeRate(0.1);
					records[i].setTransactionNumber(12345);
					records[i].setTransactionReferenceNumber(66666666);
				}
				//Print all state of each objects
				for (int i=0; i<records.length; i++) {
					System.out.println("Recode#" + (i+1) + " " + records[i].toString());
					System.out.println("-------------------------------------------");
				}
				break;
			//finish the application
			case "n":
			case "N":
				System.out.println("\nTest is finished");
				break;
		}
		
	}
	
	/**
	 * Create BankTransactionRecord Data by Random
	 * @param random
	 * @return BankTransactionRecord
	 */
	public static BankTransactionRecord createRandomData(Random random) {
		BankTransactionRecord data;
		data = new BankTransactionRecord(
				random.nextBoolean(), 
				random.nextDouble(),
				random.nextInt(),
				random.nextLong());
		return data;
	}
	
}

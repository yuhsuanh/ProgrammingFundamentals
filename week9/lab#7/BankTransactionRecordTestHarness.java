package lab7;

import java.util.Random;
import java.util.Scanner;

public class BankTransactionRecordTestHarness {

	public static void main(String[] args) {
		//functional variables
		Random random = new Random(System.currentTimeMillis());
		Scanner scanNum = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		
		//variables
		String option = "";
		Double tempexchangeRate = 0.0;
		
		//initialize BankTransactionRecord array
		BankTransactionRecord[] records = new BankTransactionRecord[500];
		//instantiate 500 BankTransactionRecord random data
		for (int i=0; i<500; i++) {
			records[i] = BankTransactionRecordTestHarness.createRandomData(random);
			System.out.println("Recode#" + (i+1) + " " + records[i].toString());
			System.out.printf("\n-------------------------------------------\n");
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
				System.out.printf("Input Exchange Rate (Double type): ");
				tempexchangeRate = scanNum.nextDouble();
				for (int i=0; i<500; i++) {
					records[i].setExchangeRate(tempexchangeRate);
					System.out.println("Recode#" + (i+1) + " " + records[i].toString());
					System.out.printf("\n-------------------------------------------\n");
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

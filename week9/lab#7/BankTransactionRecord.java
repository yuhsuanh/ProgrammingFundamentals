package lab7;

public class BankTransactionRecord {
	public static int count = 0;
	
	private boolean canadianFunds;
	private double exchangeRate;
	private int transactionNumber;
	private long transactionReferenceNumber;
	
	//Constructors
	public BankTransactionRecord() {}
	
	public BankTransactionRecord(boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber) {
		count++;
		this.canadianFunds = canadianFunds;
		this.exchangeRate = exchangeRate;
		this.transactionNumber = transactionNumber;
		this.transactionReferenceNumber = transactionReferenceNumber;
	}
	
	//Getter and setter
	public boolean isCanadianFunds() {
		return canadianFunds;
	}
	public void setCanadianFunds(boolean canadianFunds) {
		this.canadianFunds = canadianFunds;
	}
	public double getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public long getTransactionReferenceNumber() {
		return transactionReferenceNumber;
	}
	public void setTransactionReferenceNumber(long transactionReferenceNumber) {
		this.transactionReferenceNumber = transactionReferenceNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return canadianFunds + " " + exchangeRate + " " + transactionNumber + " " + transactionReferenceNumber;
	}
	
	/**
	 * Print Information
	 * @return
	 */
	public String showInfo() {
		String data = "Canadian Funds: " + canadianFunds + 
				"\nExchange Rate: " + exchangeRate +
				"\nTransaction Number:" + transactionNumber +
				"\nTransaction Reference Number:" + transactionReferenceNumber;
		return data;
	}
}
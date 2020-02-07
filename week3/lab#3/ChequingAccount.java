public class ChequingAccount {
	private String firstName;
	private String lastName;
	private int balance;
	private int accountNum;

	//consturctor for all variable
	public ChequingAccount (String firstName, String lastName, int balance, int accountNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
		this.accountNum = accountNum;
	}

	//getter and setter for private variable
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
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	//find pattern Index
	public String findPattern()
    {
        String allState = accountNum + firstName + lastName + balance; 
        int foundIndex = allState.indexOf("78364");
        String result = foundIndex + " " + allState;
        return result;
    }

    //return account information
	public String returnAccountInfo() {
		 // String info = accountNum + ", " + firstName + ", " + lastName + ", " + balance
		String info = "".concat("" + accountNum).concat(", " + firstName).concat(", " + lastName).concat(", " + balance);
		return info;
	}
}
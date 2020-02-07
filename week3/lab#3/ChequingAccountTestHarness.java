public class ChequingAccountTestHarness {
	public static void main(String[] args) {

		//Instantiate a ChequingAccount object 
		ChequingAccount myAccount = new ChequingAccount("Test First Name", "Test Last Name", 54870, 234783641);

		System.out.println("My first name : " + myAccount.getFirstName());
		System.out.println("My last name : " + myAccount.getLastName());
		System.out.println("My Balance : " + myAccount.getBalance());
		System.out.println("My account number : " + myAccount.getAccountNum() + "\n");

		myAccount.setFirstName("Yu-Hsuan");
		myAccount.setLastName("Huang");
		
		System.out.println("My first name : " + myAccount.getFirstName());
		System.out.println("My last name : " + myAccount.getLastName());
		System.out.println("My Balance : " + myAccount.getBalance());
		System.out.println("My account number : " + myAccount.getAccountNum() + "\n");

		System.out.println(myAccount.returnAccountInfo());
		
		System.out.println("All state concatenated and pattern index is " + myAccount.findPattern());
	}
}
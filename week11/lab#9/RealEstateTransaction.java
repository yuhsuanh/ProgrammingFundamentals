package lab9;

import java.util.Random;

public class RealEstateTransaction {
	
	String streetNumber;
	String streetName;
	String city;
	String price;
	
	//Construstor
	public RealEstateTransaction() {}
	public RealEstateTransaction(String streetNumber, String streetName, String city, String price) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.price = price;
	}
	
	//Getter and Setter
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	//A method which will return the four fields of the object as one string in which the front half of the string is lowercase letters and the back half of the string is uppercase letters.
	//Method 1
	public String transformText() {
		String str = streetNumber + streetName + city + price;
		int length = str.length();
		return str.substring(0, length/2).toLowerCase() + str.substring(length/2).toUpperCase();
	}
	
	//Method 2
	public String getSubString() {
		Random random = new Random(System.currentTimeMillis());
		String str = this.transformText();
		String result = "";
		int value = 0;
		
		//font portion
		value = createRandomValue(random, str.length()/2);
		result = result.concat(str.substring(value, str.length()/2));
		//back portion
		while(true) {
			value = createRandomValue(random, str.length());
			if(value > str.length()/2 && value < str.length())
				break;
		}
		result = result.concat(str.substring(value));
		return result;
	}
	
	//Method 3
	public String encryptedString(int charIndex, int encryptedLength) {
		String str = streetNumber + streetName + city + price;
		System.out.println(str);
		
		if(charIndex > str.length() || charIndex + encryptedLength > str.length() || encryptedLength > charIndex)
			return "1";
		
		String charactor = String.valueOf(str.charAt(charIndex));
		String replaceString = str.substring(charIndex, charIndex+encryptedLength);
		System.out.println(replaceString);
		
		return str.replace(charactor, replaceString);
	}
	
	private int createRandomValue(Random random, int bound) {
		return (int) random.nextInt(bound);
	}
}

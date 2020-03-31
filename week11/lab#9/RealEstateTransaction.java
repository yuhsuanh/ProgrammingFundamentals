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
		String str = streetNumber + streetName + city + price;
		String result = "";
		int index1, index2;
		
		//font portion
		while(true) {
			index1 = random.nextInt(str.length());
			if(index1 > 0 && index1 < str.length()-1);
				break;
		}
		result = result.concat(str.substring(0, index1).toLowerCase());
		
		//back portion
		while(true) {
			index2 = random.nextInt(str.length());
			if(index2 > index1)
				break;
		}
		result = result.concat(str.substring(index1, index2).toUpperCase());
		return result;
	}
	
	//Method 3
	public String encryptedString(int charIndex, int encryptedDistance) {
		char[] str = (streetNumber + streetName + city + price).toCharArray();
		System.out.println(str);
		
		if(charIndex > str.length || encryptedDistance > str.length || encryptedDistance < charIndex)
			return "1";
		
		char replace = str[charIndex];
		str[charIndex+encryptedDistance+1] = replace;
		for(int i=charIndex+encryptedDistance+1; i<str.length; i += 3) {
			str[i] = replace;
		}
		
		return String.valueOf(str);
	}
	
}

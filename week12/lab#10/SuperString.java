package lab10;

public class SuperString {

	public static void method1(String inputStr) {
		final String[] STRING_ARRAY = {"Hat", "Cat", "Bat", "Fine", "Pine", "At", "Pi", "Bee", "Art", "Dog"};
		
		String input = inputStr.toLowerCase();
		for(int i=0; i<STRING_ARRAY.length; i++) {
			if(input.indexOf(STRING_ARRAY[i].toLowerCase()) != -1)
				System.out.println(STRING_ARRAY[i]);
		}
	}
	
	public static ReturnString method2(String original, int length, char startChar) {
		ReturnString result = new ReturnString();
		
		String lowercaseString = original.toLowerCase();
		char lowercaseChar = Character.toLowerCase(startChar);
		
		if(length > original.length() || lowercaseString.indexOf(lowercaseChar) == -1) {
			String[] error = {"error"};
			result.setStrings(error);
		} else {
			
			int index = lowercaseString.indexOf(lowercaseChar);
			
			StringBuilder tempStr = new StringBuilder();
			int size = 0;
			
			while(index != -1) {
				if (index+length < lowercaseString.length()) {
					tempStr.append(lowercaseString.substring(index, index+length));
					tempStr.append("|");
					size++;
				}
				index = lowercaseString.indexOf(lowercaseChar, index+length);
			}

			
			String[] success = new String[size];
			for(int i=0; i<size; i++) {
				index =  tempStr.indexOf("|");
				success[i] = tempStr.substring(0, index);
				tempStr.delete(0, index+1);
//				System.out.println(i + ", " + success[i]);
			}
			
			result.setStrings(success);
		}
		return result;
	}
	
	public static void method3() {
		
	}
}

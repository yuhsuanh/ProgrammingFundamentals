package lab10;

public class SuperString {

	/**
	 * Find Words inside the Input String
	 * @param inputStr
	 */
	public static void findKeywordInsideString(String inputStr) {
		final String[] STRING_ARRAY = {"Hat", "Cat", "Bat", "Fine", "Pine", "At", "Pi", "Bee", "Art", "Dog"};
		
		String input = inputStr.toLowerCase();
		for(int i=0; i<STRING_ARRAY.length; i++) {
			if(input.indexOf(STRING_ARRAY[i].toLowerCase()) != -1)
				System.out.println(STRING_ARRAY[i]);
		}
	}
	
	/**
	 * Get each substring From "Original" and each substring which length is "length" starts from "startChar"
	 * 
	 * @param original Original String Input
	 * @param length Each Substring Length 
	 * @param startChar Each Substring Start From this character in Original String
	 * @return RetrunStrin Object which include String Array
	 */
	public static ReturnString getSubstringInsideStringByChar(String original, int length, char startChar) {
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
	
}

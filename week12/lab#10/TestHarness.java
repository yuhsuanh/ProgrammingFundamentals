package lab10;

public class TestHarness {

	public static void main(String[] args) {
		SuperString superString = new SuperString();
		//method 1
		superString.findKeywordInsideString("HATCATBATFINEAT");
		
		
		//method 2
		System.out.println();
		ReturnString returnString = superString.getSubstringInsideStringByChar("ABCDEFCHJYCDERLCHHHCYDC", 2, 'c');
		System.out.println("Count: " + returnString.getStrings().length);
		for(String str : returnString.getStrings()) {
			System.out.println(str);
		}
		
	}
	
}

package lab10;

public class TestHarness {

	public static void main(String[] args) {
		SuperString superString = new SuperString();
		//method 1
		superString.method1("HATCATBATFINEAT");
		
		
		//method 2
		System.out.println();
		ReturnString returnString = superString.method2("ABCDEFCHJYCDERLCHHHCYDC", 2, 'c');
		for(String str : returnString.getStrings()) {
			System.out.println(str);
		}
		//method 3
		System.out.println();
		
	}
	
}

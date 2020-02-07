/**
 * Application Purpose: Lab #2
 * Author: Yu-Hsuan Huang
 * Date: 1/15/2020
 */
public class JavaCodeTester {
	public static void main(String[] args) {

		//Challenge 1
		System.out.println("=====Challenge 1=====");
		boolean boolVal = true;
		System.out.println("Boolean type value: " + boolVal);

		char charVal = 'H';
		System.out.println("Character type value: " + charVal);

		String strVal1 = "Hello "; // don't use "new" because String class supports implict instantiation
		String strVal2 = "World";
		System.out.println("String type value: " + strVal1 + strVal2); // String + String is concatenation

		int intVal = 1234;
		System.out.println("Integer type value: " + intVal);

		double doubVal = 1.234567;
		System.out.println("Double type value: " + doubVal);


		//Challenge 2
		System.out.printf("\n\n\n");
		System.out.println("=====Challenge 2=====");
		String strVal3 = "Hello ";
		String strVal4 = "Java ";
		String strVal5 = "Challenge";
		String strComb = strVal3 + strVal4 + strVal5;
		System.out.println(strComb);
		System.out.println(strComb.charAt(2) + strComb.charAt(4) + strComb.charAt(6) + " that display 3rd+5th+7th character in the string");
		System.out.println("" + strComb.charAt(2) + strComb.charAt(4) + strComb.charAt(6) + " that display 3rd+5th+7th character in the string");
		System.out.println(strComb.substring(2, 3) + strComb.substring(4, 5) + strComb.substring(6, 7) + " that display 3rd+5th+7th character in the string");
		// System.out.println("Dsiplay 3rd character: " + strComb.charAt(2));
		// System.out.println("Dsiplay 5th character: " + strComb.charAt(4));
		// System.out.println("Dsiplay 7th character: " + strComb.substring(6, 7));

		System.out.printf("Is the String starts with \"test\": ");
		if(strComb.indexOf("test") == 0) {
			System.out.printf(true + "\n");
		} else {
			System.out.printf(false + "\n");
		}

		System.out.println(strComb.toUpperCase());

		int intVal1 = 1;
		System.out.println("Original: " + intVal1);
		System.out.println("Using the increment operator before the variable name");
		System.out.println(++intVal1);
		System.out.println("Value : " + intVal1);

		System.out.println("Original: " + intVal1);
		System.out.println("Using the increment operator after the variable name");
		System.out.println(intVal1++);
		System.out.println("Value : " + intVal1);


		//Challenge 3
		System.out.printf("\n\n\n");
		System.out.println("=====Challenge 3=====");
		int intVal2 = 123;

		System.out.println("Value : " + intVal2);
		if (intVal2 % 2 == 0) {
			System.out.println(intVal2 + " is an even number");
		} else {
			System.out.println(intVal2 + " is an odd number");
		}

		System.out.printf("\n\n\n");
	}
}
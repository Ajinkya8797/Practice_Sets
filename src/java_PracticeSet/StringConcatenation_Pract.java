package java_PracticeSet;

public class StringConcatenation_Pract {

	public static void main(String[] args) {

		String A1 = "Selenium";
		String A2 = "Automation";
		int I1 = 10;
		int I2 = 20;
		double D1 = 33.22;
		double D2 = 11.89;
		System.out.println(A1 + A2);
		System.out.println(I1 + I2);
		System.out.println(D1 + D2);
		System.out.println(A1 + A2 + I1 + I2 + D1 + D2);
		System.out.println(I1 + I2 + D1 + D2);
		System.out.println(I1 + I2 + A1 + A2 + D1 + D2);
		System.out.println(I1 + A1 + I2 + A2);
		System.out.println(I1 + A1 + D1 + I2 + A2 + D2);

		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 + c2);
		System.out.println(c2 - c1);
		System.out.println((byte) c1);
		System.out.println((byte) c2);
		System.out.println(c1 + 1);
		System.out.println(c1 + "1");
		System.out.println(c1 + 1 == c2);
		System.out.println(c1 + 1 - c2);

		System.out.println();
		
//		 1.Concatenate two strings using + operator. 
//			Input: "Hello" and "World" 
//			Expected Output: "HelloWorld"
		String str1 = "Hello";
		String str2 = "World";
		System.out.println(str1 + str2);

//		 2.Concatenate string and integer. 
//			Input: "Age: " and 25 
//			Expected Output:"Age: 25"
		String str3 = "Age";
		int a1 = 25;
		System.out.println(str3 + ": " + a1);

//		 3.Concatenate strings using .concat() method 
//			Input: "Good" and "Morning"
//			Expected Output: "GoodMorning"
		String str4 = "Good";
		String str5 = "Morning";
		System.out.println(str4.concat(str5));

//		4.Concatenate string and character.
//			Input: "Grade: " and 'A'
//			Expected Output: "Grade: A"
		String str6 = "Grade";
		char ch1 = 'A';
		System.out.println(str6 + ": " + ch1);

//		5.Concatenate strings using StringBuilder.
//			Input: "Java" and "Programming"
//			Expected Output: "JavaProgramming"
		StringBuilder sb = new StringBuilder();
		sb.append("Java");
		sb.append("Programming");
		System.out.println(sb);

//		6.Concatenate first and last name with a space.
//		Input: "Selenium" and "Testing"
//		Expected Output: "Selenium Testing"
		String str7 = "Selenium";
		String str8 = "Testing";
		System.out.println(str7 + " " + str8);

//		7.Concatenate an array of strings into one sentence.
//		Input: ["Java", "is", "fun"]
//		Expected Output: "Java is fun"
		String[] words = { "Java", "Is", "Fun" };
		String Sentence = String.join(" ", words);
		System.out.println(Sentence);

	}

}

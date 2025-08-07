package java_PracticeSet;

public class If_else_Pract {

	public static void main(String[] args) {

//		1.	Check if Number is Positive, Negative, or Zero
		int num = 0;
		if (num > 0) {
			System.out.println("Positive Number");
		} else if (num < 0) {
			System.out.println("Negative Number");
		} else {
			System.out.println("Zero");
		}

//		2.	Even or Odd
		int no = 4;
		if (no % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

//		3.	Greater of Two Numbers
		int a = 10, b = 20;
		if (a > b) {
			System.out.println(a + " : is Greater Number");
		} else {
			System.out.println(b + " : is Greater Number");
		}

//		4.	Voting Eligibility
		int age = 15;
		if (age >= 18) {
			System.out.println("Adult : Eligible for vote");
		} else {
			System.out.println("Underage : Not Eligible to vote ");
		}

//		5.	Vowel or Consonant
		char ch = 'z';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " : is Vowel");
		} else {
			System.out.println(ch + " : is Consonent");
		}

//		6.	Three-Digit Number Check
		int Num = 222;
		if (Num >= 100 && Num <= 999) {
			System.out.println(Num + " : is Three Digit Number");
		} else {
			System.out.println(Num + " : is Not Three Digit Number");
		}

//		7.	Case-Insensitive String Comparison
		String s1 = "Login";
		String s2 = "login";
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Both Strings are equal");
		} else {
			System.out.println("Both Strings are Not equal");
		}

//		8.	Leap Year Check
		int year = 2018;
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + " : is Leap Year ");
		} else {
			System.out.println(year + " : is Not a Leap Year ");
		}

//		9.	Maximum of Three Numbers
		int A = 400, B = 700, C = 600;
		if (A > B && A > C) {
			System.out.println(A + " : is Maximum Number");
		} else if (B > C) {
			System.out.println(B + " : is Maximum Number");
		} else {
			System.out.println(C + " : Is Maximum Number");
		}

//		10.	Empty Field Check
		String email = "";
		if (email.isEmpty()) {
			System.out.println("Field is Empty");
		} else {
			System.out.println("Field has value");
		}

//		11.	Title Match Validation
		String actualTitle = "Amazon";
		String expectedTitle = "Amazon";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title matched : pass");
		} else {
			System.out.println("Title is Different : Fail");
		}

//		12.	Form Completion Check(Mandatory field Check)
		String Name = "Ajinkya";
		String Email = "ABC123@gmail.com";
		String Pass = "";

		if (!Name.isEmpty() && !Email.isEmpty() && !Pass.isEmpty()) {
			System.out.println("Form is Ready");
		} else {
			System.out.println("Form is Incomplete");
		}

//		13.	Dropdown Default Option
		String defaultDropDown = "Select";
		if (defaultDropDown.equals("Select")) {
			System.out.println("Default Drop Down Is Selected");
		} else {
			System.out.println("Custom Option Selected");
		}

//		14.	Password Strength Check
		String Pass1 = "ABC123456123";
		if (Pass1.length() >= 12) {
			System.out.println("Strong Password");
		} else if (Pass1.length() >= 8 && Pass1.length() <= 12) {
			System.out.println("Average Password");
		} else {
			System.out.println("Weak Password");
		}

//		16.	Response Time Check
		int responceTime = 1000;
		if (responceTime <= 1000 && responceTime > 0) {
			System.out.println("Good Performance");
		} else if (responceTime <= 0) {
			System.out.println("Invalid");
		} else {
			System.out.println("Bad Performance");
		}

//		17.	Mobile Number Length Check
		String mobNo = "9876543211";
		if (mobNo.length() == 10) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Mobile Number");
		}

//		18.	Database Connection Status
		boolean DBflag = true;
		if (DBflag) {
			System.out.println("Database is Connected");
		} else {
			System.out.println("Database is Not Connectd");
		}

//		19.	Execution Mode
		String executionMode = "Parallel";
		if (executionMode.equalsIgnoreCase("Parallel")) {
			System.out.println("Execute Tests In Parallel Mode");
		} else {
			System.out.println("Execute Tests in Sequential Mode");
		}

//		20.	ATM Withdrawal Check
		int Balance = 5000;
		int withdrawalAmount = 5001;
		if (Balance <= 0) {
			System.out.println("Insufficient Balance");
		} else if (withdrawalAmount <= 0) {
			System.out.println("Insufficient Balance");
		} else if (withdrawalAmount > Balance) {
			System.out.println("Insufficient Balance");
		} else {
			System.out.println("Withdrawal Successful");
		}

//		21.	Temperature Checker
		int temp = 41;
		if (temp < 15) {
			System.out.println("It's Cold");
		} else if (temp > 15 && temp <= 30) {
			System.out.println("It's Moderate");
		} else {
			System.out.println("it's Hot");
		}

//		22.	Age Group Classifier
		int Age1 = 24;
		if (Age1 <= 13) {
			System.out.println("Child");
		} else if (Age1 <= 18) {
			System.out.println("Teenager");
		} else {
			System.out.println("Adult");
		}

//		23.	Traffic Light Simulation
		String Light = "Red";
		if (Light.equalsIgnoreCase("Green")) {
			System.out.println("Go");
		} else if (Light.equalsIgnoreCase("Yellow")) {
			System.out.println("Go Slow");
		} else if (Light.equalsIgnoreCase("Red")) {
			System.out.println("Stop");
		} else {
			System.out.println("Invalid Signal");
		}

//		24.	Online Shopping Discount Eligibility
		int cartAmount = 200;
		if (cartAmount >= 1000) {
			System.out.println("Discount applied");
		} else {
			System.out.println("Add More items To Get Discount");
		}

//		25.	Student Attendance Validation
		int totalDays = 30;
		int attendedDays = 20;
		if (attendedDays * 100 / totalDays >= 75) {
			System.out.println("Eligible for Exam");
		} else {
			System.out.println("Not Eligible for Exam");
		}

	}

}

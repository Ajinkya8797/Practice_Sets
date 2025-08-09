package java_PracticeSet;

public class Loops_Pract {

	public static void main(String[] args) {

//		1. WAP to print following output 5 Times: I am Batman
		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}

		System.out.println();
//		2. WAP to print following output 5 Times: --> I am Batman 1 ,I am Batman 2,I am Batman 3 upto 9
		for (int j = 1; j < 10; j++) {
			System.out.println("I am Batman" + " " + j);
		}

		System.out.println();
//		3.	WAP to print 10 to 1 using for, while and do-while loop
//		for loop
		for (int A = 10; A >= 1; A--) {
			System.out.println(A);
		}
//		while
		int A = 10;
		while (A >= 1) {
			System.out.println(A);
			A--;
		}
//		Do-while
		int A1 = 10;
		do {
			System.out.println(A1);
			A1--;
		} while (A1 >= 1);

		System.out.println();
//		4.	Write a program in Java to print "Hello World" ten times using while loop
		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello World");
		}

		System.out.println();
//		5.	WAP in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
//		for
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i + " - " + "Multiplication of 5");
			}
		}
//		while
		int x = 1;
		while (x <= 100) {
			if (x % 5 == 0) {
				System.out.println(x + " - " + "Is a Multiplication of 5");
			}
			x++;
		}
//		do-while
		int X = 1;
		do {
			if (X % 5 == 0) {
				System.out.println(X + " - " + "is Multi of 5");
			}
			X++;
		} while (X <= 100);

		System.out.println();
//		6.	Print all odd and even numbers between 1 to 100
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - " + "Even Number");
			} else {
				System.out.println(i + " - " + "Odd Number");
			}
		}

		System.out.println();
//		7.	Print A-Z , a-z, 0-9 with the ASCII numbers the console one using while and for loop.
		// 0-9
		for (char ch = '0'; ch <= '9'; ch++) {
			System.out.println(ch + " - " + (byte) ch);
		}
		// A-Z
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " - " + (byte) ch);
		}
		// a-z
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch + " - " + (byte) ch);
		}

		System.out.println();
//		8.	Print the following series:  1)  1.0 2.0 3.0  ...... 10.0    2)  0 9 18 27 36 …99
//		1)
		for (float f = 1; f <= 10; f++) {
			System.out.println(f);
		}
//		2)
		for (int i = 0; i <= 100; i++) {
			if (i % 9 == 0) {
				System.out.println(i);
			}
		}

		System.out.println();
//		9.	Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		// for
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " - " + "is Vowel");
			} else {
				System.out.println(ch + " - " + "is a Consonent");
			}
		}
		// while
		char ch = 'a';
		while (ch <= 'z') {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " - " + "is Vowel");
			} else {
				System.out.println(ch + " - " + "is a Consonent");
			}
			ch++;
		}

		System.out.println();
//		10.	Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
		}

	}

}

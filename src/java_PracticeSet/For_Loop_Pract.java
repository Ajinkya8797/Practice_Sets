package java_PracticeSet;

import java.util.Scanner;

public class For_Loop_Pract {

	public static void main(String[] args) {

//		1.	Print numbers from 1 to 5
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		System.out.println();
//		2.	Print even numbers between 1 and 10.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " - " + "Even Number");
			}
		}

		System.out.println();
//		3.	Print numbers in reverse from 15 to 1.
		for (int i = 15; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println();
//		4. Print the multiplication table 5.
		int num = 5;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}

		System.out.println();
//		5.	Find the sum of first n natural numbers
		int n = 5;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("sum" + " - " + sum);

		System.out.println();
//		6.	Find the factorial of a given number.
		int N = 5;
		int fact = 1;
		for (int i = 1; i <= N; i++) {
			fact *= i;
		}
		System.out.println("factorial of Given Number" + " is " + fact);

		System.out.println();
//		7.	Print all numbers between 1 and 50 divisible by both 3 and 7.
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}

		System.out.println();
//		8.	Print a right-angled triangle star pattern:
//			*
//			**
//			***
//			****

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
//		9.	Check if a given number is prime
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int Num = sc.nextInt();
		sc.close();
		int temp = 0;
		for (int i = 2; i <= Num - 1; i++) {
			if (Num % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(Num + ":Is Prime Number");
		} else {
			System.out.println(Num + ":Is Non-Prime Number");
		}

		System.out.println();
//		10.	Print all prime numbers between 1 and 100.
		System.out.println("--List of Prime number");
		for (int Num1 = 1; Num1 <= 100; Num1++) {
			int temp1 = 0;
			for (int i = 2; i <= Num1 - 1; i++) {
				if (Num1 % i == 0) {
					temp1 = temp1 + 1;
				}
			}
			if (temp1 == 0) {
				System.out.print(Num1 + " ");
			}
		}
		System.out.println();
		System.out.println("--List of Non-Prime number");
		for (int Num1 = 1; Num1 <= 100; Num1++) {
			int temp1 = 0;
			for (int i = 2; i <= Num1 - 1; i++) {
				if (Num1 % i == 0) {
					temp1 = temp1 + 1;
				}
			}
			if (temp1 != 0) {
				System.out.print(Num1 + " ");
			}
		}

	}

}

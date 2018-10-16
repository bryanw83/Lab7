package Lab7;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Lab7UserInfo {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		String nameVal = validateUserName(scnr , "Please enter your name: ");
		System.out.println();
		String emailVal = validateUserEmail(scnr , "Please enter your email: ");
		System.out.println();
		String phoneVal = validateUserPhone(scnr , "Please enter your phone number: ");
		System.out.println();
		String dateVal = validateUserDate( scnr , "Please enter the date: ");
		
		

	}
	
	public static String validateUserName(Scanner scan, String prompt) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scan, prompt);
			if (input.matches("[A-Z][a-z]{1,15}\\s[A-Z][a-z]{1,15}")) {
				isValid = true;
				System.out.println("Name is valid!");
			} else {
				System.out.println("Sorry, that's not a valid name. Please enter a valid name: ");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}
	public static String validateUserEmail(Scanner scan, String prompt) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scan, prompt);
			if (input.matches("[\\w,-]{5,30}@\\w{5,10}[.]\\w{2,3}")) {
				isValid = true;
				System.out.println("Email is valid!");
			} else {
				System.out.println("Sorry, that's not a valid email. Please enter a valid email: ");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}
	public static String validateUserPhone(Scanner scan, String prompt) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scan, prompt);
			if (input.matches("\\d{3}-\\d{3}-\\d{4}")) {
				isValid = true;
				System.out.println("Phone number is valid!");
			} else {
				System.out.println("Sorry, that's not a valid phone number. Please enter a valid phone number: ");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}
	public static String validateUserDate(Scanner scan, String prompt) {
		boolean isValid = false;
		String input;

		do {
			input = getString(scan, prompt);
			if (input.matches("\\d{2}/\\d{2}/\\d{4}")) {
				isValid = true;
				System.out.println("Date is valid!");
			} else {
				System.out.println("Sorry, that's not a valid date. Please enter a valid date: ");
				isValid = false;
			}
		} while (!isValid);

		return input;
	}
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine();
		return s;
	}
}



//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6

//		int[] numbers = new int[6];
		
//		numbers[0] = 1;
//		numbers[1] = 5;
//		numbers[2] = 2;
//		numbers[3] = 8;
//		numbers[4] = 13;
//		numbers[5] = 6;
		
	// simpler way to write the array that is easier to list numerically or in print
		
		int[] numbers = {1, 5, 2, 8, 13, 6};

		
		// 2. Print out the first element in the array
	
		System.out.println("First element in the array: " + numbers[0]);
		
		// 3. Print out the last element in the array without using the number 5
		
		System.out.println("Last element in the array: " + numbers[numbers.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?

//		System.out.println(numbers[6]);
		System.out.println("Printing position 6 in array creates an exception in thread main since out of bounds for the array.");
		
		// 5. Print out the element in the array at position -1, what happens?

//		System.out.println(numbers[-1]);
		System.out.println("Printing position -1 in array creates an exception in thread main since out of bounds for the array.");
		
		// 6. Write a traditional for loop that prints out each element in the array
	
		System.out.println("Traditional for loop for each element in array");
		
		for (int i = 0; i < numbers.length; i++) {
				System.out.println(numbers[i]);
			}
			
		// 7. Write an enhanced for loop that prints out each element in the array

		System.out.println("Enhanced for loop that prints out each element in array");
		
		for (int i: numbers) {
			System.out.println(i);
		}
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		System.out.println("Write loop that adds each element in the array to the sum, a new variable");
		
		int sum = 0;
		
		for (int i: numbers) {
			sum += i;
		}
			System.out.println(sum);
		
		
		// 9. Create a new variable called average and assign the average value of the array to it
		System.out.println("Average of array");
		int average = sum / numbers.length;
		System.out.println(average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd

		System.out.println("Print odd numbers in array");
		
		for (int i: numbers) {
			if (i % 2 != 0) {
			System.out.println(i);
		}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"

		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array

		int sumOfLetters = 0;
		
		for (String name : names) {
			sumOfLetters += name.length();
		}

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		System.out.println("Method 13:");
		
		greeting("Bob");

		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		
		greet2("Nick");  // return something no print in console
		
		System.out.println(greet2("Nick")); // print something via sysout
		
		String greeting = greet2("Nick");
		System.out.println("Method 14 : \t" + greeting);
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		System.out.println("Compare methods 13 and 14");
		
		System.out.println("The difference is that the first method prints something but does not store it (void) and the second returns or stores it but does not print something.");
	
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		
		isStringLongerThanNumber("Hello", 3); // return no print method
		
		System.out.println("Method 15 : \t" + isStringLongerThanNumber("Hello", 3)); // sysout for print
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		

		
	System.out.println("Method 16 : \t" + doesArrayContainString(names, "Hello"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		System.out.println("Method 17 :\t" + smallestInt(numbers));
		
	// \t creates tab \n creates a new line in console
		
	//	System.out.println(smallestInt(numbers));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		
		System.out.println("Method 18:");
		double[] doubles = {45.7, 30.2, 67.3} ;
		System.out.println(calculateAverage(doubles));
		
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

		System.out.println("Method 19:");
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

		System.out.println("Method 20:");
		System.out.println(hasMoreEvenWordCharacters(names));
		
		
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		System.out.println("Method 21:");
		
		System.out.println(isPalindrome("racecare"));
		
		
		
		
		
		
		
	} // end of main method ************************
	

	
	// 13. Write and test a method that takes a String name and prints out a greeting. 
	//			This method returns nothing.
	
	public static void greeting (String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	
	// 14. Write and test a method that takes a String name and  
	//			returns a greeting.  Do not print in the method.

	public static String greet2 (String name) {
		return "Hi, " + name + "!";
	}
	
	
	// Compare method 13 and method 14:  
	//		a. Analyze the difference between these two methods.
	//		b. What do you find? 
	//		c. How are they different?
	
	
	
	

	// 15. Write and test a method that takes a String and an int and 
	//			returns true if the number of letters in the string is greater than the int
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		if (string.length() > number) {
			return true;
		} else {
			return false;
		}
	}
	
	// 16. Write and test a method that takes an array of string and a string and 
	//			returns true if the string passed in exists in the array
	
	public static boolean doesArrayContainString(String[] array, String string) {	for (String str : array) {
		if (str.equals(string)) {
			return true;
		}
	}
		return false;
	}


	// 17. Write and test a method that takes an array of int and 
	//			returns the smallest number in the array

	public static int smallestInt (int[] arr) {
		int smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			} // end of if
		}	// end of for
				return smallest;

	}	// end of smallestInt method
	
	// 18. Write and test a method that takes an array of double and 
	//			returns the average
	
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
			return sum / array.length;
		}
	
	
	// 19. Write and test a method that takes an array of Strings and 
	//			returns an array of int where each element
	//			matches the length of the string at that position

	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
			return results;
		}
	
	
	// 20. Write and test a method that takes an array of strings and 
	//			returns true if the sum of letters for all strings with an even amount of letters
	//			is greater than the sum of those with an odd amount of letters.

	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		return evenLetters > oddLetters;
	}
	
	
	
	// 21. Write and test a method that takes a string and 
	//			returns true if the string is a palindrome

	
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			} // end return false
		} // end for
		return true;
	} // end palindrome method
	
	
}
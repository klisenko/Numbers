/**
 * 
 */
package cp120.assignments.assignment003;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This Class implements some common arithmetic calculations.
 * 
 * @author Jack R. Lisenko
 * @version 1.0
 */
public class Numbers {
	
	/**
	 * This method determines if a number is a Prime number.
	 * 
	 * @param n	the number to check if it is Prime
	 * @return the result of checking if it is Prime - True or False
	 */		
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		} else if (n <= 3) {
			return true;
		} else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		int i = 5;
		while (i * i <= n) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
			i = i + 6;
		}
		return true;
	}

	/**
	 * This method determines greatest common factor of param1 and param2.
	 * 
	 * @param param1	one of the input values
	 * @param param2	2nd of the input values
	 * @return the greatest common factor as integer
	 */	
	public static int gcf(int param1, int param2) {
		int smallest;
		int largest;
		int factor;

		if (param1 == 0 || param2 == 0) {
			return 0;
		}

		if (param1 <= param2) {
			smallest = param1;
			largest = param2;
		} else {
			smallest = param2;
			largest = param1;
		}

		if (largest % smallest == 0) {
			return smallest;
		}

		int i = 2;
		while (i <= smallest) {
			if (smallest % i == 0) {
				factor = smallest / i;
				if (largest % factor == 0) {
					return factor;
				}

			}
			i = i + 1;
		}
		return 1;
	}

	/**
	 * This method determines least common multiple of param1 and param2.
	 * 
	 * @param param1	one of the input values
	 * @param param2	2nd of the input values
	 * @return the least common multiple as integer
	 */	
	public static int lcm(int param1, int param2) {
		int smallest;
		int largest;

		if (param1 == 0 || param2 == 0) {
			return 0;
		}

		if (param1 <= param2) {
			smallest = param1;
			largest = param2;
		} else {
			smallest = param2;
			largest = param1;
		}

		boolean match = false;
		int multiple = smallest * largest;

		int i = 1;
		while (!match) {
			multiple = smallest * i;
			if (multiple % largest == 0) {
				match = true;
			} else {
				i = i + 1;
			}
		}
		return smallest * i;
	}

	/**
	 * This method determines sum of all the digits of a number.
	 * 
	 * @param num	the value to add up the digits of this number
	 * @return the sum of the digits
	 */	
	public static int digitSum(int num) {
		String numString = String.valueOf(num);
		int length = numString.length();
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = sum + Integer.parseInt(numString.substring(i, i + 1));
		}
		return sum;
	}

	/**
	 * This method determines mean of a set of numbers.
	 * 
	 * @param arr	the set of numbers
	 * @return the mean of the set of numbers
	 */	
	public static double mean(double[] arr) {
		int length = arr.length;
		double sum = 0;
		for (double element : arr) {
			sum = sum + element;
		}
		System.out.println(sum);
		System.out.println(length);
		
		return sum / length;
	}

	/**
	 * This method determines median of a set of numbers.
	 * 
	 * @param arr	the set of numbers
	 * @return the median of the set of numbers
	 */	
	public static double median(double[] arr) {
		int length = arr.length;
		ArrayList<Double> listOfNumbers = new ArrayList<Double>();
		for (double element : arr) {
			listOfNumbers.add(element);
		}
		Collections.sort(listOfNumbers);

		if (length == 1) {
			return listOfNumbers.get(0);
		}
		if (length % 2 == 0) {
			double firstNum = listOfNumbers.get(length / 2 - 1);
			double secondNum = listOfNumbers.get(length / 2);
			return (firstNum + secondNum) / 2;
		} else {
			return listOfNumbers.get(length / 2);
		}
	}

	/**
	 * This method determines factorial of a number.
	 * 
	 * @param num	the number
	 * @return the factorial result
	 */	
	public static BigInteger factorial(int num) {
		BigInteger factValue = BigInteger.valueOf(1);
		for (int i = num; i > 0; i--) {
			factValue = factValue.multiply(BigInteger.valueOf(i));
		}
		return factValue;
	}

	/**
	 * This method determines factorial of a number.
	 * 
	 * @param num	the number as a BigInteger
	 * @return the factorial result
	 */	
	public static BigInteger factorial(BigInteger num) {
		BigInteger factValue = BigInteger.valueOf(1);
		for (int i = num.intValue(); i > 0; i--) {
			factValue = factValue.multiply(BigInteger.valueOf(i));
		}
		return factValue;
	}
}

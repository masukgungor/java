package chapter05;
/*
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find
the greatest common divisor of two integers n1 and n2 is as follows: First find d
to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
a divisor for both n1 and n2 in this order. The first such common divisor is the
greatest common divisor for n1 and n2. Write a program that prompts the user to
enter two positive integers and displays the gcd.
 */
import java.util.Scanner;

public class Chapter05_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two integer number :");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int minNumber = Math.min(number1, number2); //determine minumum number
		
		while (minNumber >= 1) {
			
			if (number1 % minNumber == 0 && number2%minNumber == 0) {
				System.out.println(number1 + " and " + number2 + "  are gcd : " + minNumber);
				break;
			}
			minNumber -- ;
		}
	}

}

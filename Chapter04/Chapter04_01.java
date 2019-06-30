package chapter04;
/*
 * (Geometry: area of a pentagon) Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of the
pentagon
 */

import java.util.Scanner;

public class Chapter04_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length from the center to a vertex: ");

		double radius = input.nextDouble();

		double s = 2 * radius * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

		System.out.printf("The area of the pentagon is: %4.2f ", area);

		input.close();
	}

}

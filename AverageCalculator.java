import java.io.*;
import java.util.*;

public class AverageCalculator{
	static Scanner scan = new Scanner(System.in);
	public static void main (String[] args) {
		double num1, num2, num3, num4, num5, num6, num7, num8, num9, num10 ;
		double ave;
		
		System.out.println("Welcome to Average Calculator!");
		System.out.print("Please enter a number: ");
		num1 = scan.nextDouble();
		System.out.print("Please enter another number: ");
		num2 = scan.nextDouble();
		System.out.print("Please enter another number: ");
		num3 = scan.nextDouble();
		System.out.print("Please enter another number: ");
		num4 = scan.nextDouble();
		System.out.print("Please enter another number: ");
		num5 = scan.nextDouble();
		System.out.print("Please enter another number: ");
		num6 = scan.nextDouble();
		System.out.print("Please enter another number: ");
		num7 = scan.nextDouble();
		System.out.print("Please enter another number: ");
		num8 = scan.nextDouble();
		System.out.print("Please enter another number: ");
		num9 = scan.nextDouble();
		ave = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 )/9;
		System.out.println ("Your final average is:" + ave);
		System.out.println ("CONGRATS");
	}


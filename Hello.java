import java.io.*;
import java.util.*;

public class Hello {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String name;
		int age;
		System.out.println("Hello! Please enter your name:");
		name = scan.nextLine();
		System.out.println("Please enter your age:");
		age = scan.nextInt();
		
		System.out.println("Hello " + name);
		System.out.println("Your age is " + age);
		System.out.println("Thank you and goodbye " + name);
		System.exit(0);
		
	}
}

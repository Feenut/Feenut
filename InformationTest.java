import java.io.*;
import java.util.*;

public class InformationTest {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		String name;
		String sex;
		String address;
		String emergency_contact_person;
		double emergency_contact_person_number;
		int age;
		
		System.out.println("Welcome to Student Information System");
		System.out.println("Please provide your full name:");
		name = scan.nextLine();
		System.out.println("What is your sex?:");
		sex = scan.nextLine();
		System.out.println("Please provide your age:");
		age = scan.nextInt();
		scan.nextLine();
		System.out.println("Please provide your address:");
		address = scan.nextLine();
		System.out.println("Please provide emergency contact person:");
		emergency_contact_person = scan.nextLine();
		System.out.println("Please provide their number:");
		emergency_contact_person_number = scan.nextDouble();
System.out.println("We are committed to protecting your personal information and respecting your privacy.");
		System.out.println("Thank you for using SIS!");
		System.exit(0);
  }
}

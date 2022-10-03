import java.io.*;
import java.util.*;
public class ATM {
public static void main(String args[]) {
	int balance = 100000, withdraw, deposit;
	Scanner s = new Scanner(System.in);
	while(true)
	{
		System.out.println("Giga Chad ATM");
		System.out.println("Choose 1 for Balance");
		System.out.println("Choose 2 for Withdraw Money");
		System.out.println("Choose 3 for Deposit");
		System.out.println("CHoose 4 for Exit");
		System.out.print("What would you like to do?");
		int n = s.nextInt();
		switch(n)
		{
		case 1:
			System.out.print("Your Balance is:"+balance);
			System.out.println("");
			break;
			
		case 2:
			System.out.print("Please enter ammount:");
			withdraw = s.nextInt();
			if(balance >= withdraw)
			{
				balance = balance - withdraw;
				System.out.println("Please collect your money");
			}
			else
			{
				System.out.print("Insufficient balance");
			}
			System.out.println("");
			break;	
			
		case 3:
			System.out.print("Please enter amount to deposit");
			deposit = s.nextInt();
			balance = balance + deposit;
			System.out.print("You have successfully deposited your amount");
			System.out.println("");
			break;
		case 4:
			System.out.println ("Thank you! Have a nice day!");
			System.exit(0);
			}
				
			}
			
		}
		
		
}

import java.util.*;

public class SyCakesSugar {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int sugarpack, cakesproduced, sugarprice, profit =0;
		int sugarpercake =5, wholecakeprice =400;
		
		System.out.println("Welcome to SyCakes");
		System.out.print("Sugar packs delivered:");
		sugarpack = scan.nextInt();
		System.out.print("Sugar price:");
		sugarprice = scan.nextInt();
	
		cakesproduced = (sugarpack / sugarpercake);
		profit = (cakesproduced * wholecakeprice) - (sugarprice * sugarpack);
		
		System.out.println("Cakes produced:" +cakesproduced);
		System.out.println("Cake price:" +wholecakeprice);
		System.out.println("Your profit is:"+ profit);
		System.exit(0);	
	}
}

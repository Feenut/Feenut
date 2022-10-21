//BIGORNIA, PRINCE JOHANZEN BS INFO TECH 1C

import java.util.*;

public class EX2_BSINFOTECH1C_BIGORNIA {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		double taxifare = 60.00, taxikm = 20.00, kmdistax, jeepreg = 11.00, jeepstudsen = 10.00, kmreg = 1.15, kmstud = 0.92, kmjeepreg, kmjeepstud;
		int choices1, choices2;
		double p1, p2, t1;
		
		System.out.println("Choose your vehicle");
		System.out.println("------------------------------");
		System.out.println("1 Taxi");
		System.out.println("2 Jeepney");
		
		choices1 = scan.nextInt();
		
		if (choices1 == 1){
		    System.out.println("Taxi");
		    System.out.println("Please input km");
		    kmdistax =scan.nextDouble();
		    t1 = (taxifare + taxikm )+kmdistax;
		    System.out.println("Your total fare is: "+t1);
		    System.exit(0);
		    
		    }else if (choices1 == 2){
		    System.out.println("Jeepney");
		    }else if (choices1 > 0){
		    System.out.println("Invalid");
		}else{
		}
		
		    System.out.println("Type of passenger");
		System.out.println("------------------------------");
		    System.out.println("1 Regular");
		System.out.println("2 Student/Senior/PWD");
		
		choices2 = scan.nextInt();
		if (choices2 == 1){
		    System.out.println("Regular");
		    System.out.println("Please input km");
		    kmjeepreg =scan.nextDouble();
		    p1 = (jeepreg + kmreg )+kmjeepreg;
		    System.out.println("Your total fare is: "+p1);
		    }else if (choices2 == 2){
		    System.out.println("Studen/Senior/PWD");
		    System.out.println("Please input km");
		    kmjeepstud =scan.nextDouble();
		    p2 = (jeepstudsen + kmstud )+kmjeepstud;
		    System.out.println("Your total fare is: "+p2);
		    }else if (choices2 > 0){
		    System.out.println("Invalid");
		    
		}else{
		    
		    //October 17,2022 11:28 PRINCE JOHANZEN BIGORNIA
		    }
		
		
	}
}

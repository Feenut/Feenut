import java.time.*;
public class SyCompany {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int patientnega, patientposi, remainingroom, units =90, amounttopaynega =100, negatotal, amounttopayposi =200, positotal, extrastaff =300, lgu, quarantine =14, withextrastaff;
		
		LocalDate today = LocalDate.now();
		LocalDate nextWeek = today.plusDays(7);
		LocalDate nextMonth = today.plusDays(14);
		
		System.out.println("Date after mandatory isolation:" + nextWeek);
		System.out.println("Date after 14 day quarantine:" + nextMonth);
		
		System.out.print("Enter negative patient:");
		patientnega = scan.nextInt();
		
		System.out.print("Enter positive patient:");
		patientposi = scan.nextInt();
		
		
		remainingroom = (units) - (patientnega + patientposi);
		
		System.out.println("Remaining rooms:" + remainingroom);
		
		negatotal = (patientnega * amounttopaynega);
		withextrastaff = (patientposi * extrastaff);
		positotal = (withextrastaff * amounttopayposi);
		lgu =(negatotal + positotal / quarantine);
		
		
		System.out.println("Amount to pay for negative patients:" + amounttopaynega);
		System.out.println("Total for Negative Patients:" + negatotal);
		System.out.println("Amount to pay for positive patients:" + amounttopayposi);
		System.out.println("Total for Positive Patients:" + positotal);
		System.out.println("Total for LGU:" + lgu);
		
		
	}
}

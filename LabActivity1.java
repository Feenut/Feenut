import java.util.*;

public class LabActivity1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double spentonvehicles, vehicleexpense =42.20, numberofvehicles, totalmonthbudg, empwages =30.60, foodallow =8.90, insurances =5.80, cloth =6.50, spentonretail =100, salary, halfcloth, spentcloth, totalcloth;
		
		
		System.out.print("Enter number of vehicles: ");
		numberofvehicles = scan.nextDouble();
		
		spentonvehicles = vehicleexpense * numberofvehicles;
		
		System.out.println("Total spent on vehicles: " + spentonvehicles);
		
		totalmonthbudg = spentonretail * 31;
		
		System.out.println("Monthly Budget: " + totalmonthbudg);
		
		salary = empwages / 3;
		
		System.out.println("Salary of employees: " + salary);
		
		halfcloth = cloth / 2;
		
		System.out.print("Enter spent on clothing:");
		spentcloth =scan.nextDouble();
		
		totalcloth = 3 * spentcloth / halfcloth;
		
		System.out.println("Total spent on clothing: " + totalcloth);
		
		//Sept 28,2022 10:06 JOHN NEILBERT BLANCE, PRINCE JOHANZEN BIGORNIA
	}
}

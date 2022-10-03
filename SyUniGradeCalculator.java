import java.util.*;

public class SyUniGradeCalculator {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		double quiz, exam, classpart, lab, acad, extr, fg;
		
		System.out.println("Welcome to Sy University!");
		System.out.println("Please enter your grades");
		System.out.print("Enter your quiz:");
		quiz = scan.nextDouble();
		System.out.print("Enter your exam:");
		exam = scan.nextDouble();
		System.out.print("Enter your classpart:");
		classpart = scan.nextDouble();
		System.out.print("Enter your lab:");
		lab = scan.nextDouble();
		System.out.print("Enter extra curricular: ");
		extra = scan.nextDouble();
		
		acad = (quiz *.3) + (exam *.3) + (classpart *.1) +(lab *.3);
		fg = (acad *.8) + (extra *.2);
		
		System.out.print("Your grade is:" +Math.ceil(fg));
		System.exit(0);
		
	}
}

import java.util.Scanner;

public class LineComparision {
	public static void main(String[] args) {
		System.out.println("Enter coordinates of Line1");
		double lengthOfLine1 = calculate();
		System.out.println("Enter coordinates of line2");
		double lengthOfLine2 = calculate();
		
		System.out.println("length of line1 " +lengthOfLine1);
		System.out.println("length of line2 " +lengthOfLine2);
		
		if ( lengthOfLine1 == lengthOfLine2 )
			System.out.println("length of both lines are equal");	
		else
			System.out.println("length of lines are not equal");
	}
	public static double calculate() {
		Scanner scan =new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2= scan.nextDouble();
		double y2= scan.nextDouble();
		double length = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		return length;
	}	
}
import java.util.*;
public class LineComparision {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter coordinates of Line1");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double lengthOfLine1 = calculate(a,b,c,d);
		
		System.out.println("Enter coordinates of line2");
		double e = scan.nextDouble();
		double f = scan.nextDouble();
		double g = scan.nextDouble();
		double h = scan.nextDouble();
		double lengthOfLine2 = calculate(e,f,g,h);
		
		System.out.println("length of line1 " +lengthOfLine1);
		System.out.println("length of line2 " +lengthOfLine2);
		
		if ( lengthOfLine1 == lengthOfLine2 )
			System.out.println("length of both lines are equal");	
		else
			System.out.println("length of lines are not equal");
	}
	public static double calculate(double x1,double y1, double x2, double y2) {
		double length = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
		return length;
	}
}



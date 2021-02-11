import java.util.*;
public class LineComparision {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter values of Line1 x1,y1 x2,y2");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		double length_line1=Math.sqrt((x2 - x1)^2 + (y2-y1)^2);
		System.out.println("lenght of line1 " +length_line1);
		
		System.out.println("Enter values of Line2 u1,v1 u2,v2");
		int u1 = scan.nextInt();
		int v1 = scan.nextInt();
		int u2 = scan.nextInt();
		int v2 = scan.nextInt();
		double length_line2=Math.sqrt((u2 - u1)^2 + (v2 - v1)^2);
		System.out.println("Lenght of line2 "+length_line2);

		
		if ( length_line1 == length_line2 ) {
			System.out.println("Both lines are equal");	
		}
		else
			System.out.println("lines are not equal");

	}
}

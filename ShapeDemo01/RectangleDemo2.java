package week14exam1;
import java.util.*;

public class RectangleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input width = ");
		double width = scn.nextDouble();
		System.out.print("Input length = ");
		double length = scn.nextDouble();
//		System.out.print("Input color =");
//		String color = scn.nextLine();
		
		Rectangle2 rec = new Rectangle2(width,length);
		System.out.println(rec);
	}

}

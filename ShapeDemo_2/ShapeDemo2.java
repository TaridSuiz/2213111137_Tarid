package week14exam1;
import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
//		System.out.print("Input radius = ");
//		double radius = scn.nextDouble();
//		System.out.print("Input height = ");
//		double height = scn.nextDouble();
//		Circle circle = new Circle(radius,null);
		double[] radius = new double[5];
		double[] height = new double[5];
		
		
//
//		System.out.println("Circle [radius = "+circle.getRadius()+"]");
//		System.out.println("Circle [area = "+circle.getArea()+"]\n");
//		Cylinder cylinder = new Cylinder(radius,height);
//		System.out.println("Cylinder [Height = "+height+"Radius = "+radius+"]");
//		System.out.println("Cylinder [radius = "+cylinder.getArea()+"]");
//		System.out.println("Cylinder [radius = "+cylinder.getVolume()+"]");
		for(int i = 0 ; i<radius.length;i++) {
			System.out.print("Input "+(i+1)+" radius = ");
			radius[i] = scn.nextDouble();
			System.out.print("Input "+(i+1)+" height = ");
			height[i] = scn.nextDouble();
			
		}
		Cylinder[] cylinder = new Cylinder[5];

		for(int i = 0 ; i< cylinder.length;i++) {
			cylinder[i] = new Cylinder(radius[i],height[i]);
			System.out.println("Cylinder "+(i+1)+", volume="+cylinder[i].getVolume());
		}

	}

}

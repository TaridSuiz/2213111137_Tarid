package week14exam1;
import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input radius = ");
		double radius = scn.nextDouble();
		System.out.print("Input height = ");
		double height = scn.nextDouble();
		Circle circle = new Circle(radius,null);
		System.out.println("Circle [radius = "+circle.getRadius()+"]");
		System.out.println("Circle [area = "+circle.getArea()+"]\n");
		Cylinder cylinder = new Cylinder(radius,height);
		System.out.println("Cylinder [Height = "+height+"Radius = "+radius+"]");
		System.out.println("Circle [radius = "+cylinder.getArea()+"]");
		System.out.println("Circle [radius = "+cylinder.getVolume()+"]");



	}

}

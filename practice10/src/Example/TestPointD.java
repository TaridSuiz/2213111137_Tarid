package Example;

public class TestPointD {

	public static void main(String[] args) {
		Poit2D p1 = new Poit2D();
		System.out.println("Defailt x, y of Point2D = "+p1);
		p1.setXY(10,11);
		System.out.println("x, y of Point2D"+p1);
		System.out.println("X of Point2D is : "+p1.getXY()[0]);
		System.out.println("Y of Point2D is : "+p1.getXY()[1]);
		
		Point3D p2 = new Point3D();
		System.out.println("Default x, y and z of Point3d = "+p2);
		p2.setXYZ(10,12,7);
		System.out.println("x, y and z  of Point3D = "+p2);

		System.out.println("X of Point3D is : "+p2.getXYZ()[0]);
		System.out.println("Y of Point3D is : "+p2.getXYZ()[1]);
		System.out.println("Z of Point3D is : "+p2.getXYZ()[2]);

		
		
		
	}

}

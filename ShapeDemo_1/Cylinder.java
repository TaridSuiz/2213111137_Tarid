package week14exam1;

public class Cylinder extends Circle {
	private double height;
	public Cylinder (double radius,double height) {
		super(radius,null);
		this.height=height;
		
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return super.getArea()*height;
	}
	public double getArea() {
		return (Math.PI*2)*(height*super.getRadius());
	}
	public String toString() {
		return "Hight = ["+this.height+"],["+super.toString()+"]";
	}

}

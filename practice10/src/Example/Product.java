package Example;

public class Product {
	private int unit;
	public void setUnit(int unit) {
		this.unit=unit;
	}
	public int getUnit() {
		return unit;
	}
	public int getTotalprice() {
		return 100*unit;
	}
	public String toString() {
		return "You buy "+unit+" units ("+getTotalprice()+").";
	}

}

package Example;

public class PattanakarnBranch extends Product{
	private int payUnit() {
		return super.getUnit()/2;
	}
	private int freeUnit() {
		return super.getUnit()/this.getUnit();
	}
	@Override
	public int getTotalprice() {
		return this.payUnit()*100;
	}
	@Override
	public String toString() {
		return "Your buy"+this.payUnit()
		+"unit get free"+this.freeUnit()+" Unit ("+this.getTotalprice();
	}
	

}

package oop_project;
import java.util.*;
import java.text.*;
public class StockProduct {
	static Scanner sc = new Scanner(System.in);
	static DecimalFormat fm = new DecimalFormat("#,###.00");
	static int total = 0;
	public static void main(String[] args) {
		Product[] productList = new Product[4];
		for(int i = 0 ; i<productList.length ;  i++)
		{
			productList[i] = new Product();
			System.out.print("Input product Id    : ");
			productList[i].setId(sc.next());
			
			
			System.out.print("Input product Unit  : ");
			productList[i].setUnit(sc.nextInt());
			while(productList[i].getUnit()<0) {
				System.out.print("Input product Unit, Again  : ");
				productList[i].setUnit(sc.nextInt());
			}
			
			System.out.print("Input product Price : ");
			productList[i].setPrice(sc.nextDouble());
			while(productList[i].getPrice()<0) {
				System.out.print("Input product Price, Again  : ");
				productList[i].setPrice(sc.nextDouble());
			}
			
			System.out.println();
			
			

		}
		Line.line();
		for(Product _pd : productList) {
			System.out.println("Product ID : "+_pd.getID()+"Total price = "+fm.format(_pd.calculate()) + " Baht.");
		}
		Line.line();
		for(Product _total : productList) {
			total += _total.calculate();
		}
		System.out.print("Total price of all products is " +fm.format(total)+" baht.");
	}

}

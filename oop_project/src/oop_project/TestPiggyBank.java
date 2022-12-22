package oop_project;
import java.util.*;
public class TestPiggyBank {
	static Scanner scn = new Scanner(System.in);
	static piggybank pg = new piggybank();

	public static void main(String[] args) {

		sizeOfPiggyBank();
	}
	public static void sizeOfPiggyBank() {
		System.out.println("Money Total : "+pg.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		//int size = scn.nextInt();
		//pg.setPiggyBank(size);
		pg.setPiggyBank(scn.nextInt());
		System.out.println("Size of your PiggyBank : "+pg.getPiggyBank());
		inputCoin();
		
	}
	public static void inputCoin() {
		while(true) {
		System.out.println("---------------------------------");
		System.out.println("Menu of PiggyBank");
		System.out.println("---------------------------------");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit");
		System.out.println("---------------------------------");
		
		System.out.print("Please select choice : ");
		int choice = scn.nextInt();
		
		if (choice == 1 ) {
			System.out.print("Insert 1 baht :");
			pg.addOne(scn.nextInt());
			System.out.println("Money Total : "+pg.getTotal());
		}
		else if (choice == 2 ) {
			System.out.print("Insert 2 baht :");
			pg.addTwo(scn.nextInt());
			System.out.println("Money Total : "+pg.getTotal());
		}
		else if (choice == 3 ) {
			System.out.print("Insert 5 baht :");
			pg.addFive(scn.nextInt());
			System.out.println("Money Total : "+pg.getTotal());
		}
		else if (choice == 4 ) {
			System.out.print("Insert 1 baht :");
			pg.addTen(scn.nextInt());
			System.out.println("Money Total : "+pg.getTotal());
		}
		else if (choice == 5 ) {
			System.out.println("Bye Bye");
			break;
		
		}
		}




	}

}

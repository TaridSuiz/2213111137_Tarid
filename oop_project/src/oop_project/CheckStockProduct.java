package oop_project;

import java.util.*;

public class CheckStockProduct {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("How many product list in stock : ");
		int inputlist = scn.nextInt();
		Product[] list = new Product[inputlist];
		System.out.println();
		for (int i = 0; i < list.length; i++) {
			list[i] = new Product();
			System.out.print("Input product Id   : ");
			list[i].setId(scn.next());
			System.out.print("Input product Unit : ");
			list[i].setUnit(scn.nextInt());
			System.out.println();

		}
		Line.line();
		System.out.println("List of product in 'LOW' status.");
		Line.line();

		for (Product _list : list) {
			
			if (_list.setstatus(_list.getUnit() ) == "LOW") {
				System.out.println(">> " + _list.getID() + " has " + _list.getUnit() + " units");
			}
			

		}
		Line.line();
		System.out.println("List of product in 'NORMAL' status.");
		Line.line();
		for (Product _list : list) {
			
			if (_list.setstatus(_list.getUnit() ) == "NORMAL") {
				System.out.println(">> " + _list.getID() + " has " + _list.getUnit() + " units");
			}

		}
		Line.line();
		System.out.println("List of product in 'HIGH' status.");
		Line.line();
		for (Product _list : list) {
			
			if (_list.setstatus(_list.getUnit() ) == "HIGH") {
				System.out.println(">> " + _list.getID() + " has " + _list.getUnit() + " units");
			}

		}
	}
}

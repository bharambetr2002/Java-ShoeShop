package com.app.ui;

import java.util.Scanner;

import com.app.customerexception.SGMCException;
import com.app.services.SGMOperationImpl;
import com.app.services.SGMOperations;

public class tester {
	public static void main(String[] args) throws SGMCException {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.println("Enter The number of products : ");
			SGMOperations ops = new SGMOperationImpl(scn.nextInt());

			boolean exit = true;
			while (exit) {
				System.out.println("-----Menu-----");
				System.out.println("1. Add new Shoes");
				System.out.println("2. Display All Shoes");
				System.out.println("3. Search Most Expensive Shoe");
				System.out.println("0. Exit");
				System.out.println("Enter Your choice");
				try {
					switch (scn.nextInt()) {
						case 1:
							// String name, String brand, int ratings, double price, boolean
							// isAvailble,ShoeType type
							System.out.println("Enter Name, Brand, Ratings(1-10), Price, Available(true/false),Type");
							ops.addShoe(scn.next(), scn.next(), scn.nextInt(), scn.nextDouble(), scn.nextBoolean(),
									scn.next());
							break;
						case 2:
							ops.displayAllShoes();
							break;
						case 3:
							ops.displayExpensideShoe();
						case 0:
							exit = false;
							break;
						default:
							System.out.println("Invalid Input");
							break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					scn.nextLine();
				}
			}
		}
	}
}

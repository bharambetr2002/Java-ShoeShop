package com.app.services;

import java.util.ArrayList;

import com.app.core.ShoeGallery;
import com.app.core.ShoeType;
import com.app.customerexception.SGMCException;
import com.app.validations.ValidationRules;

public class SGMOperationImpl implements SGMOperations {
	private ArrayList<ShoeGallery> list;

	public SGMOperationImpl(int size) throws SGMCException {
		list = new ArrayList<>(size);
		addShoe("aaaa", "a1", 8, 1100, true, "FORMALS");
		addShoe("bbbb", "a2", 9, 1120, true, "CASUALS");
		addShoe("cccc", "a2", 9, 1130, false, "SPORTS");
		addShoe("dddd", "a3", 7, 1140, true, "FORMALS");
	}

	@Override
	public void addShoe(String name, String brand, int ratings, double price, boolean isAvailble, String type)
			throws SGMCException {
		String vname = ValidationRules.validateName(name);
		int vrating = ValidationRules.validateRating(ratings);
		ShoeType vtype = ValidationRules.validateType(type);
		ShoeGallery vshoe = new ShoeGallery(vname, brand, vrating, price, isAvailble, vtype);
		list.add(vshoe);
		System.out.println("Shoe Added Successfully");
	}

	@Override
	public void displayAllShoes() {
		for (ShoeGallery s : list) {
			System.out.println(s);
		}
	}

	@Override
	public void displayExpensideShoe() {
		double max = Integer.MIN_VALUE;
		for (ShoeGallery g : list) {
			while (max < g.getPrice()) {
				max = g.getPrice();
			}
		}
		for (ShoeGallery g : list) {
			if (max == g.getPrice()) {
				System.out.println(g);
			}
		}

	}

	@Override
	public void deleteShoeNotAvailable() {
		boolean found = false;
		var itr = list.iterator();
		while (itr.hasNext()) {
			ShoeGallery g = itr.next();
			if (!g.isAvailble()) {
				itr.remove();
				found = true;
			}
		}
		if (found)
			System.out.println("Removed all unavailable shoes successfully.");
		else
			System.out.println("No unavailable shoes found.");
	}

}

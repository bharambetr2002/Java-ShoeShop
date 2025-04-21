package com.app.services;

import java.util.ArrayList;

import com.app.core.ShoeGallery;
import com.app.core.ShoeType;
import com.app.customerexception.SGMCException;
import com.app.validations.ValidationRules;

public class SGMOperationImpl implements SGMOperations {
		private ArrayList<ShoeGallery> list;

		public SGMOperationImpl(int size) {
			list = new ArrayList<>(size);
		}

		@Override
		public void addShoe(String name, String brand, int ratings, double price, boolean isAvailble, String type) throws SGMCException {
			String vname = ValidationRules.validateName(name);
			int vrating = ValidationRules.validateRating(ratings);
			ShoeType vtype = ValidationRules.validateType(type);
			ShoeGallery vshoe = new ShoeGallery(vname, brand, vrating, price, isAvailble, vtype);
			list.add(vshoe);
			System.out.println("Shoe Added Successfully");
		}

		@Override
		public void displayAllShoes() {
			for(ShoeGallery s : list) {
				System.out.println(s);
			}
		}
		
}

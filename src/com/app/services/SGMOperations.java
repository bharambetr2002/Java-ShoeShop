package com.app.services;

import com.app.customerexception.SGMCException;

public interface SGMOperations {

	void addShoe(String name, String brand, int ratings, double price, boolean isAvailble, String type) throws SGMCException;

	void displayAllShoes();

	
}

package com.app.validations;

import com.app.core.ShoeType;
import com.app.customerexception.SGMCException;

public class ValidationRules {

	public static String validateName(String name) throws SGMCException {
		if(name.length() > 2 && name.length() <= 10) {
			return name;
		}else {
			throw new SGMCException("Invalid Name Length");
		}
	}

	public static int validateRating(int ratings) throws SGMCException {
		if(0<ratings && ratings <= 10) {
			return ratings;
		}else {
			throw new SGMCException("Invalid Rating");
		}
	}

	public static ShoeType validateType(String type) {
		return ShoeType.valueOf(type.toUpperCase());
	}
		
}

package com.sp.exc;

public class ProductNotFoundException extends Exception{

	public ProductNotFoundException(String msg) {
		
		super(msg);
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}

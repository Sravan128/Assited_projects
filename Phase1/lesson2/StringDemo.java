package com;

public class StringDemo {

	public static void main(String[] args) {
        		
		
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "JAVA"; 
       
        StringBuffer sbr = new StringBuffer(str); 
        sbr.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(sbr); 
          
        StringBuilder sbl = new StringBuilder(str); 
        sbl.append("FSD"); 
        System.out.println("String to StringBuilder");
        System.out.println(sbl);              

	}

}

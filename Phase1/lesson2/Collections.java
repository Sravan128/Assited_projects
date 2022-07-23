package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;


public class Collections {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<Integer> al=new ArrayList<Integer>();   
	      al.add(25);
	      al.add(28);   
	      al.add(353);
	      System.out.println(al);  
		
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(47); 
	      vec.addElement(57); 
	      vec.addElement(78);
	      System.out.println(vec);
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("kumar");  
	      names.add("reddy");  
	      names.add("sravas");
	      Iterator<String> i=names.iterator();  
	      while(i.hasNext()){  
	       System.out.println(i.next());  
	      }
	      
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Character> hs=new HashSet<Character>();  
	       hs.add('S');  
	        hs.add('K');  
	       hs.add('R');
	       System.out.println(hs);

	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Double> lhs=new LinkedHashSet<Double>();  
	       lhs.add(34.45);  
	       lhs.add(25.98);  
	       lhs.add(14.76);	       
	       System.out.println(lhs);

	}

}

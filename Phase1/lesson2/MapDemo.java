package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
         public static void main(String args[]) {
        	 HashMap<Integer,String> hm=new HashMap<Integer,String>();      
   	      hm.put(1,"Sravas");    
   	      hm.put(2,"Kumar");    
   	      hm.put(3,"Reddy");   
   	       
   	      System.out.println("The elements in Hashmap : ");  
   	      for(Map.Entry m:hm.entrySet()){    
   	       System.out.println(m.getKey()+" "+m.getValue());    
   	      }
   	       
   	      Hashtable<Integer,String> car=new Hashtable<Integer,String>();  
   	     car.put(1,"Rolls");  
   	     car.put(2,"BMW");  
   	      car.put(3,"Benz");  

   	      System.out.println("The elements in HashTable : ");  
   	      for(Map.Entry n:car.entrySet()){    
   	       System.out.println(n.getKey()+" "+n.getValue());    
   	      }
   	      
   	      
   	      TreeMap<Integer,String> fruits=new TreeMap<Integer,String>();    
   	      fruits.put(1,"Apple");    
   	      fruits.put(2,"Banana");    
   	      fruits.put(3,"Mango");       
   	      
   	      System.out.println("The elements in TreeMap : ");  
   	      for(Map.Entry l:fruits.entrySet()){    
   	       System.out.println(l.getKey()+" "+l.getValue());    
   	      }    
   	      

        	 
         }
}

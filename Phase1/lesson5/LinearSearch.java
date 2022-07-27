package lesson5;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
	static ArrayList<Integer> arr=new ArrayList<Integer>(); 
	public static boolean search(int k) {
		for(int i=0;i<10;i++) {
		
			if(arr.get(i)==k) {
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			arr.add(i+1);
		}
		System.out.println("Enter element to search");
		int key=sn.nextInt();
		if(search(key)) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
	}

}

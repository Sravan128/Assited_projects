package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static boolean bsearch(int[] a ,int k,int f,int l ) {
		int mid=(f+l)/2;
		if(a[mid]==k) {
			return true;
		}
		else if(a[mid]>k) {
			bsearch(a,k,mid+1,l);
		}
		else {
			bsearch(a,k,f,mid-1);
		}
		return false;
	}
       public static void main(String args[]) {
    	   Scanner sn=new Scanner(System.in);
    	   int a[]=new int[10];
    	   System.out.println("Enyter array elements");
    	   for(int i=0;i<10;i++) {
    		   a[i]=sn.nextInt();
    	   }
    	   Arrays.sort(a);//for binary search elements to be in sorted order
    	   System.out.println("Enter element to search");
    	   int k=sn.nextInt();
    	   if(bsearch(a,k,0,9)) {
    		   System.out.println("Element found");
    	   }
    	   else {
    		   System.out.println("Element not found");
    	   }
    	   
       }
}

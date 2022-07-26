package lesson4;

import java.util.Scanner;

class Rotate { 
public void rotate(int[] a, int k) {
    		if(k > a.length) 
       			k=k%a.length;
 		int[] result = new int[a.length];
 		for(int i=0; i < k; i++){
        			result[i] = a[a.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<a.length; i++){
        			result[i] = a[j];
                     j++;
    		}
 		System.arraycopy( result, 0, a, 0, a.length );
}
} 


public class ArrayRotate {
	public static void main(String[] args) {
		Rotate r = new Rotate();
		Scanner sn=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n=sn.nextInt();
        System.out.println("Enter array Elements : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sn.nextInt();
        }	
          System.out.println("Enter element from where to ratate array : ");
          int a=sn.nextInt();
        		r.rotate(arr, a); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}

package com;
import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		System.out.println("Implementing one dimentional arrays");
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter aray size : ");
		int n=sn.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements : ");
        for(int i=0;i<n;i++) {
        	a[i]=sn.nextInt();
        }
        System.out.println("Array values are : ");
        for(int x: a) {
        	System.out.println(x);
        }
        System.out.println("Implementing two dimentional arrays");
        System.out.print("Enter array row size : ");
        int r=sn.nextInt();
        System.out.print("Enter array coloumn size : ");
        int c=sn.nextInt();
        int b[][]=new int[r][c];
        System.out.println("Enter array elements : ");
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		b[i][j]=sn.nextInt();
        	}
        }
        System.out.println(" Array elements : ");
        for(int[] x : b) {
        	for(int y: x) {
        		System.out.print(y+" ");
        	}
        	System.out.println();
        }
	}

}

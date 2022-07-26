package lesson4;

import java.util.Scanner;
class Multiply{
	public int[][] multiply(int[][] matrix1,int[][] matrix2,int r1,int c1,int c2){
		int[][] res=new int[r1][c2];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
					res[i][j]=res[i][j]+(matrix1[i][k]*matrix2[k][j]);
				}
			}
		}
		return res;
	}
}

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
	    System.out.println("Enter row and column size of first Matrix : ");
	    int r1=sn.nextInt();
	    int c1=sn.nextInt();
	    System.out.println("Enter row and column size of second matrix : ");
	    int r2=sn.nextInt();
	    int c2=sn.nextInt();
	    int matrix1[][]=new int[r1][c1];
	    int matrix2[][]=new int[r2][c2];
	    System.out.println("Enter first matrix elements : ");
	    for(int i=0;i<r1;i++) {
	    	for(int j=0;j<c1;j++) {
	    		matrix1[i][j]=sn.nextInt();
	    	}
	    }
	    System.out.println("Enter Second matrix elements : ");
	    for(int i=0;i<r1;i++) {
	    	for(int j=0;j<c1;j++) {
	    		matrix2[i][j]=sn.nextInt();
	    	}
	    }
	    if(c1==r2) {
	    	Multiply m=new Multiply();
	    	int res[][]=new int[r1][c2];
	    	res=m.multiply(matrix1, matrix2, r1, c1, c2);
	    	System.out.println("Matrix Multiplication result = ");
	    	for(int i=0;i<r1;i++) {
	    		for(int j=0;j<c2;j++) {
	    			System.out.print(res[i][j]+" ");
	    		}
	    		System.out.println();
	    	}
	    }
	}

}

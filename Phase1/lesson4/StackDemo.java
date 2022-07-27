package lesson4;

import java.util.Scanner;
class StackOperations{
	int top;
	
	int a[]=new int[5];
	StackOperations(){
		top=-1;
     
	}
	
	public void push(int k) {
		if(top<5) {
			a[++top]=k;
			System.out.println("Element pushed Successfully");
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack underflow");
		}
		else {
			System.out.println(a[top]+" Poped succesfully");
			top--;
		}
	}
	public int peek() {
		if(top==-1) {
			System.out.println("Stack underflow");
			return 0;
		}
		return a[top];
	}
	public boolean search(int k) {
		for(int i=0;i<=top;i++) {
			if(a[i]==k) {
				return true;
			}
		}
		return false;
	}
	public void printele() {
		for(int i=top;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}

public class StackDemo {

	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		StackOperations so=new StackOperations();
	 String con="";
	 do {
		 System.out.println("1.push  2.pop 3.peek 4.search  5.print  ");
		 int n=sn.nextInt();
		 switch(n) {
		 case 1 :System.out.println("Enter element to push ");
		        int k=sn.nextInt();
		        so.push(k);
			 break;
		 case 2:  so.pop();
			 break;
		 case 3 :System.out.println("Top most element in stack is "+so.peek());
			 break;
		 case 4 : System.out.println("Enter element to search");
		         int key=sn.nextInt();
		         if(so.search(key)) {
		        	 System.out.println("Element found");
		         }
		         else {
		        	 System.out.println("Element not found");
		         }
			 break;
		 case 5 :System.out.println("Stack elements are : ");
		        so.printele();
			 break;
		default  :System.out.println("Wrong value Entered");
			break;
		 
		 }
		 System.out.println("Do you want to continue ");
		 con=sn.next();
	 }while(con.equalsIgnoreCase("y"));
		
	}

}

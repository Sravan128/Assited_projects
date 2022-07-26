package lesson4;

import java.util.Scanner;

class LinkedList{
	class Node{
		int data;
		Node next;
	Node(){
		this.data=0;
		next=null;
	}
		Node(int data){
			this.data=data;
			next=null;
			
		}
	}
	Node head=null;
	public void insert(LinkedList list,int k){
		Node new_node=new Node(k);
		if(list.head==null) {
			list.head=new_node;
		}
		else {
			Node  node=new Node();
			node=list.head;
			while(node.next!=null) {
				node=node.next;
			}
			node.next=new_node;
			
		}
	}
	public boolean delete(LinkedList list, int k) {
		Node node=new Node();
		Node prev=new Node();
		if(list.head.data==k) {
			head=head.next;
			return true;
         }
		else {
			node=prev=list.head;
			
			while(node!=null) {
				if(node.data==k) {
					prev.next=node.next;
					return true;
				}
				prev=node;
				node=node.next;
			}
		}
		return false;
	}
	public boolean searchele(LinkedList list,int k) {
		Node node=new Node();
		node=list.head;
		while(node!=null) {
			if(node.data==k) {
				return true;
			}
			node=node.next;
		}
		return false;
	}
	public void printele(LinkedList list) {
		Node node=new Node();
		node=list.head;
		if(head==null) {
			System.out.println("No elements in the list");
		}
		else {
		while(node.next!=null) {
			System.out.print(node.data+"-->");
			node=node.next;
		}
		System.out.println(node.data);
		}
	}

	
}

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		LinkedList list=new LinkedList();
		String con="";
		do {
			System.out.println("1. insert  2. delete  3. search  4.print ");
			System.out.println("Enter your choice : ");
			int a=sn.nextInt();
			switch(a) {
			
			case 1: System.out.println("Enter value to insert : ");
			     int k=sn.nextInt();
				list.insert(list, k);
				System.out.println("Element inserted successfully ");
				break;
			case 2:System.out.println("Enter element to delete ");
			     int d=sn.nextInt();
			    boolean b=list.delete(list, d);
			     if(b) {
			    	 System.out.println("Element deleted successfully");
			     }
			     else {
			    	 System.out.println("Element not found");
			     }
				break;
			case 3: System.out.println("Enter element to search ");
			     int s=sn.nextInt();
			   boolean t= list.searchele(list, s);
			     if(t) {
			    	 System.out.println("Element found");
			     }
			     else {
			    	 System.out.println("Element not found");
			     }
				break;
			case 4:System.out.println("Elements in list : ");
			       list.printele(list);
			       break;
			 default :
				 System.out.println("Wrong value entered");
			}
			System.out.println("Do you want to continue .");
			con=sn.next();
		}while(con.equalsIgnoreCase("y"));
       System.out.println("Thank you");
	}

}

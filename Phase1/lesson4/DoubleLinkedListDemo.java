package lesson4;

import java.util.Scanner;

class DLinkedList{
	class Node{
		int data;
		Node next;
		Node prev;
	Node(){
		this.data=0;
		next=null;
		prev=null;
	}
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null;
	Node last=null;
	public void insert(DLinkedList list,int k){
		Node new_node=new Node(k);
		if(list.head==null) {
			list.head=new_node;
			list.last=new_node;
		}
		else {
			      new_node.prev=list.last;
                list.last.next=new_node;
                list.last=new_node;
                
		}
	}
	public boolean delete(DLinkedList list, int k) {
		Node node=new Node();
		Node temp=new Node();
		if(list.head==null) {
			System.out.println("No elements are present to delete ");
			return false;
		}
		if(list.head.data==k && list.head.next==null) {
			list.head=null;
			list.last=null;
			return true;
		}
		
		if(list.head.data==k) {
			list.head=list.head.next;
			list.head.prev=null;
			return true;
			
         }
		else if(list.last.data==k) {
			list.last=list.last.prev;
			list.last.next=null;
		}
		else {
			node=list.head;
			
			while(node!=null) {
				if(node.data==k) {
					node.next.prev=temp;
					temp.next=node.next;
					return true;
				}
				temp=node;
				node=node.next;
			}
			
		}
		return false;
	}
	public boolean searchele(DLinkedList list,int k) {
		Node node=new Node();
		node=list.head;
		if(list.head==null) {
			System.out.println("No elements are present to search ");
			return false;
		}
		while(node.next!=null) {
			if(node.data==k) {
				return true;
			}
			node=node.next;
		}
		if(node.data==k) {
			return true;
		}
		return false;
	}
	public void printele(DLinkedList list) {
		Node node=new Node();
		
		if(list.head==null) {
			System.out.println("No elements in the list");
		}
		else {
			System.out.println("From front side : ");
		    node=list.head;
		while(node.next!=null) {
			System.out.print(node.data+"-->");
			node=node.next;
		}
		System.out.println(node.data);
		System.out.println("From back side ");
		node=list.last;
		while(node.prev!=null) {
			System.out.print(node.data+"-->");
			node=node.prev;
		}
		System.out.println(node.data);
		System.out.println("From back side ");
		}
	}

	
}


public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		DLinkedList list=new DLinkedList();
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

package lesson4;

import java.util.Scanner;



class CLinkedList{
	class Node{
		int data;
		Node next;
	Node(){
		this.data=0;
		next=null;
	}
		Node(int data){
			this.data=data;
			this.next=head;
		}
	}
	Node head=null;
	public void insert(CLinkedList list,int k){
		Node new_node=new Node(k);
		if(list.head==null) {
			list.head=new_node;
			list.head.next=list.head;
		}
		else {
			Node  node=new Node();
			node=list.head;
			while(node.next!=list.head) {
				node=node.next;
			}
			node.next=new_node;
			
		}
	}
	public boolean delete(CLinkedList list, int k) {
		Node node=new Node();
		Node prev=new Node();
		if(list.head==null) {
			System.out.println("No elements are present to delete ");
			return false;
		}
		if(list.head.next==list.head&& list.head.data==k) {
			list.head=null;
			return true;
		}
		if(list.head.data==k) {
			node=list.head;
			while(node.next!=list.head) {
				node=node.next;
			}
			list.head=list.head.next;
			node.next=list.head;
			return true;
			
         }
		else {
			node=prev=list.head;
			
			while(node.next!=list.head) {
				if(node.data==k) {
					prev.next=node.next;
					return true;
				}
				prev=node;
				node=node.next;
			}
			if(node.data==k) {
				prev.next=node.next;
				return true;
			}
		}
		return false;
	}
	public boolean searchele(CLinkedList list,int k) {
		Node node=new Node();
		node=list.head;
		if(list.head==null) {
			System.out.println("No elements are present to search ");
			return false;
		}
		while(node.next!=list.head) {
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
	public void printele(CLinkedList list) {
		Node node=new Node();
		node=list.head;
		if(list.head==null) {
			System.out.println("No elements in the list");
		}
		else {
		while(node.next!=list.head) {
			System.out.print(node.data+"-->");
			node=node.next;
		}
		System.out.println(node.data+"-->"+node.next.data);
		}
	}

	
}

public class CircularLinkedListDemo {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		CLinkedList list=new CLinkedList();
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

package com;

class Employee{
	int id;
	String name;
	double salary;
	Employee(){
		id=576;
	name="sravan";
	salary=7990.56;
	}
	Employee(int id1,String name1,double salary1){
		id=id1;
		name=name1;
		salary=salary1;
	}
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("Employee details : ");
		System.out.println("id : "+id+" name : "+name+" Salary : "+salary);
	}
}

public class Constructors {

	public static void main(String[] args) {
		Employee emp1=new Employee();
	     emp1.display();
	     Employee emp2=new Employee(456,"kumar",8500.98);
	     emp2.display();
	     Employee emp3=new Employee(583,"reddy",9875);
	     emp3.display();

	}

}

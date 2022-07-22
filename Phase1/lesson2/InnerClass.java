package com;
class ABC{
	private int a=10;
	int b=5;
	class XYZ{
		void display() {
			System.out.println("Value of private a from innerclass = "+a);
			System.out.println("Value of b  "+b);
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		ABC abc=new ABC();
       ABC.XYZ xyz=abc.new XYZ();
       xyz.display();   
	}

}

package com;

class A{
	public void method1() {
		System.out.println("method without returntype and without parameters");
	}
	public void method1(int a,int b) {
		System.out.println("method without returntype and with parameters ");
		System.out.println("sum= "+(a+b));
	}
	public int method2() {
		return 5+3;
	}
	public int method2(int a,int b) {
		return a+b;
	}
}
public class Methods {

	public static void main(String[] args) {
		A a=new A();
		a.method1();
		a.method1(7,5);
		System.out.println("method with returntype and without parameters ");
		System.out.println("Sum = "+a.method2());
		System.out.println("method with returntype and with parameters");
		System.out.println("Sum = "+a.method2(9,8));
	}

}

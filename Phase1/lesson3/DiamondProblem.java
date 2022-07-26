package lesson3;
interface A{
	default void display() {
		System.out.println("In interface A");
	}
}
interface B{
	default void display() {
		System.out.println("In interface B");
	}
}
class C implements A,B{
	public void display() {
		A.super.display();
		B.super.display();
	}
}
public class DiamondProblem {

	public static void main(String[] args) {
		C c=new C();
		c.display();
	}

}

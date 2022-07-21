
public class TypeCasting {

	public static void main(String[] args) {
		char c='s';
		int a=c;//implicit conversion char to int
		float b=c;//implicit conversion char to float;
		int f=5;
		double d=f;// implicit conversion int to double
		System.out.println(" value of c : "+c);
		System.out.println(" value of a : "+a);
		System.out.println(" value of b : "+b);
		System.out.println(" value of f : "+f);
		System.out.println(" value of d : "+d);
		//Explicit conversion example
		double k=6.55;
		System.out.println(" value of k : "+k);
		System.out.println(" value of k in int : "+(int)k);
	}

}

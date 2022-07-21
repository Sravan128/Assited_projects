
class Access{
	private int a;
	protected int b;
	public char c;
	void getA(int a) {
		this.a=a;
		System.out.println("value of private a in the same class method = "+a);
	}
}
class Access2 extends Access{
	void getB(int b1) {
		b=b1;
		System.out.println("Value of protected b from inherited sub class method = "+b);
	}
}
public class AccessSpecifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Access ac=new Access();
          ac.getA(5);
          ac.c='s';
          System.out.println("Value of c from main class = "+ac.c);
          Access2 ac2=new Access2();
          ac2.getB(7);
	}

}

package lesson3;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=0;
		int b=10;
		try {
			if(a==0)
			throw(new ArithmeticException("divide by zero"));
			else
			System.out.println(b/a);
		}
		catch(Exception e) {
			System.out.println("Exception  : "+e.getMessage());
		}
	}

}

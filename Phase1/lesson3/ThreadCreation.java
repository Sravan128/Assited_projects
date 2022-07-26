package lesson3;

public class ThreadCreation extends Thread{
	public void run()
 	{
  		System.out.println(" Thread started running.");
}

	public static void main(String[] args) {
		ThreadCreation mt = new ThreadCreation();
  		mt.start();
	}

}

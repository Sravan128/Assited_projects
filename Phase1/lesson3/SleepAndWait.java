package lesson3;

public class SleepAndWait extends Thread{
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println("i = "+i);
				Thread.sleep(500);
		  }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
               SleepAndWait sw=new SleepAndWait();
               sw.setName("thread");
               sw.start();
	}

}

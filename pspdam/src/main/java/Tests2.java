public class Tests2 {
	private static Tests c =  new Tests(100);
	
	public static void run() {
		for (int i = 0; i < 100; i++) {

			c.inc();
			try {
			Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
	}
	public static void main(String[] args) throws InterruptedException   {
		Thread t1 = new Thread(Tests2::run);
		Thread t2 = new Thread(Tests2::run);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Contador = " + c.get());
	}
}
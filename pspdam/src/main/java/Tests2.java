public class Tests2 {
	public static void main(String[] args) throws InterruptedException   {
		Thread r =  new Thread(() -> {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("a");
			}
			System.out.println("out");
		});
		 r.start();
		 Thread.sleep(1000);
		 r.interrupt();
		 r.join();
		 System.out.println("b");
	}
}
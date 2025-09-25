import java.lang.invoke.VolatileCallSite;

public class Tests {
   private volatile static int x = 0 ; 
	public static void main(String[] args) {
		
		
		Thread r = new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						for(;;) {
							if(x % 2 == 0) {
								System.out.println("TIC");
								x++;
							}
						}
					}
				}
				);
		Thread r1 = new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						for(;;) {
							if(x % 2 != 0) {
								System.out.println("TAC");
								x++;
							}
						}
					}
				}
				);
		r.start();
		r1.start();
		
	}
	

}
public class Tests {
	
	private int n;
	
	public Tests (int n) {
		this.n = n;
		
	}	
	
	public  void inc() {
		System.out.println("Incrementando");	
		synchronized (this) {
			this.n++;	
		}
		
		System.out.println("Incrementado");
	}
	
	public synchronized int get() {
		return this.n;
	}
}
package unidad2.actividad1;

public class ejercicio1claseanonima {
	public static void main(String[] args) {
		for(int i = 0; i<= 3; i++) {
			new Thread("Hilo " + i) {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				
				for(int i = 1 ; i <= 5 ; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {}
						System.out.println(getName() + ", mensaje "+ i);
					}
				}
			}.start();;
		};
			
		};
}
	
		




package unidad2.actividad2;

public class ejercicio2 implements Runnable {
	
	public void run() {
		for(int i = 1; i <= 5 ; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.printf("%s, mensaje %d\n", Thread.currentThread().getName(), i);
			}
		}
	}
}

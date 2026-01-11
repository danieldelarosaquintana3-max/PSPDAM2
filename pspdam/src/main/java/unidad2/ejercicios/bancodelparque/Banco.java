package unidad2.ejercicios;

public class Banco {
	private int capacidad;
	public synchronized void sentarse() {
		
		while(capacidad >= 5) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		capacidad += 1;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notifyAll();
	}
	
public synchronized void irse() {
		
		while(capacidad <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		capacidad -= 1;
		notifyAll();
	}
public synchronized int getCapacidad() {
	return capacidad;
}
}

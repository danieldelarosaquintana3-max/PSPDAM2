package hilosejemplos;

public class EjemploThread4 {
	public static void main(String[] args) {
		Thread.currentThread().setName("MainThread");
		Thread miThread =  new Thread(EjemploThread4::unaTarea,"ThreadCreado1");
		miThread.start();
		for(;;) {
			System.out.println("Segundo Hilo");
		}
	}
	public static void unaTarea() {
		for(;;) {
			System.out.println("PRIMER HILO");
		}
	
	}
}

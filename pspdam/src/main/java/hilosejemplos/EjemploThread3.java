package hilosejemplos;

public class EjemploThread3 {
	
	public static void main(String[] args) {
		Thread miHilo = new Thread(() -> System.out.println(""));
		miHilo.start();
	}
}

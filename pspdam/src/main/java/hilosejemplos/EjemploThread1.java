package hilosejemplos;


public class EjemploThread1 extends Thread{
//	public static void main(String[] args)  {
//		EjemploThread1 miHilo =  new EjemploThread1();
//		miHilo.start();
//		System.out.println("Hello World");
//	}
//	@Override
//	public void run() {
//		System.out.println("Thread Runing");
//	}
	
	public static void main(String[] args) {
		EjemploThread2 miHilo =  new EjemploThread2();
		miHilo.start();
		for(int i = 0; i <= 10; i++) {
			System.out.println(i + " Main");
		}
	}
}

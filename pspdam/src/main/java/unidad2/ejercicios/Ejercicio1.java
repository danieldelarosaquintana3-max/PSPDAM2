package unidad2.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Cuantos threads quieres crear? ");
		int x =  sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			Thread m = new Thread(() -> {
				Thread.currentThread().setName("Hilo: "+ Thread.currentThread().getId());
				System.out.println(Thread.currentThread().getName());
			});
			m.start();
			m.sleep(1000);
			
		}
	}
	
}

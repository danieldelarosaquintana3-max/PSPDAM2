package unidad2.ejercicios;

import java.util.Scanner;




public class CreacionHilos {
	
	public class HiloCreado extends Thread{
		
		private int sleepTime = 100;
		
		HiloCreado () {
			
		}
		
		HiloCreado (int x) {
			this.sleepTime = x;
		}
		
		@Override
		public void run() {
			System.out.println("Hilo: " + getId() + " voy a dormir durante: " + sleepTime);
			try {
				sleep(sleepTime);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("Hilo: " + getId() + " finalizo.");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		
		
		CreacionHilos ch =  new CreacionHilos();
		System.out.println("Cuantos Hilos quieres crear?");
		int x = sc.nextInt();
		HiloCreado[] h1 =  new HiloCreado[x];
		for(int i= 0;i < h1.length;i++) {
			h1[i] = ch.new HiloCreado();
		}
		for(HiloCreado h : h1) {
			h.start();
		}
		
	}
}

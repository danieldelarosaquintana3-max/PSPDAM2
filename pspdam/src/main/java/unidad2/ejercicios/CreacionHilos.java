package unidad2.ejercicios;

import java.util.Scanner;




public class CreacionHilos {
	
	public class HiloCreado extends Thread{
		
		@Override
		public void run() {
			System.out.println("run");			
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		CreacionHilos ch =  new CreacionHilos();
		HiloCreado h1 =  ch.new HiloCreado();
		
		h1.start();
		
	}
}

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import unidad2.ejercicios.Banco;
import unidad2.ejercicios.Persona;

public class Tests {
	private static parque pmls;

	public static void main(String[] args) {
		
	}
	class banco {
		private int capacidad;
		private ReentrantLock lock = new ReentrantLock();
		private Condition lleno = lock.newCondition();
		private Condition vacio = lock.newCondition() ;
		
		public synchronized void sentarse() {
			lock.lock();
			try {
				while(capacidad >= 5) {
					try {
						lock.lock();
						lleno.wait();
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				capacidad += 1;
			} 
			finally {
				lock.unlock();
				vacio.notifyAll();
			}
		}
		
		public synchronized void irse() {
			try {
				while(capacidad <= 0) {
					try {
						
						vacio.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				capacidad -= 1;
			} 			
			finally {
				lock.unlock();
				lleno.notifyAll();
			}
		}
		public synchronized int getCapacidad() {
			return capacidad;
		}
	}
	class parque {
		Banco banco = new Banco();
		Persona[] personas;
		parque(int n) {
			personas = new Persona[n];
			for(int i = 0; i <n; i++) {
				personas[i] = new Persona(banco, "Persona" + (i + 1));
			}
		}
		
		public void iniciarSimulacion() {
			for(Persona p : personas) {
				p.start();
			}
		}
	}
	
	class Persona extends Thread{
		
		private Banco banco =  new Banco();
		private String nombre;
		private Persona [] personas;
		
		public Persona(Banco b, String nombre) {
			this.banco = b;
			this.nombre = nombre;
			setName(nombre);
		}
		
		@Override
		public void run() {
			
			banco.sentarse();
			System.out.println(nombre+ " se ha sentado gente que hay en el banco: " + banco.getCapacidad());
			banco.irse();
			System.out.println(nombre + " se ha levantado");
		}
	}
}
package hilosejemplos;

public class EjemploThread2 extends Thread {
	public static void main(String[] args) {
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10 ; i++) {
			System.out.println(i + " Thread");
		}
	}
}

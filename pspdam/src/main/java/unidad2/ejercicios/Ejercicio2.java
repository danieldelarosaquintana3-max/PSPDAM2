package unidad2.ejercicios;

public class Ejercicio2 {
	public static void main(String[] args) {
		Thread t1 =  new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						for(;;) {
							System.out.println("TIC");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					}
				}
		);
		
		Thread t2 =  new Thread(
				new Runnable() {
					
					@Override
					public void run() {
						for(;;) {
							System.out.println("TAC");	
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
						
					}
				}
		);
		
		t1.start();
		t2.start();
		
	}
}

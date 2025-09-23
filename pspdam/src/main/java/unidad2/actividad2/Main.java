package unidad2.actividad2;

public class Main {
	public static void main(String[] args) {
		Runnable tarea = new ejercicio2();
		for(int i = 1; i<= 3; i++) {
			new Thread(tarea, "hilo " + i).start();
		}
	}
}

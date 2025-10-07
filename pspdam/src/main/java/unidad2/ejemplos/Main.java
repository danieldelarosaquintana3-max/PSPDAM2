package unidad2.ejemplos;

public class Main {
	public static void main(String[] args) {
		Almacen almacen = new Almacen(10);
		Productor[] productor = new Productor[10];
		
		for(int i = 0;i < productor.length;i++) {
			productor[i] =  new Productor(almacen, 100);
		}
		
		Consumidor consumidor = new Consumidor(almacen, 1000);
		for(Productor p : productor) {
			p.start();
		}
		consumidor.start();
	}
}
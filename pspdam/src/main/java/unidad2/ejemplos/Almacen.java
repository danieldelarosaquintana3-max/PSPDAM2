package unidad2.ejemplos;

public class Almacen {
    private   int almacenados = 0;
    private String[] productos;

    public Almacen(int capacidad) {
        productos = new String[capacidad];
    }

    public  synchronized void almacenar(String producto) {
    	
        while (almacenados == productos.length) { // almacén lleno
            try {
                wait();
            } catch (InterruptedException e) {
                // Manejo de excepción vacío
            }
        }
        productos[almacenados++] = producto;
        notify();
    }

    public synchronized String retirar() {
        while (almacenados == 0) { // almacén vacío
        	
            try {
                wait();
            } catch (InterruptedException e) {
                // Manejo de excepción vacío
            }
        }
        String producto = productos[--almacenados];
        notify();
        return producto;
    }
}
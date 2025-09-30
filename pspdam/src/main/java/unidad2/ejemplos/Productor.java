package unidad2.ejemplos;


public class Productor extends Thread {
    private long retardo, contador = 0;
    private Almacen almacen;

    public Productor(Almacen almacen, long retardo) {
        super(String.valueOf(Thread.currentThread().getId())); // ⚠️ 'id' no está definido en esta clase
        this.retardo = retardo;
        this.almacen = almacen;
    }

    public void run() {
        while (true) {
            String producto = String.format("%d", ++contador);
            almacen.almacenar(producto);
            System.out.println("producto " + producto + " almacenado");
            try {
                Thread.sleep(retardo);
            } catch (InterruptedException e) {
                // Manejo de excepción vacío
            }
        }
    }
}


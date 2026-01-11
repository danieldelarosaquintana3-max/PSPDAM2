package unidad2.ejercicios;

public class Persona extends Thread{
	
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

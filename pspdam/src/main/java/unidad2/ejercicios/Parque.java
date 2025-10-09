package unidad2.ejercicios;

public class Parque {
	Banco banco = new Banco();
	Persona[] personas;
	Parque(int n) {
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

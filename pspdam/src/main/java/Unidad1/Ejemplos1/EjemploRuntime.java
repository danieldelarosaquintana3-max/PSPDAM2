package Unidad1.Ejemplos1;

public class EjemploRuntime {
	public static void main(String[] args) {
		try {
			Runtime r =  Runtime.getRuntime();
			Process p = r.exec("ping google.com");
			
			int estadoSalida = p.exitValue();
			System.out.println(estadoSalida);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

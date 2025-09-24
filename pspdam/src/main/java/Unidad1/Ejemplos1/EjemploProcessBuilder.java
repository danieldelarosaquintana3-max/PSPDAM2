package Unidad1.Ejemplos1;

public class EjemploProcessBuilder {
	public static void main(String[] args) {
		try {
			
			ProcessBuilder pb =  new ProcessBuilder();
			pb.command("java" ,"google.com");
			Process p = pb.start();
			
			
			System.out.println(p.waitFor());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

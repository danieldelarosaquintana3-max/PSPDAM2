import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Tests2 {
	public static void main(String[] args) {
		
		try{
			Runtime r =  Runtime.getRuntime();
			Process p =  r.exec("neofetch");
			
			int estadoSalida = p.waitFor();
			System.out.println(estadoSalida);

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
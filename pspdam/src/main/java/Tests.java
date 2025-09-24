import java.io.IOException;

public class Tests {
   
	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pb =  new ProcessBuilder("neofetch");
		Process p = pb.start();
		
		System.out.println(p.waitFor());
		
		
	}		
    	
}
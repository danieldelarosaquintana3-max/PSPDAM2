package Unidad1.Ejemplos1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EjemploBufferedWriterConsole {
	public static void main(String[] args) throws IOException {
		ProcessBuilder pb =  new ProcessBuilder();
		pb.command("java", "Unidad1.Ejemplos1.EjemploBufferedReaderConsole1");
		Process p =  pb.start();
		
		BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
		bw.write("3\n");
		bw.flush();
		
		BufferedReader reader = new BufferedReader(
			    new InputStreamReader(p.getInputStream())
			);
			String line;
			while ((line = reader.readLine()) != null) {
			    System.out.println(">> " + line);
			}
	}
}

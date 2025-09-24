package Unidad1.Ejemplos1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class BufferedReadWriterExcercise {
	public static void main(String[] args) throws IOException {
		escribirLineas("test.txt", 10);
		
	}
	
	public static FileWriter escribirLineas(String fichero,int n) throws IOException {
		FileWriter f = new FileWriter("test.txt");
		BufferedWriter bw =  new BufferedWriter(f);
		for(int i = 0; i <= n;i++) {
			bw.write("Linea :" + i);
			bw.newLine();
			
		}
		bw.close();
		return f;
	};
}

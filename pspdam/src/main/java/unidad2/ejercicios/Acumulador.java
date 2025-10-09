package unidad2.ejercicios;

import java.util.Random;

public class Acumulador {
	private double matrix[][];
	public Acumulador(double matrix[][]) {
		this.matrix = matrix;
	}
	 public static void main(String[] args) {
		double matrix[][] =  new double[1000][1000];
		
		Random r =  new Random();
		for(int i = 0; i < matrix.length;i++) {
			for(int y = 0;y < matrix[i].length;y++) {
				matrix[i][y] = r.nextInt();
			}
		}
		int count = 0;
		for(int i = 0; i < matrix.length;i++) {
			for(int y = 0;y < matrix[i].length;y++) {
				System.out.print(matrix[i][y] + " ");
				count = (int) (count + matrix[i][y]);
			}
			System.out.println();
		}
		System.out.println("-------------");
		System.out.println(count);
	 }
}

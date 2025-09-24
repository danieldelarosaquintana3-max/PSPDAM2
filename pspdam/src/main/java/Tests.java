import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
    	Scanner sc =  new Scanner(System.in);
    	
    	try {
			int x =  sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(x + y);
		} catch (Exception e) {
			System.err.println(e);
		}
    }
}
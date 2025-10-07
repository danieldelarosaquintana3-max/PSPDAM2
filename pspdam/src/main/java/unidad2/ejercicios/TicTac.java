package unidad2.ejercicios;

public class TicTac {
	
	public static class TicTacSys{
		
		private boolean ticTurn  = true;
		
		public synchronized void ticSys() {
			while(!ticTurn) {
				try {
					wait();	
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
			System.out.println("TIC");
			ticTurn = false;
			notifyAll();
		}
		
		public synchronized void tacSys() {
			while(ticTurn) {
				try {
					wait();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			System.out.println("TAC");
			ticTurn = true;	
			notifyAll();
		}
		
		
	}
	
	public static void main(String[] args) {
		TicTacSys t =  new TicTacSys();
		
		Thread ticThread = new Thread(() -> {
			while(true) {
				t.ticSys();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		Thread tacThread = new Thread(() -> {
			while(true) {
				t.tacSys();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});
		
		
		ticThread.start();
		tacThread.start();
	}
	
	
}

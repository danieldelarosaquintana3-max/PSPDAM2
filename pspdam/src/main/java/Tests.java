public class Tests {
	
	public static class TicTacThread {
		private boolean ticTurn = true;
		
		public synchronized void sysTic() {
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
		public synchronized void sysTac() {
			while (ticTurn) {
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
		TicTacThread t =  new TicTacThread();
		Thread ticThread = new Thread(() -> {
			while(true) {
				t.sysTic();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		Thread tacThread =  new Thread(() -> {
			while(true) {
				t.sysTac();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
		
		ticThread.start();
		tacThread.start();
	}
}
package Preparation;

public class VolatileTransient9 {
	 private boolean isRunning;
		public void run() {
		      long count=0;
		      while (isRunning) {
		         count++;
		      }
		      System.out.println("Thread terminated." + count);
		   }
		   public static void main(String[] args) throws InterruptedException {
		      VolatileTransient9 t = new VolatileTransient9();
		      t.run();
		      Thread.sleep(2000);
		      t.isRunning = false;
		      t.run();
		      System.out.println("isRunning set to " + t.isRunning);
		   }

}

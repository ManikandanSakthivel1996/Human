package Preparation;

public class Finalize2 {
	public void finalize(){
	      System.out.println("Object garbage collected.");
	   }
	   public static void main(String[] args) {
	      Finalize2 t = new Finalize2();
	      t=null;
	      System.gc();
	   }
}

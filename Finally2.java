package Preparation;

public class Finally2 {
	public static void main(String[] args){
		try {
			int num  =21;
			int num1 =0;
			System.out.println(num/num1);
		}
		catch(Exception c) {
			c.printStackTrace();
		}
		finally {
			System.out.println("Its completed");
		}
		
	}

}

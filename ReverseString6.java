package Preparation;

public class ReverseString6 {
	public static void main(String[] args) {
		String name = "Manikandan";
	    String RevName = "";
		for(int i=name.length()-1;i>=0;i--) {
			RevName += name.charAt(i);
		}
		System.out.println(RevName);
	}

}

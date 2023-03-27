package Preparation;

public class Immutable4 {
	 public String referenceCheck(String a, String b) {  
	        if (a==b) {  
	            return "Both pointing to the same memory";  
	        }
	        else {  
	            return "Both are pointing to different reference";  
	        }  
	    }  
	    
	    public static void main(String[] args) { 
	    	Immutable4 rc = new Immutable4();
	        String st1 = "Java";  
	        String st2 = "Java";  
	        System.out.println("Before Modification in String1= "+st1+", String2= "+st2);
	        System.out.println(rc.referenceCheck(st1, st2));  
	        st1 += "Developer";  
	        System.out.println("After Modification");
	        System.out.println(rc.referenceCheck(st1, st2));
	        System.out.println(st1);
	    }  

}

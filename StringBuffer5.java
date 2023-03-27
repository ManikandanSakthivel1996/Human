package Preparation;

public class StringBuffer5 {
	public static void main(String args[]){
		
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("mani");
		System.out.println(sb);
		
		sb.insert(1,"Java");
		System.out.println(sb);
		
		sb.replace(1, 3,"Hello");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.capacity();
		System.out.println(sb+"\n");
		System.out.println("String Builder programs"+"\n");
//String builder5	
		StringBuilder s=new StringBuilder("Hello ");  
		s.append("mani");
		System.out.println(s);
		
		s.insert(1,"Java");
		System.out.println(s);
		
		s.replace(1, 3,"Hello");
		System.out.println(s);
		
		s.delete(1, 3);
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		s.capacity();
		System.out.println(s);
		}  

}

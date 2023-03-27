package Preparation;

 class StaticVariable1 {
	static int count=0;//will get memory only once and retain its value  
	  
	StaticVariable1(){  
	count++;//incrementing the value of static variable  
	System.out.println(count);  
	}  
	  
	public static void main(String args[]){  
	//creating objects  
	StaticVariable1 c1=new StaticVariable1();  
	StaticVariable1 c2=new StaticVariable1();  
	}
 }

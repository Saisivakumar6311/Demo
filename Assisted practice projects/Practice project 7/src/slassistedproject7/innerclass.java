package slassistedproject7;

public class innerclass {

	 private String msg="Hii welcome to innerclass program"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Now we can read inner class");}  
	 }  


	public static void main(String[] args) {

		innerclass obj=new innerclass();
		innerclass.Inner in=obj.new Inner();  
		in.hello();  
	}
}




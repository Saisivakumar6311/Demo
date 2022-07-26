package slassistedproject7;

public class innerclass2 {

	private String msg="This program is Inner Classes";

	void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
	public static void main(String[] args) {
		innerclass2  ob=new innerclass2 ();  
		ob.display();  
	}
}

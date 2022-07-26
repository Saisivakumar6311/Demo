package sl_assisted_project2;

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("Hii welcome to core java Training"); 
     } 
} 

	public class accessmodifiers {

		public static void main(String[] args) {
		//default
		System.out.println("This code is Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}

	
	

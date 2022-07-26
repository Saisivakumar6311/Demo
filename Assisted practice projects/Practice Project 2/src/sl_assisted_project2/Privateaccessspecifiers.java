package sl_assisted_project2;

class protectedaccessspecifier 
{ 
    private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 

public class Privateaccessspecifiers {

	public static void main(String[] args) {
		//private
		System.out.println("hello welcome to java programming");
		protectedaccessspecifier  obj = new protectedaccessspecifier(); 
        
        //obj.display();

	}
}

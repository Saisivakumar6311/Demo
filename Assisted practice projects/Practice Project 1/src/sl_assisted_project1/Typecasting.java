package sl_assisted_project1;

public class Typecasting {

	public static void main(String[] args) {
				
				System.out.println("Implicit Type Casting");
				char a='S';
				System.out.println("Value of a: "+a);
				
				int b=a;
				System.out.println("Value of b: "+b);
				
				float c=b;
				System.out.println("Value of c: "+c);
				
				long d=a;
				System.out.println("Value of d: "+d);
				
				double e=a;
				System.out.println("Value of e: "+e);
				
						
				System.out.println("\n");
				
				System.out.println("Explicit Type Casting");
				//This code is Explicit Type Casting
				
				double a1=50.5;
				int b1=(int)a1;
				System.out.println("Value of a1: "+a1);
				System.out.println("Value of b1: "+b1);
				
	}
}


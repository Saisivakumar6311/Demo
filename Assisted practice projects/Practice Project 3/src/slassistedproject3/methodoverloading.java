package slassistedproject3;

public class methodoverloading {
	
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

    	methodoverloading ob=new methodoverloading();
    		ob.area(5,10);
    		ob.area(4);  
   }
}

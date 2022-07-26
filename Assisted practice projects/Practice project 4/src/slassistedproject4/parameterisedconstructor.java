package slassistedproject4;

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

		void display() {
			System.out.println(id+" "+name);
	}
}

	public class parameterisedconstructor {
		public static void main(String[] args) {

			Std std1=new Std(5346,"sai");
			Std std2=new Std(1290,"siva");
			std1.display();
			std2.display();
		}
}

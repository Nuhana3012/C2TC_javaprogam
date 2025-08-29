package day6.usingfinal;

<<<<<<< HEAD


=======
>>>>>>> branch 'master' of https://github.com/Nuhana3012/C2TC_javaprogam.git
public class FinalClassDemo {
	final class FinalClass {
		void show() {
			System.out.println("Final class cannot be inherited");
		}
	}

	//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
	class FinalChildClass extends FinalClass {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the object of final class
		FinalClass f1 = new FinalClass(); // Call show() method using object reference variable ab.
		f1.show();


	}


}

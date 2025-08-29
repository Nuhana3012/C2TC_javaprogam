package day6.usingfinal.Interface.functionalinterface;

<<<<<<< HEAD


=======
>>>>>>> branch 'master' of https://github.com/Nuhana3012/C2TC_javaprogam.git
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		GreetClass g= new GreetClass();
		System.out.println(g.greet());
		
		GreetInterface g1=()->{
			return "Good Afternoon";
		};
		
		System.out.println(g1.greet());

	}

}

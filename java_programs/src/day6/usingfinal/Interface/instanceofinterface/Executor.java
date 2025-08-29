package day6.usingfinal.Interface.instanceofinterface;

<<<<<<< HEAD


=======
>>>>>>> branch 'master' of https://github.com/Nuhana3012/C2TC_javaprogam.git
public class Executor {

	public static void main(String[] args) {
		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();

	}

}

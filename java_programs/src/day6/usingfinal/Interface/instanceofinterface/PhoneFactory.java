package day6.usingfinal.Interface.instanceofinterface;

<<<<<<< HEAD


=======
>>>>>>> branch 'master' of https://github.com/Nuhana3012/C2TC_javaprogam.git
public class PhoneFactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;
	}

}

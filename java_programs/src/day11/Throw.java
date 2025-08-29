package day11;

<<<<<<< HEAD


=======
>>>>>>> branch 'master' of https://github.com/Nuhana3012/C2TC_javaprogam.git
public class Throw {

	public static void main(String[] args) {
		
		try {
			int a[] =new int[5];
			a[0]=11;
			a[1]=12;
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Exception "+e.getMessage());
		}
		
		System.out.println("Next Line");

	}

}

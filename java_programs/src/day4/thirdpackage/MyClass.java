package day4.thirdpackage;

<<<<<<< HEAD


=======
>>>>>>> branch 'master' of https://github.com/Nuhana3012/C2TC_javaprogam.git
public class MyClass {
	private static MyClass obj=new MyClass();
	private int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private MyClass() {
		System.out.println("MyClass object created");		
	}
	
	public static MyClass getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}

}

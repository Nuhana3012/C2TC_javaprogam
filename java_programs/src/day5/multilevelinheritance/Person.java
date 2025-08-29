package day5.multilevelinheritance;
import java.util.*;

<<<<<<< HEAD


=======
>>>>>>> branch 'master' of https://github.com/Nuhana3012/C2TC_javaprogam.git
public class Person {
	private String name;
	private long conatctNo;
	private Date dateOfBirth;

	public Person(String name, long conatctNo, Date dateOfBirth) {
		super();
		this.name = name;
		this.conatctNo = conatctNo;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getConatctNo() {
		return conatctNo;
	}

	public void setConatctNo(long conatctNo) {
		this.conatctNo = conatctNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", conatctNo=" + conatctNo + ", dateOfBirth=" + dateOfBirth + "]";
	}

}

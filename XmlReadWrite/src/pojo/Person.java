package pojo;

public class Person {
	private String NAME;
	private String SURNAME;
	private int AGE;
	private Address ADDRESS;

	public Person() {

	}

	public Person(String name, String surname, Address address, int age) {
		this.NAME = name;
		this.SURNAME = surname;
		this.ADDRESS = address;
		this.AGE = age;
	}

	public Address getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(Address aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getSURNAME() {
		return SURNAME;
	}

	public void setSURNAME(String sURNAME) {
		SURNAME = sURNAME;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}

}

package pojo;

public class Address {
	private String DISTRICT;
	private String CITY;

	public Address() {

	}

	public Address(String district, String city) {
		this.DISTRICT = district;
		this.CITY = city;
	}

	public String getDISTRICT() {
		return DISTRICT;
	}

	public void setDISTRICT(String dISTRICT) {
		DISTRICT = dISTRICT;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

}

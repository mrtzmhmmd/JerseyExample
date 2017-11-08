package model;

public class Address {

	private int idAddress;
	private String location;
	private String phone;

	public Address() {

	}

	public Address(String location, String phone) {
		this.location = location;
		this.phone = phone;
	}

	public Address(int idAddress, String location, String phone) {
		setIdAddress(idAddress);
		setLocation(location);
		setPhone(phone);
	}

	public int getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
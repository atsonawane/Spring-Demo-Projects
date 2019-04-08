package beans;

public class Employee {
	private int id;
	private String name;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayInfo()
	{
		System.out.println("ID: "+id+" Name: "+name);
		System.out.println("Landmark: "+address.getLandmark()+" City: "+address.getCity()+" State: "+address.getState()+" Country: "+address.getCountry());
	}
}

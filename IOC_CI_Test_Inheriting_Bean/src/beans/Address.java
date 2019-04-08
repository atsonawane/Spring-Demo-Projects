package beans;

public class Address {
	private String landMark,city,state,country;

	public Address(String landMark, String city, String state, String country) {
		super();
		this.landMark = landMark;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}

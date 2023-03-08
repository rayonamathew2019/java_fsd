package hoteltvm;

public class Tvmhotel {
	String adharno;
	String name;
	String email;
	String location;
	
	public Tvmhotel(String adharno, String name, String email, String location) {
		super();
		this.adharno = adharno;
		this.name = name;
		this.email = email;
		this.location = location;
	}
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Tvmhotel [adharno=" + adharno + ", name=" + name + ", email=" + email + ", location=" + location + "]";
	}
	
	
	

}

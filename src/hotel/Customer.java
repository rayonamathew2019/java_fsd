package hotel;

public class Customer {
	String regi;
	String name;
	String phoneno;
	String emailid;
	public Customer(String regi, String name, String phoneno, String emailid) {
		super();
		this.regi = regi;
		this.name = name;
		this.phoneno = phoneno;
		this.emailid = emailid;
	}
	public String getRegi() {
		return regi;
	}
	public void setRegi(String regi) {
		this.regi = regi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Customer [regi=" + regi + ", name=" + name + ", phoneno=" + phoneno + ", emailid=" + emailid + "]";
	}
	
}

package meals;

public class Curd {

	String uid;
	String name;
	public Curd(String uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Curd [uid=" + uid + ", name=" + name + "]";
	}
	
	
	
	
}

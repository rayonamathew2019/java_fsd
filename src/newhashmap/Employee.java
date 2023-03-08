package newhashmap;

public class Employee {
	public int i;
	public String id;
	public String name;
	public int age;
	public String depertment;
	public Employee(String id, String name, int age, String depertment) {
		super();
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.depertment = depertment;
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepertment() {
		return depertment;
	}
	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}
	

}

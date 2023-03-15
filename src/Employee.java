package ustbatchno3.Sonarqube;

public class Employee {
	public int age;
	public String name;
	public int exp;
	public double salary;
	public Employee(int age, String name, int exp, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.exp = exp;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", exp=" + exp + ", salary=" + salary + "]";
	}
	
	
	}
	
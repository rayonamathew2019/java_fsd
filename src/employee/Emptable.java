package employee;

public class Emptable {

	
		// TODO Auto-generated method stub
		String empid;
		String empname;
		double salary;
		public Emptable(String empid, String empname, double salary) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.salary = salary;
		}
		public String getEmpid() {
			return empid;
		}
		public void setEmpid(String empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Emptable [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
		}
		

	

}

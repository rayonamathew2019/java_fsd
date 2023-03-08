package products;

public class Deatils {

	public String proname;
	public int proid;
	public int proprice;
	public Deatils(String proname, int proid, int proprice) {
//		super();
		this.proname = proname;
		this.proid = proid;
		this.proprice = proprice;
	}
	
	void product() {
		if(proprice>=10000) {
			System.out.println(proprice);
			
		}
//		else {
//			System.out.println("lowprice");
//		}
	
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public int getProprice() {
		return proprice;
	}
	public void setProprice(int proprice) {
		this.proprice = proprice;
	}
	
}

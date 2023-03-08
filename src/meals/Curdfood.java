package meals;

public class Curdfood extends Curd {
	String food;
//	public Curdfood(String uid, String name, String food) {
//		super(uid, name);
		// TODO Auto-generated constructor stub
		
		
		
		
	public Curdfood(String uid, String name, String food) {
		super(uid, name);
		this.food = food;
	}
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Curdfood [food=" + food + ", uid=" + uid + ", name=" + name + "]";
	}

	

}

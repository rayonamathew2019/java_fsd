package ustbatchno3.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */

public class employeetest{
	
	@Test
	public void emp() {
		Employee e= new Employee("Rayo",23,"cs");
		Assert.assertEquals(e.getName(),"Rayo");
	}
}

package projecthooks;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;

public class hookes {

	
	@Before(order =0)
	public void SetUp(Scenario sc) {
		System.out.println("Data Setup From Excel");
		System.out.println("Driver Setup");		
		System.out.println("ID = " + sc.getId());
		System.out.println("Name = " + sc.getName());
		System.out.println("Status = " + sc.getStatus());
		System.out.println("URI = " + sc.getUri());
	}

	@Before(order =1)
	public void SetUp1(Scenario sc) {
		System.out.println("Before Order 1");
				
	
	}
	
	@After(order=1)
	public void PostSetup(Scenario sc) {
		if (!sc.isFailed()) {
			System.out.println("Order ID updation to Excel");
			System.out.println("Status = " + sc.getStatus());
			System.out.println("URI = " + sc.getUri());
		} else {
			System.out.println("Status updation to Excel as Fail");
			System.out.println("Status = " + sc.getStatus());
		}
		System.out.println("Driver to be Quit");

	}

	
	@After(order=0)
	public void PostSetup1(Scenario sc) {
		System.out.println("After Order 0");
	}
	@BeforeStep
	public void SS1(Scenario sc) {
		System.out.println("ScreenShot Before Step");
	}

	@AfterStep
	public void SS2(Scenario sc) {
		System.out.println("ScreenShot After Step");
	}
	
	
}

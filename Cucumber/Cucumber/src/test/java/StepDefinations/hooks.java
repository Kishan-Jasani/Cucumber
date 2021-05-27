package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before
	public void initialization() {
		System.out.println("Starting.....");
	}
	
	@After
	public void tearDown() {
		System.out.println("Ending.....");
	}
}

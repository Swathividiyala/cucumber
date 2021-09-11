package stepDefination;

import cucumberautomation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Base {
	
	@Before("@SmokeTest")
	public void beforeValidation()
	{
		System.out.println("Before hook the application");
	}
	@After("@SmokeTest")
	public void AfterValidation()
	{
		System.out.println("After hook the application");
	}
	
	@After("@SeleniumTest")
	public void closeBrowser()
	{
		driver.close();
	}

}

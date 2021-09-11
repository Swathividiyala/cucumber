package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	
	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By cart=By.xpath("//img[@alt='Cart']");
	By proceed=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public WebElement addtoCart()
	{
		return driver.findElement(cart);
	}
	
	public WebElement proceedtoCart()
	{
		return driver.findElement(proceed);
	}
}




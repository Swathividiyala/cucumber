package stepDefination;

import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumberautomation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class SearchStepDefination {
	
	public WebDriver driver;
	HomePage h;
	
	@Given("^Valide the searched vegetables and display$")
	public void valide_the_searched_vegetables_and_display() throws IOException {
		driver=Base.getBrowser();
		
	}

	@When("^User enter (.+) in the search field$")
	public void user_enter_in_the_search_field(String string) throws InterruptedException {
		
		h=new HomePage(driver);
		
		h.getSearch().sendKeys(string);

		Thread.sleep(3000);
	  
	}

	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String string1) {
	 
		//System.out.println("driver.findElement(By.cssSelector(\"h4.product-name\")).getText().contains(string1)");
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string1));
		
	}
	@Then("items should be added to cart")
	public void items_should_be_added_to_cart() {
		
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	 
	}

	/*@Then("User proceeded to checkout page to purchase the items")
	public void user_proceeded_to_checkout_page_to_purchase_the_items() {
	   driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	   driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	}*/

	@Then("^check selected item (.+) is displaying or not$")
	public void check_selected_item_brinjal_is_displaying_or_not(String test) {
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(test));

}
}


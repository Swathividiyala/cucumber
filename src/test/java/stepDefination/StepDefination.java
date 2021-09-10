package stepDefination;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	
	@Given("User is on application")
	public void user_is_on_application() {
		System.out.println("Manoj");

	}

	@When("Enter username and Password")
	public void enter_username_and_password() {
	   ;
	    System.out.println("Manasa");
	}

	@Then("application launched")
	public void application_launched() {
		System.out.println("Madhuri");
	}
	@When("user will enter the following details")
	public void user_will_enter_the_following_details(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>> obj=dataTable.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		
	 
	}
	
	
	@When("^Login application with (.+) and (.+)$")
	public void login_application_with_username_and_password(String username, String password) {
	 System.out.println(username);
	 System.out.println(password);
	 
	}

@Then("^application launched is \"([^\"]*)\"$")
public void application_launched_is(String string) {
	 System.out.println(string);
}

@Then("Verify application is launched")
public void verify_application_is_launched() {
	System.out.println("santosh");
}

@Given("while clicking login button")
public void while_clicking_login_button() {
	System.out.println("clicking the browser");
}

@When("launching the browser")
public void launching_the_browser() {
	System.out.println("launching the browser");
}



	}





package steps;

import common.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class Homedepot extends Baseclass {
	
	Homepage a1;

	@Given("I am on Google home page")
	public void i_am_on_google_home_page() {
	    
		launchbrowser();
	}

	@When("I write home depot near me on search box")
	public void i_write_home_depot_near_me_on_search_box() {
		
	   a1 = new Homepage(driver);
	   a1.entersearch1();
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		
		a1.checkbox();
	   
	}

	@Then("I find relevant result")
	public void i_find_relevant_result() {
		
		a1.result();
		
		closebrowser();
	    
	}



	
	
}

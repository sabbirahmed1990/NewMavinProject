package steps;

import common.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class Halalfood extends Baseclass{
	
	Homepage a1;
	
	@Given("I am on google home page")
	public void i_am_on_google_home_page() {
		
		launchbrowser();
	    
	}

	@When("I write Bangladeshi halal food near me on search box")
	public void i_write_bangladeshi_halal_food_near_me_on_search_box() {
	    
		a1 = new Homepage(driver);
		a1.entersearch();
		
	}

	@When("I click on search box")
	public void i_click_on_search_box() {
		
		a1.checkbox();
	    
	}

	@Then("I get relevant result")
	public void i_get_relevant_result() {
	    a1.result();
	    
	    closebrowser();
		
	}


	


}

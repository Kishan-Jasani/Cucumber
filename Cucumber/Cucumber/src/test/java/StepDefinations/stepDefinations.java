package StepDefinations;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepDefinations {
	@Given("Open application")
	public void open_application() {
	    ActualCode.openApp();
	}

	@Given("enter username and password")
	public void enter_username_and_password() {
	    ActualCode.enterCredentials();
	}

	@Given("click on submit")
	public void click_on_submit() {
	    ActualCode.submit();
	}

	@Then("user should navigate to homepage")
	public void user_should_navigate_to_homepage() {
	    ActualCode.validating();
	}

	@And("^enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void enterUsernameAsAndPasswordAs(String username, String password) throws Throwable {
		ActualCode.enterCredentials(username, password);
	}

	
	@Given("I enter the following details for login")
	public void i_enter_the_following_details_for_login(DataTable dataTable) {
		ActualCode.dataTable(dataTable);	    
	}

	@And("^enter username as ([^\"]*) and password as ([^\"]*)$")
	public void enterUsernameAsUsernameAndPasswordAsPassword(String username, String password) throws Throwable {
		ActualCode.enterCredentials(username, password);
	}

}

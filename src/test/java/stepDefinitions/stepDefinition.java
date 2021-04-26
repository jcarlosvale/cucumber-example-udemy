package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {
    @Given("User is on NetBanking landing page")
    public void user_is_on_netbanking_landing() {
        System.out.println("navigated to login url");
    }

    @When("User login into application with username and password")
    public void userLoginIntoApplicationWithUsernameAndPassword() {
        System.out.println("Logged in success");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String username, String password) throws Throwable {
        System.out.println("Using the username " + username + " and " + password);
    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("validated home page");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
    }

    @And("Cards are not displayed")
    public void cardsAreNotDisplayed() {

    }

    @And("Cards displayed are {string}")
    public void cardsDisplayedAre(String displayValue) {
        System.out.println("Cards displayed are " + displayValue);
    }

    @When("User sign up with following details")
    public void userSignUpWithFollowingDetails(DataTable dataTable) {
        System.out.println("User sign up with following details: ");
        for (String value : dataTable.asList()) {
            System.out.println(value);
        }
    }

    @When("^User login in to application with user (.+) and pwd (.+)$")
    public void user_login_into_application_with_and(String username, String password) {
        System.out.println("User login into application with "+ username + " and "+password);
    }
}

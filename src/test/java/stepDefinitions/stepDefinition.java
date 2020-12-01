package stepDefinitions;

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

    @Then("Home page is populated")
    public void homePageIsPopulated() {
        System.out.println("validated home page");
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {
    }
}

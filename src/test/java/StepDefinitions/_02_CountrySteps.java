package StepDefinitions;


import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class _02_CountrySteps {

    LeftNav ln=new LeftNav();
    DialogContent dc = new DialogContent();


    @And("Navigate to country page")
    public void navigateToCountryPage() {
        ln.findAndClick("setupOne"); // Setup Click
        ln.findAndClick("parameters"); // Parameters Click
        ln.findAndClick("Countries"); // Countries Click
    }

    @When("Create a country")
    public void createACountry() {

//        String randomGenName = RandomStringUtils.randomAlphabetic(8);
//        String randomGenCode = RandomStringUtils.randomAlphabetic(4);

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput","HEIDEGGER");
        dc.findAndSend("codeInput","666666");
        dc.findAndClick("saveButton");
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String name, String code) {

        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("codeInput",code);
        dc.findAndClick("saveButton");

    }
}

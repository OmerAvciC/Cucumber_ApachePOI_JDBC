package StepDefinitions;

import Pages.DialogContent;
import Utilities.ExcelUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;

public class _06_ApachePOIcitizenSteps {

    DialogContent dc = new DialogContent();

    @When("User Create Citizenship with ApachePOI")
    public void userCreateCitizenshipWithApachePOI() {

        ArrayList<ArrayList<String>> tablo =
                ExcelUtilities.getListData("src/test/java/ApachiPOI/resources/ApacheExcel2.xlsx", "testCitizen", 2);

        for (ArrayList<String> satir : tablo) {

            dc.findAndClick("addButton");
            dc.findAndSend("nameInput", satir.get(0));
            dc.findAndSend("shortName", satir.get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("successMessage", "success");
        }

    }

    @Then("User Delete Citizenship with ApachePOI")
    public void userDeleteCitizenshipWithApachePOI() {

        ArrayList<ArrayList<String>> tablo =
                ExcelUtilities.getListData("src/test/java/ApachiPOI/resources/ApacheExcel2.xlsx", "testCitizen", 1);

        for (ArrayList<String> satir : tablo) {

            dc.searchAndDelete(satir.get(0));
            dc.findAndContainsText("successMessage", "success");
        }
    }
}

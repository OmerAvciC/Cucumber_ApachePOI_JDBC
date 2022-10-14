package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _05_DataTableSteps {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    FormContent fc = new FormContent();
    @And("Click on the element in the left nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {

        List<String> listElements = elements.asList(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            ln.findAndClick(listElements.get(i));

        }
    }
    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {

        List<String> listElements = elements.asList(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            dc.findAndClick(listElements.get(i));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {



        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            dc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }

    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {

        List<String> listElements = elements.asList(String.class);


        for (int i = 0; i < listElements.size(); i++) {

            dc.searchAndDelete(listElements.get(i));
        }

    }
    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {


        List<String> listElements = elements.asList(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            fc.findAndClick(listElements.get(i));

        }

    }
    @And("User sending the keys in Form Content")
    public void userSendingTheKeysInFormContent(DataTable elements) {

        List<List<String>> listElements = elements.asLists(String.class);

        for (int i = 0; i < listElements.size(); i++) {

            fc.findAndSend(listElements.get(i).get(0),listElements.get(i).get(1));
        }

    }
}

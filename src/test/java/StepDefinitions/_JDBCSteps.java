package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtilities;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _JDBCSteps {
    @Then("Send The query the database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String query) {

        List<List<String>> dbList = DBUtilities.getListData(query);

        System.out.println("dbList = " + dbList);

        //Webdeb ekrandaki isimleri alıcam
        DialogContent dc=new DialogContent();
        List<WebElement> uiList= dc.waitVisibleListAllElement(dc.nameList);
        for(WebElement e: uiList)
            System.out.println("e.getText() = " + e.getText());

        //karşılaştırıcam
        for(int i=0;i< dbList.size();i++)
            Assert.assertEquals("Hatalı durum",dbList.get(i).get(1), uiList.get(i).getText());
    }
}

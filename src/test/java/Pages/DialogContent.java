package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;
    @FindBy(id="mat-input-0")
    private WebElement username;

    @FindBy(id="mat-input-1")
    private WebElement password;

    @FindBy(css="button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;

    @FindBy(css ="[data-icon='square-xmark']")
    private WebElement closeDialog;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.NAME')]//input")
            private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
            private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
            private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
            private WebElement dialogDeleteBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
            private WebElement intagrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
            private WebElement priority;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
            private WebElement nameSearchInput;

    @FindBy(xpath = "//span[text()='Search']")
            private WebElement searchBTN;

    @FindBy(xpath = "(//*[@data-icon='trash-can'])[1]")
            private WebElement deleteBTN;

    @FindBy(xpath = "//div[@class='ng-star-inserted']/span")
    private WebElement examBack;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList;


    WebElement myElement;
    public void findAndSend(String strElement, String value){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {

            case "username" : myElement = username; break;
            case "password" : myElement = password; break;
            case "nameInput" : myElement = nameInput; break;
            case "codeInput" : myElement = codeInput; break;
            case "shortName" : myElement = shortName; break;
            case "searchInput" : myElement = searchInput;break;
            case "intagrationCode" : myElement = intagrationCode;break;
            case "priority" : myElement = priority; break;
            case "nameSearchInput" : myElement = nameSearchInput;break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement = addButton; break;
            case "acceptCookies" : myElement = acceptCookies; break;
            case "saveButton" : myElement = saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement = searchButton;break;
            case "deleteButton" : myElement = deleteButton;break;
            case "dialogDeleteBtn" : myElement = dialogDeleteBtn;break;
            case "searchBTN" : myElement = searchBTN;break;
            case "deleteBTN" : myElement = deleteBTN;break;
        }

    clickFunction(myElement);

}

    public void findAndContainsText(String strElement, String text){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "dashboard" : myElement =dashboard; break;
            case "successMessage" :myElement =successMessage;break;
            case "alreadyExist" : myElement =alreadyExist; break;
        }

        verifyContainsText(myElement,text);
    }
    public void searchAndDelete(String searchText){


        findAndSend("nameSearchInput",searchText);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("deleteButton");
        findAndClick("dialogDeleteBtn");

    }
    public void waitUntilLoading() {
        WebDriverWait wait=new WebDriverWait(GWD.driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }

}

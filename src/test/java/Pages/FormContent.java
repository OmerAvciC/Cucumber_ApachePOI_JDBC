package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//span[text()=' 2021-2022 ']")
    public WebElement getPeriod;

    @FindBy(xpath = "//span[text()=' 2020 - 2021 ']")
    public WebElement getPeriod2;

    @FindBy(xpath = "//span[text()='Grade Level']")
    private WebElement gradeLevel;

    @FindBy(xpath="(//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel2;

    @FindBy(xpath="(//span[@class='mat-option-text'])[4]")
    private WebElement gradeLevel3;

    @FindBy(xpath="//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstname;

    @FindBy(xpath="//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastname;

    @FindBy(xpath="//ms-text-field[@formcontrolname='middleName']//input")
    private WebElement middlename;

    @FindBy(xpath="//mat-select[@formcontrolname='gender']")
    private WebElement gender;

    @FindBy(xpath="//span[text()=' Male ']")
    private WebElement male;

    @FindBy(xpath = "//div[@id='mat-select-value-15']//span")
    private WebElement employeType;

    @FindBy(xpath="(//mat-option//mat-pseudo-checkbox)[3]")
    private WebElement otherBTN;

    @FindBy(css="[formcontrolname='employeeId']")
    private WebElement employeeId;

    @FindBy(css="[formcontrolname='qualification']")
    private WebElement qualification;

    @FindBy(xpath="//span[text()=' Secondary Technical ']")
    private WebElement secondaryTech;

    @FindBy(css="[data-placeholder='Citizenship']")
    private WebElement citizenShip;

    @FindBy(css="[data-placeholder='Nationality']")
    private WebElement nationality;

    @FindBy(css="[formcontrolname='type']")
    private WebElement documentType;

    @FindBy(xpath = "//span[text()=' Personal ID ']")
    private WebElement persID;

    @FindBy(xpath="[formcontrolname='documentNumber']")
    private WebElement documentNumber;

    @FindBy(css="[formcontrolname='personalId']")
    private WebElement personalID;

    @FindBy(css="[placeholder='School Department']")
    private WebElement schoolDepartment;


    WebElement myElement;

    public void findAndClick(String strElement){

        switch (strElement){
            case "academicPeriod" : myElement = academicPeriod;break;
            case "getPeriod" : myElement = getPeriod;break;
            case "getPeriod2" : myElement = getPeriod2;break;
            case "gradeLevel" : myElement = gradeLevel;break;
            case "gradeLevel2" : myElement = gradeLevel2;break;
            case "gradeLevel3" : myElement = gradeLevel3;break;
            case "gender" : myElement = gender;break;
            case "male" : myElement = male;break;
            case "employeType" : myElement = employeType;break;
            case "otherBTN" : myElement = otherBTN;break;
            case "qualification" : myElement = qualification;break;
            case "secondaryTech" : myElement = secondaryTech;break;
            case "documentType" : myElement = documentType;break;
            case "persID" : myElement = persID;break;

        }
        clickFunction(myElement);

        if (myElement == academicPeriod || myElement == gradeLevel)
            GWD.Bekle(2);

}
    public void findAndSend(String strElement, String value){

        switch (strElement){
            case "firstname" : myElement = firstname;break;
            case "lastname" : myElement = lastname;break;
            case "middlename" : myElement = middlename;break;
            case "employeeId" : myElement = employeeId;break;
            case "citizenShip" : myElement = citizenShip;break;
            case "nationality" : myElement = nationality;break;
//          case "documentNumber" : myElement = documentNumber;break;
//          case "personalID" : myElement = personalID;break;
//          case "schoolDepartment" : myElement = schoolDepartment;break;

        }
        sendKeysFunction(myElement,value);
    }

}
package Pages;

import Utilities.GWD;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement Countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement addcitizen;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationality;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
            private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    public WebElement entrance;

    @FindBy(xpath="(//span[text()='Setup'])[2]")
    public WebElement setupOne2;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    public WebElement entrance2;

    @FindBy(xpath = "//button[text()='Accept all cookies']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanReso;

    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement employess;

    @FindBy (xpath = "(//span[text()='States'])")
    private WebElement states;


    WebElement myElement;
    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "parameters" : myElement =parameters; break;
            case "Countries" : myElement =Countries; break;
            case "citizenShip" : myElement = addcitizen; break;
            case "nationality" : myElement = nationality;break;
            case "fees" : myElement = fees; break;
            case "entrance" : myElement = entrance; break;
            case "setupOne2" : myElement = setupOne2;break;
            case "entrance2" : myElement = entrance2; break;
//            case "acceptCookies" : myElement = acceptCookies;break;
            case "humanReso" : myElement = humanReso;break;
            case "employess" : myElement = employess;break;
            case "states" : myElement =states; break;
        }
        clickFunction(myElement);
    }

}

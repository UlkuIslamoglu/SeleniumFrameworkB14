package pages.vytrack_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public VytrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "idvalue")
    public WebElement usernameInput;

    @FindBy(id="prependentInput2")
    public  WebElement passwordInput;

    @FindBy(id="_submit")
    public WebElement loginButton;

}

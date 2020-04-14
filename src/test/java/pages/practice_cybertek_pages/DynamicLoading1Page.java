package pages.practice_cybertek_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class DynamicLoading1Page {


    public DynamicLoading1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startbutton;
    @FindBy(id = "username")
    public WebElement usernameInput;

}

package pages.practice_cybertek_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverOverPage {

    public HoverOverPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='figure']/img)[1]")
    public WebElement image1;
    @FindBy(xpath = "(//div[@class='figure']/img)[2]")
    public WebElement image2;
    @FindBy(xpath = "(//div[@class='figure']/img)[3]")
    public WebElement image3;
    @FindBy(xpath = "(//div[@class='figcaption']/h5)[1]")
    public WebElement user1Text;
    @FindBy(xpath = "(//div[@class='figcaption']/h5)[2]")
    public WebElement user2Text;
    @FindBy(xpath = "(//div[@class='figcaption']/h5)[3]")
    public WebElement user3Text;

}

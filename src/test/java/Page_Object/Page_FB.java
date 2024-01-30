package Page_Object;

import FB_Base.Base_FB;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_FB extends Base_FB {
    WebDriver driver;
    public Page_FB(WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "email")
    private WebElement useremail;

    @FindBy(name = "pass")
    private WebElement passUser;

    @FindBy(name = "login")
    private WebElement submit;


    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getUsername() {
        return useremail;
    }

    public WebElement getPassword() {
        return passUser;
    }

    public WebElement getSubmit() {
        return submit;
    }





}

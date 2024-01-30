package FB_Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_FB {
    static WebDriver driver;
    public static WebDriver launch_Browser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
         return driver;

    }
    public void Openurl(String url) {

        driver.get(url);

    }

    public void TextField(WebElement element ,String value){

        element.sendKeys(value);

    }

    public void Submit(WebElement element){

        element.click();



    }

}

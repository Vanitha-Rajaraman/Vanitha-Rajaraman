package Step_defFB;

import FB_Base.Base_FB;
import Page_Object.Page_FB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBStep extends Base_FB {
    WebDriver driver;

    Page_FB Po;

    @Given("Launch the browser")
    public void launch_the_browser() {
        driver = launch_Browser();
        Po = new Page_FB(driver);

    }
    @Given("Open the application")
    public void open_the_application() throws InterruptedException {

        driver.get("https://www.facebook.com/login/");
        Thread.sleep(6000);

    }

    @When("User Enters the {string} and {string}")
    public void userEntersTheAnd(String username, String password) {

        TextField(Po.getUsername(),username );
        TextField(Po.getPassword(),password );
    }


    @Then("Click the login button")
    public void click_the_login_button() throws InterruptedException {

        Submit(Po.getSubmit());

        Thread.sleep(5000);

    }

    @Then("Validate the error {string}")
    public void validateTheError(String message) {

        String Actual0 = "Forgotten password?";

        if (message.equals(Actual0)){

            System.out.println("Scenario Passed");

        }else {
            System.out.println("Failed");
        };


        String Actual = "Find your account and log in.";

        if (message.equals(Actual)){

            System.out.println("Scenario Passed");

        }else {
            System.out.println("Failed");
        };






    }
}

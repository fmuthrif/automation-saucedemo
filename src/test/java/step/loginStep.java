package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import object.loginObject;

public class loginStep extends env {
    loginObject elementLogin = new loginObject();
    @Given("User is in login page")
    public void user_is_in_login_page() {
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(elementLogin.getBtnLogin()));
        driver.findElement(elementLogin.getTxtTitleLoginPage()).isDisplayed();
        driver.findElement(elementLogin.getTxtUsername()).isDisplayed();
        driver.findElement(elementLogin.getTxtPassword()).isDisplayed();
        driver.findElement(elementLogin.getBtnLogin()).isDisplayed();
    }
    @When("User input username")
    public void user_input_username() {
        driver.findElement(elementLogin.getTxtUsername()).sendKeys("standard_user");
    }
    @When("User input password")
    public void user_input_password() {
        driver.findElement(elementLogin.getTxtPassword()).sendKeys("secret_sauce");
    }
    @When("User click button login")
    public void user_click_button_login() {
        driver.findElement(elementLogin.getBtnLogin()).click();
    }
    @Then("User redirect to homepage")
    public void user_redirect_to_homepage() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.saucedemo.com/inventory.html" );
    }

    @When("User input invalid username")
    public void userInputInvalidUsername() {
        driver.findElement(elementLogin.getTxtUsername()).sendKeys("standard_use");
    }
    @Then("User will see error state")
    public void userWillSeeErrorState() {
        driver.findElement(elementLogin.getTxtErrorState()).isDisplayed();
    }

    @And("User click hamburger icon")
    public void userClickHamburgerIcon() {
        driver.findElement(elementLogin.getIconHamburger()).click();
    }

    @And("User click logout")
    public void userClickLogout() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLogin.getTxtLogout()));
        driver.findElement(elementLogin.getTxtLogout()).click();
    }
}

package step;

import config.env;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.filterObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class filterStep extends env {
    filterObject elementFilter = new filterObject();
    @When("User click filter icon")
    public void user_click_filter_icon() {
//        WebDriver webdriver = new ChromeDriver();
        WebElement selectElement = driver.findElement(elementFilter.getFilterIcon());
        Select select = new Select(selectElement);
        select.selectByValue("hilo");

    }
    @Then("User see result filter")
    public void user_see_result_filter() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(elementFilter.getLogoSwag())).isDisplayed();
    }
}

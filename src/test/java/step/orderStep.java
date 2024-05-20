package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.orderObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class orderStep extends env {
    orderObject elementOrder = new orderObject();

    @When("User click button add to cart")
    public void user_click_button_add_to_cart() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementOrder.btnAddBackpack()));
        driver.findElement(elementOrder.btnAddBackpack()).click();
    }
    @And("User click icon cart")
    public void user_click_icon_cart() {
        driver.findElement(elementOrder.getBtnCart()).click();
    }
    @When("User is in cart page")
    public void user_is_in_cart_page() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementOrder.getTxtYourCart()));
        driver.findElement(elementOrder.getTxtYourCart()).isDisplayed();
    }
    @And("User click button checkout")
    public void user_click_button_checkout() {
        driver.findElement(elementOrder.getBtnCheckOut()).click();
    }
    @When("User input first name")
    public void user_input_first_name() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementOrder.getBtnContinue()));
        driver.findElement(elementOrder.getTxtFirstName()).sendKeys("Fabian");
    }
    @And("User input last name")
    public void user_input_last_name() {
        driver.findElement(elementOrder.getTxtLastName()).sendKeys("Muthrif");
    }
    @And("User input postal code")
    public void user_input_postal_code() {
        driver.findElement(elementOrder.txtPostalCode()).sendKeys("17412");
    }
    @And("User click button continue")
    public void user_click_button_continue() {
        driver.findElement(elementOrder.getBtnContinue()).click();
    }
    @When("User is in checkout overview page")
    public void user_is_in_checkout_overview_page() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementOrder.getBtnFinish()));
        driver.findElement(elementOrder.getBtnFinish()).isDisplayed();
    }
    @And("User click button finish")
    public void user_click_button_finish() {
        driver.findElement(elementOrder.getBtnFinish()).click();
    }
    @Then("User is in checkout complete page")
    public void user_is_in_checkout_complete_page() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementOrder.getBtnBackToHome()));
        driver.findElement(elementOrder.getBtnBackToHome()).isDisplayed();
    }
    @And("User click title product")
    public void userClickTitleProduct() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementOrder.getImgProduct()));
        driver.findElement(elementOrder.getImgProduct()).click();
    }
    @Then("User is in product detail page")
    public void userIsInProductDetailPage() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementOrder.getBtnBackToProduct()));
        //driver.findElement(elementOrder.getBtnBackToProduct()).click();
    }
}

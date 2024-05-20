package object;

import org.openqa.selenium.By;

public class orderObject {
    By btnAddBackpack = By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']");
    public By btnAddBackpack() {
        return btnAddBackpack;
    }
    By btnAddBikeLight = By.xpath("//*[@data-test='add-to-cart-sauce-labs-bike-light']");
    public By btnAddBikeLight() {
        return btnAddBikeLight;
    }
    By btnCart = By.xpath("//*[@class='shopping_cart_link']");
    public By getBtnCart() {
        return btnCart;
    }

    By txtYourCart = By.xpath("//*[contains(text(),'Your Cart')]");
    public By getTxtYourCart() {
        return txtYourCart;
    }

    By btnCheckOut = By.id("checkout");
    public By getBtnCheckOut() {
        return btnCheckOut;
    }

    By txtFirstName = By.xpath("//*[@data-test='firstName']");
    public By getTxtFirstName() {
        return txtFirstName;
    }

    By txtLastName = By.xpath("//*[@data-test='lastName']");
    public By getTxtLastName() {
        return txtLastName;
    }

    By txtPostalCode = By.xpath("//*[@data-test='postalCode']");
    public By txtPostalCode() {
        return txtPostalCode;
    }

    By btnContinue = By.xpath("//*[@data-test='continue']");
    public By getBtnContinue() {
        return btnContinue;
    }

    By btnFinish = By.xpath("//*[@data-test='finish']");
    public By getBtnFinish() {
        return btnFinish;
    }

    By btnBackToHome = By.xpath("//*[@data-test='back-to-products']");
    public By getBtnBackToHome() {
        return btnBackToHome;
    }

    By imgProduct = By.xpath("//*[@src='/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg']");
    public By getImgProduct() {
        return imgProduct;
    }

    By btnBackToProduct = By.xpath("//*[@data-test='back-to-products']");
    public By getBtnBackToProduct() {
        return btnBackToProduct;
    }
}

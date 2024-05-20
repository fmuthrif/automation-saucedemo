package object;

import org.openqa.selenium.By;

public class loginObject {
    By txtTitleLoginPage = By.xpath("//*[contains(text(),'Swag')]");
    public By getTxtTitleLoginPage() {
        return txtTitleLoginPage;
    }

    By txtUsername = By.id("user-name");
    public By getTxtUsername() {
        return txtUsername;
    }

    By txtPassword = By.xpath("//*[@type='password']");
    public By getTxtPassword() {
        return txtPassword;
    }

    By btnLogin = By.xpath("//*[@data-test='login-button']");
    public By getBtnLogin() {
        return btnLogin;
    }

    By txtErrorState = By.xpath("//*[@data-test='error']");
    public By getTxtErrorState() {
        return txtErrorState;
    }

    By iconHamburger = By.id("react-burger-menu-btn");
    public By getIconHamburger() { return iconHamburger; }

    By txtLogout = By.id("logout_sidebar_link");
    public By getTxtLogout() {
        return txtLogout;
    }
}

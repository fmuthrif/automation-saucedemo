package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class filterObject {
    By filterIcon = By.xpath("//*[@data-test='product-sort-container']");

    public By getFilterIcon() {
        return filterIcon;
    }
    By logoSwag = By.xpath("//*[@class='app_logo']");

    public WebElement getLogoSwag() {
        return (WebElement) logoSwag;
    }
}

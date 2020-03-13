package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductB450Page {
    private static WebElement element = null;


    public static WebElement addToCart(WebDriver webDriver){
        element = webDriver.findElement(By.cssSelector(".product-action.jbr-btn.jbr-btn-large.jbr-btn--yellow.ng-scope"));
        return element;
    }
}

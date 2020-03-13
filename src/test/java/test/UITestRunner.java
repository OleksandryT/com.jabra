package test;

import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ProductB450Page;
import pages.SearchPage;

import java.util.concurrent.TimeUnit;


public class UITestRunner {

    static String URL = "https://www.blueparrott.com/";
    static WebDriver WebDriver = null;
    WebDriverWait wait = new WebDriverWait(WebDriver, 1);


    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(UITestRunner.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

    @BeforeClass
    public static void Precondition() {
        WebDriver = new ChromeDriver();
        WebDriver.get(URL);
        WebDriver.manage().window().maximize();
    }

    @Test
    public void searchViaMainPage() {
        SearchPage.findB450(WebDriver).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product-action.jbr-btn.jbr-btn-large.jbr-btn--yellow.ng-scope")));
        ProductB450Page.addToCart(WebDriver).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/span[1]/img")));
        Assert.assertTrue(WebDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/span[1]/img")).isDisplayed());
    }

    @Test
    public void searchViaSearchField() throws InterruptedException {
        SearchPage.searchButton(WebDriver).click();
        SearchPage.searchField(WebDriver).sendKeys("B450-XT");
        TimeUnit.SECONDS.sleep(3);
        WebDriver.findElement(By.xpath("//a[@href='/on-the-road-headsets/blueparrott-b450-xt']")).click();
        TimeUnit.SECONDS.sleep(2);
        for (String winHandle : WebDriver.getWindowHandles()) {
            WebDriver.switchTo().window(winHandle);
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".product-action.jbr-btn.jbr-btn-large.jbr-btn--yellow.ng-scope")));
        ProductB450Page.addToCart(WebDriver).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/span[1]/img")));
        Assert.assertTrue(WebDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form[2]/div[2]/div[1]/table/tbody/tr[1]/td[1]/span/span[1]/img")).isDisplayed());

    }

    @After
    public void CleanUp() throws InterruptedException {
        WebDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/form[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/a[1]")).click();
        TimeUnit.SECONDS.sleep(1);
        WebDriver.get(URL);
    }

    @AfterClass
    public static void Postcondition() {
        WebDriver.close();
        WebDriver.quit();
    }
}

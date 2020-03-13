package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private static WebElement element = null;


    public static WebElement findB450(WebDriver webDriver) {
        element = webDriver.findElement(By.xpath("//a[@href='/on-the-road-headsets/blueparrott-b450-xt']"));
        return element;
    }

    public static WebElement searchButton(WebDriver webDriver) {
        element = webDriver.findElement(By.cssSelector(".top-navigation__main-menu__label.top-navigation__main-menu__label--search"));
        return element;
    }

    public static WebElement searchField(WebDriver webDriver) {
        element = webDriver.findElement(By.cssSelector(".site-search__search__input"));
        return element;
    }
}

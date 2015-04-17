package com.epam.tests.pages;

import org.jbehave.web.selenium.WebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;  
import java.util.ArrayList;

import java.util.NoSuchElementException;

public class SearchPage extends WebDriverPage {

    WebDriverWait wait;

    public SearchPage(WebDriverProvider driverProvider) {
        super(driverProvider);
        wait = new WebDriverWait(driverProvider.get(), 30);
        PageFactory.initElements(driverProvider.get(), this);
    }

    public void open() {
        get("http://www.yahoo.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-submit")));

    }

    public void typeSearchParameters(String searchParameters) {
        findElement(By.id("p_13838465-p")).sendKeys(searchParameters);
    }

    public void clickSearchButton() {
        findElement(By.id("search-submit")).click();
    }
    public void clickFirstLink() {
    	String parentHandle = getWindowHandle(); 
    	findElement(By.cssSelector(".first .title:first-child>a")).click();
    	for (String winHandle : getWindowHandles()) {
            switchTo().window(winHandle);
        }
    //	String Tab1 = getWindowHandle(); 
   // 	findElement(By.cssSelector(".first .title:first-child>a")).sendKeys(Keys.CONTROL + "\t");  
    //	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
    	//findElement(By.cssSelector(".first .title:first-child>a")).click();
    //	String Tab1 = getWindowHandle(); 
    	 	//ArrayList<String> Tabs = new ArrayList<String>(getWindowHandles()); 
    	 	//Tabs.remove(Tab1); 
    	 //	switchTo().window(Tabs.get(0));
    	//findElement(By.cssSelector(".first .title:first-child>a")).sendKeys(Keys.CONTROL + "t");
    	//webDriver.SwitchTo().Window(_webDriver.WindowHandles.Where(x => x != _webDriver.CurrentWindowHandle).First());
    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".l-page")));
    }
    public boolean verifySearchResults() {
        try {
            findElement(By
                .xpath(".//*[@id='left']/ol/li/div/div/span")).isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            ex.getMessage();
            return false;
        }
    }
    
    public boolean verifyFirstLinkResults() {
        try {
        	
    	 
        	findElement(By.cssSelector(".l-page")).isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            ex.getMessage();
            return false;
        }
    }
    
    public boolean verifyEmptySearchMessage() {
        try {
            findElement(By
                .xpath(".//div[@class='compText mb-15 fz-m fc-4th']/p")).isDisplayed();
            return true;
        } catch (NoSuchElementException ex) {
            ex.getMessage();
            return false;
        }
    }
}

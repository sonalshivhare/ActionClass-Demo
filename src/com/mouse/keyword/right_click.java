package com.mouse.keyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	driver.get("file:///C:/Users/Lenovo/Desktop/Selenium%20Software/Offline%20Website/index.html");
	Actions act=new Actions(driver);
  WebElement   linked=driver.findElement(By.linkText("Register a new membership"));
  act.contextClick(linked).build().perform();
   // act.sendKeys(Keys.ENTER).build().perform();
}
}

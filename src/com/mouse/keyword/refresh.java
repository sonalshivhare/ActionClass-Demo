package com.mouse.keyword;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class refresh {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	Thread.sleep(3000);
	
	
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
	
	
	
}
}

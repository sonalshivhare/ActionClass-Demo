package com.mouse.keyword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

		
	public class KeyBoard_Action_Events {
		 
		public static void main(String[] args) {
		 
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 
		driver.get("https://www.stqatools.com/");
		 
		// Create object of Action class
		Actions action = new Actions(driver);
		 
		// Sendkeys using Action class object
		action.sendKeys(Keys.ENTER).build().perform();
		 
		// Send mulyiple keys using action class
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		 

	
} 
}

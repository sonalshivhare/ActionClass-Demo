package com.mouse.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyBoard_Sendkeys_Events {
		 
		public static void main(String[] args) {
		 
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		 
		driver.get("https://www.stqatools.com");
		 
		// Send single key using sendkeys
		driver.findElement(By.xpath("ele_path")).sendKeys(Keys.ENTER);
		 
		// Handle multiple keys using chord
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		 
		}
}

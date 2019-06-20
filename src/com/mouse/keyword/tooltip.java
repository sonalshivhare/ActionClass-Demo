package com.mouse.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tooltip {
		 
		public static void main(String[] args) {
		 
		//System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		 
		driver.get("https://www.stqatools.com");
		 
		String ToolTipText = driver.findElement(By.id("btn_delete")).getAttribute("title");
		 
		}
}

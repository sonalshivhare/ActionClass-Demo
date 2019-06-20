package com.mouse.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop1{
	
		 
		public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		 
		driver.get("http://www.jqueryui.com/droppable/");
		 driver.switchTo().frame(0);
		// Store draggable location into webelement
		WebElement draggable = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		 
		// Using DragAndDrop method release draggable webelement into offset.
		new Actions(driver).dragAndDropBy(draggable, 200, 10).build().perform();
		 
		}
		 
}

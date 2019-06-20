package com.mouse.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_Tip {
		 
		public static void main(String[] args) {
		 
		 
		WebDriver driver = new FirefoxDriver();
		 
		driver.get("https://www.javabykiran.com");
		 
		// Create action class object
		Actions builder = new Actions(driver);
		 
		// find the tooltip xpath
		WebElement Del_btn_tooltip = driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
		
		// Mouse hover to that text message
		builder.moveToElement(Del_btn_tooltip).perform();
		// Extract text from tooltip
		String tooltip_msg = Del_btn_tooltip.getText();
		 
		// Print the tooltip message just for our refrences
		System.out.println("Tooltip/ Help message is " + tooltip_msg);
		 
		}
}

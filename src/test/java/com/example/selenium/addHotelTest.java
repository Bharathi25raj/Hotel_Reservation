package com.example.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addHotelTest{
	
	static WebDriver driver;
	
	@BeforeClass
	
	public static void setup()
	{
		 FirefoxBinary firefoxBinary = new FirefoxBinary();
		 System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		 FirefoxOptions firefoxOptions = new FirefoxOptions();
		 firefoxOptions.setBinary(firefoxBinary);
		 driver = new FirefoxDriver(firefoxOptions);
	}
	
	@AfterClass
	
	public static void cleanup()
	{
		driver.quit();
	}
	
	@Test
	
	public void Add()
	{
		driver.get("http://localhost:5050/HotelReservation/");
		
		WebElement add = driver.findElement(By.linkText("Add Hotel"));
		add.click();
		
		Select city = new Select(driver.findElement(By.id("city")));
		city.selectByIndex(3);
		
		Select hotel = new Select(driver.findElement(By.id("hotel")));
		hotel.selectByIndex(3);
		
		Select status = new Select(driver.findElement(By.id("status")));
		status.selectByVisibleText("NotAvailable");
		
		Select roomtype = new Select(driver.findElement(By.name("roomtype")));
		roomtype.selectByVisibleText("NonAC");
		
		WebElement price = driver.findElement(By.name("price"));
		price.clear();
		price.sendKeys("500");
		
		WebElement gst = driver.findElement(By.name("gst"));
		gst.clear();
		gst.sendKeys("100");
		
		WebElement save = driver.findElement(By.xpath("/html/body/form/input[3]"));
		save.click();
			
	}

}

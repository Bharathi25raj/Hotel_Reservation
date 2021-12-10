package com.example.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class searchHotelTest {
	
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
	
	public void Search()
	{
		driver.get("http://localhost:5050/HotelReservation/");
		
		WebElement search = driver.findElement(By.linkText("Search Hotel"));
		search.click();
		
		Select city = new Select(driver.findElement(By.id("city")));
		city.selectByIndex(2);
		
		Select hotel = new Select(driver.findElement(By.id("hotel")));
		hotel.selectByIndex(2);
		
		WebElement check = driver.findElement(By.xpath("/html/body/form/input"));
		check.click();
		
	}

}

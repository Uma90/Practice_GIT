package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;



public class CaseOne{

	private static final WebDriver driver = null;
	@Test(dependsOnMethods= {"OpenBrowser"})
	public void TestOne() 
	
	{
		
		System.out.println("We are in TestCase one");
	}
	
	@Test
	public void TestTwo() {
		
		System.out.println("Test two executed first");
	}
	
	@Test
	public void OpenBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/uma/Documents/INSTALLER/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Baby ToothBrush");
	Thread.sleep(3000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	
 
	}
	
	
	}
	
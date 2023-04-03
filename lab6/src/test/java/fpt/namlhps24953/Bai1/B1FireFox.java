package fpt.namlhps24953.Bai1;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B1FireFox {
	public String baseUrl = "https://ap.poly.edu.vn/";
	String driverPath = "C:\\Users\\ACER\\Documents\\FPT\\5.B HIGHFUNTION TEST\\FireFox Driver\\geckodriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching firefox browswer");
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	@Test
	public void verifyHomepageTitle() {
		String expectedTitle = "Cao đẳng FPT Polytechnic";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void terminateBrowser() {
		driver.quit();
	}
}
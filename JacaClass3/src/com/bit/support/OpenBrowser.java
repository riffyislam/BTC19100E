package com.bit.support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	ChromeDriver driver;
	public void open() {
		//System.setProperty("webdriver.chrome.driver", "/Users/Riffy/Downloads/chromedriver");
		//driver=new ChromeDriver();
	}
	public void goToUrl() {
		//driver.get("https://www.facebook.com/");
	}
	//public void goToUrl(String url) {
		//driver.get(url);
	
	public void verifyTitle() {
		boolean b=driver.getTitle().equals("Facebook Home Page");
		System.out.println(b);
	}
	/*public void typeEmail() {
		driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[2]/div[1]/input")).sendKeys("myemail");
	}
	public void typeEmail(By x,String text) {
		driver.findElement(x).sendKeys(text);
	}
	public void typePassword() {
		driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[2]/div[2]/input")).sendKeys("mypassword");
	}	
		public void typePassword(String x,String text) {
			driver.findElement(By.xpath(x)).sendKeys(text);
	}
	
	public void clickButton() {
		driver.findElement(By.id("u_0_2")).click();
	}
	public void clickButton(WebElement e) {
		e.click();
	}
	
	
	}
	public void verifyTitle(String title) {
		boolean b=driver.getTitle().equals(title);
		System.out.println(b);
	}
	
	public void isElementPresent(By x) {
		boolean c=driver.findElement(x).isDisplayed();
		System.out.println(c);*/
		}
}

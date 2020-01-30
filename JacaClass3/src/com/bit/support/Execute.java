package com.bit.support;

public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OpenBrowser op=new OpenBrowser();
		op.open();
		//op.goToUrl();
		/*op.goToUrl("www.amazon.com");
		op.typeEmail();
		op.typePassword();
		*/op.clickButton();
	}
	/*
	DataType			Value
	ChromeDriver		new ChromeDriver();
	WebElement			driver.findElement(By.xpath("value of xpath"))
	By					Any locator like: By.id("value of id") or by xpath("value of xpath")
	List<WebElements>	driver.findElements(By.id("value of id")) or (By.xpath("value of xpath"))
	OpenBrowser			new OpenBrowser();
	 
	Return Type			methodName			purpose
	void				get()				navigate to url
	WebElement			findElement()		to find one element
	List <WebElement>	findElements()		to find more than one element
	void				sendKeys()			to type
	void				click/submit()		to click on element
	void				clear()				to clear text box
	String				getTitle()			to get title value
	String				getPageSource()		to get page view source html file
	String				getCurrentUrl()		to get current page url
	String				getText()			to get text from an element
	String				getAttribute()		to get attribute value of element
	boolean				isDisplayed()		to verify element present or not
	boolean				isSelected()		to verify check box is selected or not
	boolean				isEnabled()			to check element enabled or not
	boolean				equals()			to compare two object
	boolean				contains()			to see partial value
	 * 
	 */

}

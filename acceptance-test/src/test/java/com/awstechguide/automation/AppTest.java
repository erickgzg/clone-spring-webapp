package com.awstechguide.automation;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

	public HtmlUnitDriver driver;
	public String HOME_URL = "http://3.27.190.0:8080/sample/";
	public String PRODUCTS_URL = "http://http://3.27.190.0:8080/airsonic/";
	
	@Test
	public void test1() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(HOME_URL);
		   List<WebElement> el= driver.findElements(By.xpath("//*[text()[contains(.,'Hello')]]"));
		   System.out.println("No of times available: "+el.size());
		   driver.findElements(By.partialLinkText("It's"));
	   }
	
	@Test
	public void test2() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(PRODUCTS_URL);
		   List<WebElement> el= driver.findElements(By.xpath("//*[text()[contains(.,'parameters')]]"));
		   System.out.println("No of times available: "+el.size());
		   driver.findElements(By.partialLinkText("Tech"));
	   }
	@Test
	public void test3() {
		   driver = new HtmlUnitDriver();
		   driver.navigate().to(PRODUCTS_URL);
		   driver.findElements(By.partialLinkText("Click"));
	   }
}

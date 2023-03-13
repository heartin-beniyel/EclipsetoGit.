import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mOVEtoeLEMENT {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	String path ="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
	String type="webdriver.chrome.driver";
	String url="http://www.greenstechnologys.com/";
	
	
	System.setProperty(type, path);
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	Thread.sleep(1000);
	WebElement btn = driver.findElement(By.xpath("//button[@class='close']"));
			btn.click();
	WebElement onc = driver.findElement(By.xpath("//a[.='Online Courses']"));
	Actions builder = new Actions(driver);
//	builder.contextClick(onc).perform();
	builder.moveToElement(onc).perform();
	
	driver.findElement(By.linkText("Selenium")).click();
	Robot r = new Robot();
	
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_DOWN);
//	r.keyRelease(KeyEvent.VK_DOWN);
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
}
	
	
}

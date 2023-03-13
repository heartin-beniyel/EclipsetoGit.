import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowsHandeleing {
public static void main(String[] args) throws InterruptedException {
	String type="webdriver.chrome.driver";
	String path="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
	String url ="https://www.globalsqa.com/demo-site/frames-and-windows/";
	
	System.setProperty( type,path);
	WebDriver driver = new ChromeDriver();
	
	driver.get(url);
	String currentUrl1 = driver.getCurrentUrl();
	System.out.println(currentUrl1);
	driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/a")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> list= new ArrayList<String>(windowHandles);
	driver.switchTo().window(list.get(1));
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/a")).click();
	String currentUrl2 = driver.getCurrentUrl();
	System.out.println(currentUrl2);
	Set<String> windowHandles2 = driver.getWindowHandles();
	list.addAll(windowHandles2);
	driver.switchTo().window(list.get(2));
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[1]/a")).click();
	
}
}

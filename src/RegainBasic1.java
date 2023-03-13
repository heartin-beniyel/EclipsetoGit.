import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class RegainBasic1 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		String Type = "webdriver.chrome.driver";
		String Url="https://www.compliancewire.com";
		String Path="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";

		System.setProperty(Type, Path);
		WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("UserID"));
		user.sendKeys("250352");
		WebElement pass = driver.findElement(By.id("Password"));
		pass.sendKeys("jesus@007");
		WebElement ccode = driver.findElement(By.id("CompanyCode"));
		ccode.sendKeys("sal");
		WebElement btn = driver.findElement(By.id("btnLogin"));
		btn.click();
		
		WebElement compliance = driver.findElement(By.xpath("(//a[@href='#'])[2]"));
	Actions builder = new Actions(driver);
	builder.moveToElement(compliance).click().perform();
	}
}
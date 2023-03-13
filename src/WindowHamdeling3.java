import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHamdeling3 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {


		String type="webdriver.chrome.driver";
		String path="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
		String url ="https://www.amazon.in/";

		System.setProperty( type,path);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(url);
		String parrent = driver.getWindowHandle();
		WebElement mobiles = driver.findElement(By.xpath("(//a[.='Mobiles'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mobiles).perform();
		builder.contextClick(mobiles).perform();
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows=new ArrayList<>(windowHandles);
		Thread.sleep(2000);
		driver.switchTo().window(windows.get(1));
		WebElement dd = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
		dd.click();
		Select sel = new Select(dd);
		sel.selectByVisibleText("Books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement book = driver.findElement(By.xpath("//span[.='Revolutionaries : The Other Story of How India Won Its Freedom']"));

		builder.moveToElement(book).contextClick().perform();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles2 = driver.getWindowHandles();
		windows.clear();
		windows.addAll(windowHandles2);
		driver.switchTo().window(windows.get(2));
		driver.findElement(By.id("add-to-cart-button")).click();
		WebElement cart = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));
		System.out.println(cart.getText());
//		driver.switchTo().window(windows.get(1));
		driver.switchTo().window(parrent);
	}

}

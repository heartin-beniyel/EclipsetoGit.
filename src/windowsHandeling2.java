import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsHandeling2 {
	public static void main(String[] args) throws InterruptedException {

		String type="webdriver.chrome.driver";
		String path="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
		String url ="https://leafground.com/window.xhtml;jsessionid=node01cn49xrh6wtmohggp73i8a8ti47133.node0";

		System.setProperty( type,path);
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.findElement(By.id("j_idt88:new")).click();
		String currentUrl = driver.getCurrentUrl();
		String old = driver.getWindowHandle();		
		System.out.println(old);

Set<String> windowHandles = driver.getWindowHandles();
for (String nw : windowHandles) {
	driver.switchTo().window(nw);
}

String current = driver.getWindowHandle();
System.out.println(current);
driver.close();

driver.switchTo().window(old);
driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span")).click();

Set<String> windowHandles2 = driver.getWindowHandles();
for (String all : windowHandles2) {
	if (!all.equals(old)) {
		driver.switchTo().window(all);
		driver.close();
		
	}
}
	}

}

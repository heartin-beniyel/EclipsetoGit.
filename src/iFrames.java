import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {
public static void main(String[] args) throws InterruptedException {
	
	
	String path ="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
	String type="Webdriver.chrome.driver";
	String url="https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
	
	System.setProperty(type, path);
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.switchTo().frame("globalSqa");
	driver.findElement(By.className("pic_info_link_type6")).click();
	
	Thread.sleep(3000);
	driver.navigate().back();
	driver.switchTo().frame("globalSqa");
	driver.findElement(By.xpath("//*[@id=\"portfolio_items\"]/div[2]/a/div/div/div[1]/img")).click();
//	driver.switchTo().parentFrame();
}
	
	
	
	
}

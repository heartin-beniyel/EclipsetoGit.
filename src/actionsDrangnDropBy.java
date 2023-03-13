import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDrangnDropBy {

	
	public static void main(String[] args) {
		String path ="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
		String type="webdriver.chrome.driver";
		String url="https://jqueryui.com/draggable/";
		
		
		System.setProperty(type, path);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
//		driver.switchTo().frame(0);
		WebElement xpathframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(xpathframe);
		
		WebElement element = driver.findElement(By.id("draggable"));
		
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(element, x+50, y+50).perform();
	}
}

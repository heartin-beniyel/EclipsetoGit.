import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action {
	public static void main(String[] args) throws InterruptedException {
		
		String path ="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
		String type="webdriver.chrome.driver";
		String url="https://www.globalsqa.com/demo-site/draganddrop";
		
		
		System.setProperty(type, path);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("Accepted Elements")).click();
		driver.switchTo().frame("google_esf");
		
		WebElement draggable = driver.findElement(By.xpath("/html/body/div[2]"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();
	}

}

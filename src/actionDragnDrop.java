import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDragnDrop {
	public static void main(String[] args) {
		
		
		String path ="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
		String type="webdriver.chrome.driver";
		String url="https://jqueryui.com/droppable/";
		
		
		System.setProperty(type, path);
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
//		driver.switchTo().frame(0);
		WebElement xpathframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(xpathframe);

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(draggable, droppable).perform();
		String text = driver.findElement(By.id("draggable")).getText();
		System.out.println(text);
		String text2 = driver.findElement(By.id("droppable")).getText();
		System.out.println(text2);
	}

}

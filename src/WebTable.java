import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {



public static void main(String[] args) {
	String type="webdriver.chrome.driver";
	String path="C:\\Users\\Heartin Beniyel\\eclipse-workspace\\Regain\\Driver\\chromedriver.exe";
	String url ="https://cosmocode.io/automation-practice-webtable/";

	System.setProperty( type,path);
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(url);
	WebElement table = driver.findElement(By.id("countries"));
//	List<WebElement> totalrows = table.findElements(By.tagName("tr"));
//	for (WebElement rowcount : totalrows) {
//		String text = rowcount.getText();
//		System.out.println(text);
//		
		
		List<WebElement> country = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		for (WebElement countries : country) {
			String text2 = countries.getText();
			
			System.out.println(text2);
			if (text2.equals("Zimbabwe")) {
				//countries.findElement(By.xpath("//td[contains(strong,'Zimbabwe')]//preceding-sibling::td//input")).click();
				countries.findElement(By.xpath("//td[text()='Algiers']//preceding-sibling::td[2]//input")).click();
		
		}
			else {System.out.println("not there");
				};
	}
		int size = country.size();
		System.err.println(size);
	
}
}
	
	


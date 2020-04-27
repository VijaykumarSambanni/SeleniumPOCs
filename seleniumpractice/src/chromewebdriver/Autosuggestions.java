package chromewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) {
		// Initialize driver object
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		//Fetch test site
		d.get("https://www.google.com/");
		//WebElement searchbox = d.findElement(By.xpath("//input[@title='Search']"));
		d.findElement(By.xpath("//input[@title='Search']")).sendKeys("Cognizant mys");
		String value = d.findElement(By.xpath("//input[@title='Search']")).getText();
		do
		{
			d.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ARROW_DOWN);
			value = d.findElement(By.xpath("//input[@title='Search']")).getText();
		} while(value.equalsIgnoreCase("Cognizant mysore"));
		
		d.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	}

}

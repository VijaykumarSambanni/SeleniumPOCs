package chromewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		//Page extraction
		d.get("https://www.spicejet.com/");
		Thread.sleep(8000);
		
		//Select class defined
				Select s= new Select(d.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
				
				//INR selection
				s.selectByValue("INR");
				Thread.sleep(3000);
				
				//USD selection
				s.selectByValue("USD");
				Thread.sleep(3000);
		
		//Departure city selection
		d.findElement(By.xpath("//input[@class='select_CTXT']")).click();
		d.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(3000);
		
		//Arrival city selection
		d.findElement(By.xpath("(//a[@value='HBX'])[2]")).click();
		
		d.quit();
		
	}

}

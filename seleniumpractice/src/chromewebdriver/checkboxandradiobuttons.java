package chromewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxandradiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.spicejet.com/");
		
		//checkbox selection
		if(d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			d.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		}
		Thread.sleep(10000);
		
		//radio button selection
		d.findElement(By.xpath("//table[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[2]/label")).click();
	}

}

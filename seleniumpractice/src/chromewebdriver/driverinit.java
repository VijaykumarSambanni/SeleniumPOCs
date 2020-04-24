package chromewebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverinit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://softvision.workplace.com/");
		System.out.println(d.getCurrentUrl());
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("someone@softvision.com");
		//d.findElement(By.xpath("//button")).click();
		Thread.sleep(5000);
		//Activation page code
		/*System.out.println(d.findElement(By.xpath("//div[@class='hc7zxdzg']")).getText());
		System.out.println(d.findElement(By.xpath("//div[@class='hc7zxdzg']//following::div")).getText());
		System.out.println(d.findElement(By.xpath("//div[@class='hc7zxdzg']//parent::div")).getText());
		System.out.println(d.findElement(By.xpath("//div[@class='hc7zxdzg']//ancestor::div")).getText());*/
		
		System.out.println(d.findElement(By.xpath("//div[@data-testid='work_signup_footer']")).getText());
		System.out.println(d.findElement(By.xpath("//div[@data-testid='work_signup_footer']/div/ul/li[2]")).getText());
		System.out.println(d.findElement(By.xpath("//div[@data-testid='work_signup_footer']/div/ul/li[2]//following-sibling::li")).getText());
		System.out.println(d.findElement(By.xpath("//div[@data-testid='work_signup_footer']/div/ul//child::li")).getText());
		Thread.sleep(5000);
		d.quit();
	}

}

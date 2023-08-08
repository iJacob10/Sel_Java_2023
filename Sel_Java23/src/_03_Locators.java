import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Sel_Java_2023/chromedriver.exe");
		// Implicit Wait
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("APjFqb")).sendKeys("Twitter");
		driver.findElement(By.xpath("//*[@id=\'APjFqb\']")).sendKeys(Keys.ENTER);
		// driver.findElement(By.xpath("//input[@class='required_field
		// cityPadRight']")).sendKeys("DELHI");
		// driver.findElement(By.cssSelector("input[class='required_field
		// cityPadRight']")).sendKeys("DELHI");
		// ****Log in to Twitter***
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		// CSS Selector -
		/*
		 * Class Name -> tagname.classname ID -> tagname#id Tagname[attribute='value']
		 */
		// Scroll Down
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[autocapitalize='sentences']")).sendKeys("Testing");
		// Click NEXT
		driver.findElement(By.xpath("(//span[@class=\'css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0\'])[7]"))
				.click();
		Thread.sleep(2000);
		driver.close();

	}

}

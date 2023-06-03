package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameExercise {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("dummy-chat-button-iframe");
		driver.findElement(By.id("dummy-chat-button")).click();
		driver.switchTo().frame("ShopifyChat");
		driver.findElement(By.xpath("//div[@class='composer-bar__box']/textarea")).sendKeys("Welcome");
		driver.findElement(By.xpath("//button[contains(@class,'chat-app')]")).click();
		driver.findElement(By.id("best-online-shopping-site-in-india")).click();
		driver.switchTo().defaultContent();

	}

}

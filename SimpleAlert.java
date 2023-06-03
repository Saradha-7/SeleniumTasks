package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert = driver.switchTo().alert();
		String text2 = alert.getText();
		System.out.println(text2);
		alert.accept();
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
				

	}

}

package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertType {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click();
		Alert alert = driver.switchTo().alert();
		String text2 = alert.getText();
		System.out.println(text2);
		alert.sendKeys("Saradha");
		alert.accept();
		String element = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(element);
		
		

	}

}

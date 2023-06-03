package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//h5[text()='Sweet Alert (Simple Dialog)']/following::span)[2]")).click();
		String text = driver.findElement(By.xpath("//p[contains(text(),'You have clicked')]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();



	}

}

package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following::span")).click();
		Alert alert = driver.switchTo().alert();
		String text2 = alert.getText();
		System.out.println(text2);
		alert.dismiss();
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
				

	}

}

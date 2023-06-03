package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MarathonRedbus {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='sub-city']")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.className("sub-city")).click();
		
		driver.findElement(By.id("onward_cal")).click();
		
		driver.findElement(By.xpath("//td[text()='12']")).click();
		//"//td[@class='current day']/following-sibling::td"
		
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		System.out.println(driver.getTitle());
		
		WebElement t = driver.findElement(By.xpath("//span[text()='found']"));
		System.out.println(t.getText());
		
		driver.findElement(By.xpath("(//label[@class='cbox-label'])[6]")).click();
		
		WebElement tt = driver.findElement(By.xpath("//div[text()='VHB Travels']"));
		System.out.println(tt.getText());
	}

}

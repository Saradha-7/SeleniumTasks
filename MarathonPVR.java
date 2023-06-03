package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.Select;

public class MarathonPVR {

	public static void main(String[] args) {
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notifications");
		//ChromeDriver driver = new ChromeDriver(option);
		
		EdgeOptions option = new EdgeOptions();
		option.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(option);
		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		
		driver.findElement(By.xpath("//select[@name='city']")).click();
		WebElement city = driver.findElement(By.xpath("//option[text()='Chennai']"));
		city.click();
		
		driver.findElement(By.name("genre")).click();
		WebElement gen = driver.findElement(By.xpath("//option[text()='ANIMATION']"));
		gen.click();
		
		driver.findElement(By.name("lang")).click();
		WebElement language = driver.findElement(By.xpath("//option[text()='ENGLISH']"));
		language.click();
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		//driver.findElement(By.xpath("(//div[@class='movie-list']//div)[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'movie-wrapper')]/img)[1]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		driver.findElement(By.xpath("//select[@name='cinemaName'][1]")).click();
		driver.findElement(By.className("deals-ex-pro")).click();
		driver.findElement(By.xpath("//span[text()='19']")).click();
		
		driver.findElement(By.xpath("//select[@name='timings']")).click();
		driver.findElement(By.xpath("//select[@name='timings'][1]")).click();
		
		driver.findElement(By.name("noOfTickets")).sendKeys("4");
		driver.findElement(By.name("name")).sendKeys("Mouni");
		driver.findElement(By.name("email")).sendKeys("Mouni@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//select[@name='food']")).click();
		driver.findElement(By.xpath("//select[@name='food'][1]")).click();
		
		driver.findElement(By.name("comment")).sendKeys("Movie Tickets");
		
		driver.findElement(By.className("custom-control custom-radio")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		
		
		

	}

}

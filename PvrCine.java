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

public class PvrCine {

	public static void main(String[] args) throws Exception {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		//EdgeOptions option = new EdgeOptions();
		//option.addArguments("--disable-notifications");
		//EdgeDriver driver = new EdgeDriver(option);
		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		
		//driver.findElement(By.name("city")).click();
		WebElement city = driver.findElement(By.name("city"));
		Select c = new Select(city);
		c.selectByVisibleText("Chennai");
		
		driver.findElement(By.name("genre")).click();
		WebElement gen = driver.findElement(By.xpath("//option[text()='ANIMATION']"));
		gen.click();
		
		driver.findElement(By.name("lang")).click();
		WebElement language = driver.findElement(By.xpath("//option[text()='ENGLISH']"));
		language.click();
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='movie-list']/div[1]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		driver.findElement(By.name("cinemaName")).click();
		driver.findElement(By.xpath("//option[text()='PVR Heritage RSL ECR Chennai']")).click();
		
		//driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid ng-touched']")).click();
		//driver.findElement(By.xpath("(//span[contains(@class='day-unit')])[1]")).click();
		
		
		driver.findElement(By.name("timings")).click();
		driver.findElement(By.xpath("//option[text()='09:00 AM - 12:00 PM']")).click();
		
		driver.findElement(By.name("noOfTickets")).sendKeys("4");
		driver.findElement(By.name("name")).sendKeys("Mouni");
		driver.findElement(By.name("email")).sendKeys("Mouni@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("9876543210");
		
		WebElement food = driver.findElement(By.name("food"));
		Select f = new Select(food);
		f.selectByIndex(1);
		
		
		driver.findElement(By.name("comment")).sendKeys("Movie Tickets");
		
		driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
		
		driver.findElement(By.linkText("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.linkText("CANCEL")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		

	}

}




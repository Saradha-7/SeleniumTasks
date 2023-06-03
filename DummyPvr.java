package week2.assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyPvr {
	public static void main(String[] args) throws Exception{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[contains(text(),'Movie Library ')]")).click();
		Thread.sleep(3000);
		WebElement cityEle = driver.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']"));
		Select city = new Select(cityEle);
		city.selectByVisibleText("Chennai");
		Thread.sleep(3000);
		WebElement GenreEle = driver.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']"));
		Select Genre = new Select(GenreEle);
		Genre.selectByVisibleText("ANIMATION");
		Thread.sleep(3000);
		WebElement languageEle = driver.findElement(By.xpath("//select[@class='form-control ng-untouched ng-pristine ng-valid']"));
		Select language = new Select(languageEle);
		language.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed To Book')]")).click();
		Thread.sleep(3000);
		WebElement cinemaEle = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select cinema = new Select(cinemaEle);
		cinema.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='ng-untouched ng-pristine ng-valid']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'18')]")).click();
		Thread.sleep(3000);
		WebElement timingsEle = driver.findElement(By.xpath("//select[@name='timings']"));
		Select timing = new Select(timingsEle);
		timing.selectByVisibleText("09:00 AM - 12:00 PM");
		driver.findElement(By.name("noOfTickets")).sendKeys("5");
		driver.findElement(By.name("name")).sendKeys("Latcham");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("a.b@c.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9090000000");
		WebElement foodsEle = driver.findElement(By.xpath("//select[@name='food']"));
		Select food = new Select(foodsEle);
		food.selectByVisibleText("Yes");
		driver.findElement(By.name("comment")).click();
		driver.findElement(By.name("comment")).sendKeys("Nothing");
		driver.findElement(By.xpath("//span[contains(text(),'Copy To Self')]")).click();	
		driver.findElement(By.xpath("//button[contains(text(),'SEND REQUEST')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'CANCEL')])[2]")).click();
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		System.out.println("page title is " + driver.getTitle());
		driver.close();
	}
}
package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Saradha");
		driver.findElement(By.name("lastname")).sendKeys("A");
		
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("sara@gmail.com");
		
		
		driver.findElement(By.id("password_step_input")).sendKeys("Mouni@1");
		
		driver.findElement(By.name("birthday_day")).click();
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select d = new Select(day);
		d.selectByValue("7");
		
		driver.findElement(By.name("birthday_month")).click();
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select m = new Select(month);
		m.selectByVisibleText("Sep");
		
		driver.findElement(By.name("birthday_year")).click();
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select y = new Select(year);
		y.selectByVisibleText("2015");
		
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		driver.getTitle();
		
		
		

	}

}

package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MarathonAmazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		
		WebElement bag = driver.findElement(By.xpath("//span[text()=' for boys']"));
		bag.click();
		
		WebElement title1 = driver.findElement(By.xpath("//span[contains(text(),' results for')]"));
		WebElement title2 = driver.findElement(By.xpath("//span[contains(text(),' boys')]"));
		
		System.out.println(title1.getText()+" "+ title2.getText());
		//Select b = new Select(bag);
		//b.selectByVisibleText(" for boys");
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[11]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[12]")).click();
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[87]")).click();
		
		WebElement price = driver.findElement(By.className("a-price-whole"));
		WebElement name = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'][1]"));
		System.out.println("Name of the bag: "+name.getText());
		System.out.println("Price of the bag: "+price.getText());
		System.out.println("Title of the page: "+driver.getTitle());
		driver.close();
		
		
		
		
		
		
		

	}

}

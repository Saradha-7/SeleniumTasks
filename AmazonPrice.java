package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile",Keys.ENTER);
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		List<Integer> list = new ArrayList<>();
		for (WebElement each : prices) {
			String price = each.getText();
			String replacedString = price.replaceAll(",", "");
			//System.out.println(replacedString);
			if(!replacedString.isEmpty()) {
				int priceValue = Integer.parseInt(replacedString);
				list.add(priceValue);	
				
			}	
			
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		
		
		
		

	}

}

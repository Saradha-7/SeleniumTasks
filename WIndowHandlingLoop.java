package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WIndowHandlingLoop {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String pWindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> cWindowHandles = driver.getWindowHandles();
		int size = cWindowHandles.size();
		System.out.println(size);
		List<String> handles = new ArrayList<>(cWindowHandles);
		for (String string : handles) {
			if(!string.equals(pWindowHandle)) {
				WebDriver window = driver.switchTo().window(string);
				System.out.println(window);
				driver.close();
			} else {
				System.out.println("It parent window");
			}
			
			
			
		}


	}

}

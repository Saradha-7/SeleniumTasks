package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.microsoft.schemas.vml.CTHandles;

public class WindowHandlingBasic {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String pwindowHandle = driver.getWindowHandle();
		System.out.println(pwindowHandle);
		Set<String> cwindowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(cwindowHandles);
		driver.switchTo().window(list.get(1));
		String title2 = driver.getTitle();
		System.out.println(title2);
		if (!pwindowHandle.equals(title2)) {
			System.out.println("Child Window");
			
		} else {
			System.out.println("Same Window");

		}
		driver.quit();
		

	}

}

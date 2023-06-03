package week4.marathon2;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;
import io.github.sukgu.support.FindElementBy;

public class AdminCeritification {

	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1&2 login page
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		//3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();	
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> handles = new ArrayList<>(windowHandle);
		driver.switchTo().window(handles.get(1));
		//4. Click confirm on Confirm redirect
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//5. Click Learning 
		Shadow shad = new Shadow(driver);
		shad.findElementByXPath("//span[text()='Learning']").click();
		//6. And mouse hover on Learning On Trailhead
		WebElement trailHead = shad.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder = new Actions(driver);
		builder.moveToElement(trailHead).perform();
		
		//7. Click on Salesforce Certifications
				Shadow shadow = new Shadow(driver);
				WebElement salesCertification = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
				//driver.findElement(By.xpath("//button[text()='Accept All Cookies]")).click();
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", salesCertification);
				
				
				//8. Click on first resulting Ceritificate
				WebElement scrollElement = driver.findElement(By.xpath("//a[text()='Administrator']"));
				Actions scroll = new Actions(driver);
				scroll.scrollToElement(scrollElement).perform();
				driver.findElement(By.xpath("//a[text()='Administrator']")).click();
				driver.switchTo().defaultContent();

		//9. verify - Administrator Overview page
		
		//10.Print the Certifications available for Administrator Certifications (List)
		List<WebElement> certificationList = driver.findElements(By.xpath("//div[text()='Certification']/following::a"));
		
		for (WebElement eachWebElement : certificationList) {
			String text = eachWebElement.getText();
			System.out.println(text);
			
		}
		
		//11.Take a Snapshot of Loaded Ceritificate
		WebElement screenShotCertification = driver.findElement(By.xpath("//a[text()='Business Administration Specialist']"));
		Actions screeShot = new Actions(driver);
		screeShot.scrollToElement(screenShotCertification).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snap/adminCertificate.png");
		FileUtils.copyFile(source, destination);
		

	}

}

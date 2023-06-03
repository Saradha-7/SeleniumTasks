package week4.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertification {

	public static void main(String[] args) throws IOException {
	//	1. Launch Salesforce application https://login.salesforce.com/
		//	2. Login with Provided Credentials
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

		//	3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();	
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> handles = new ArrayList<>(windowHandle);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//	4. Click  On Learning
		Shadow shad = new Shadow(driver);
		shad.findElementByXPath("//span[text()='Learning']").click();
		//	5. And mouse hover on Learning On Trailhead
		WebElement trailHead = shad.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder = new Actions(driver);
		builder.moveToElement(trailHead).perform();
		//	6. Click on Salesforce Certifications
		Shadow shadow = new Shadow(driver);
		WebElement salesCertification = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		//driver.findElement(By.xpath("//button[text()='Accept All Cookies]")).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", salesCertification);
		//	7. Choose Your Role as Salesforce Architect
		WebElement role = driver.findElement(By.xpath("(//div[contains(text(),'Salesforce')])[5]"));
		role.click();
		//	8. Get the Text(Summary) of Salesforce Architect 
		WebElement content = driver.findElement(By.xpath("//div[@class='slds-container--center slds-container--medium slds-p-vertical--large']/div"));
		String roleText = content.getText();
		System.out.println(roleText);
		//	9. Get the List of Salesforce Architect Certifications Available
		List<WebElement> certificationList = driver.findElements(By.xpath("//div[text()='Certification']/following::a"));
		
		for (WebElement eachWebElement : certificationList) {
			String text = eachWebElement.getText();
			System.out.println(text);
			
		}
		//	10.Click on Application Architect 
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		//	11.Get the List of Certifications available
		List<WebElement> certificationList1 = driver.findElements(By.xpath("//div[text()='Certification']/following::a"));
		
		for (WebElement eachWebElement : certificationList1) {
			String text1 = eachWebElement.getText();
			System.out.println(text1);
		}
		//	12.Take a Snapshot of Loaded Ceritificate
			WebElement screenShotCertification = driver.findElement(By.xpath("//a[text()='Platform App Builder']"));
			Actions screeShot = new Actions(driver);
			screeShot.scrollToElement(screenShotCertification).perform();
			File source = driver.getScreenshotAs(OutputType.FILE);
			File destination = new File("./snap/ArchitectCertificate.png");
			FileUtils.copyFile(source, destination);
			

	}

}

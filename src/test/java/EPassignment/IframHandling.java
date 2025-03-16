package EPassignment;

import java.nio.channels.FileLockInterruptionException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id=\"singleframe\"]")).isSelected();
		driver.switchTo().frame("singleframe");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IFRAM");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[href=\"#Multiple\"]")).click();
		
		 WebElement firstIframe = driver.findElement(By.cssSelector("[src=\"MultipleFrames.html\"]")); // Replace with actual ID
	        driver.switchTo().frame(firstIframe);

	        
	        WebElement secondIframe = driver.findElement(By.cssSelector("[src=\"SingleFrame.html\"]")); // Replace with actual ID
	        driver.switchTo().frame(secondIframe);

			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("QA");

	       
	        driver.switchTo().parentFrame();
	        driver.switchTo().defaultContent();
	        String Actual = driver.getCurrentUrl();
	        String ExpectedUrl = "https://demo.automationtesting.in/Frames.html";
	        if(Actual.equals(ExpectedUrl)) {
	        	System.out.println("Pass");
	        }else {
	        	System.out.println("Fail");
	        }

	        Thread.sleep(3000);
	        
             driver.quit();
	 
		
		
		
	
		

	}

}

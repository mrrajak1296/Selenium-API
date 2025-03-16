package EPassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#Open%20New%20Tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String win = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"button e.g. button_hilite button_pale small_button\"])[1]")).click();
		
		String ans = driver.findElement(By.cssSelector("[class=\"page_heading\"]")).getText();
		
		System.out.println(ans);
		Thread.sleep(3000);
		
		driver.switchTo().window(win);
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}

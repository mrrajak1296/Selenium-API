package EPassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\PC\\Desktop\\abc\\anil.txt");
		driver.findElement(By.id("file-submit")).click();
		
		String ans =driver.findElement(By.cssSelector("[class=\"example\"]")).getText();
		System.out.println(ans);
		
		driver.close();

	}

}

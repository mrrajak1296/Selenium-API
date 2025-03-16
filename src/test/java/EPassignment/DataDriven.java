package EPassignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream(new File("C:\\Users\\PC\\eclipse-workspace\\EvelateAssignment\\New Microsoft Excel Worksheet.xlsx"));
		 Workbook book = WorkbookFactory.create(file);
		 
		 String username = book.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		 String password = book.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		 
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		 
		 driver.findElement(By.cssSelector("[class=\"btn\"]")).click();
		 String ans = driver.findElement(By.cssSelector("[class=\"post-title\"]")).getText();
		 
		 System.out.println(ans);
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
		 

	}

}

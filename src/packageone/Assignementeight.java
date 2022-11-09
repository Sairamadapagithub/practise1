package packageone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignementeight {

	public static void main(String[] args) throws InterruptedException {
		

System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\105lates\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("unit");
		
		Thread.sleep(3000);
		List<WebElement> alldata= driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for(int i=0; i<alldata.size();i++) {
			
		System.out.println(alldata.get(i).getText());
		if(alldata.get(i).getText().contains("United Arab Emirates")) {
			
		alldata.get(i).click();
			break;
	}
		
			}
			
		
		System.out.println("done");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).click();
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));

}
}

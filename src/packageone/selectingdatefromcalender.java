package packageone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectingdatefromcalender {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\105lates\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//	
//		while(!driver.findElement(By.className("ui-datepicker-year")).getText().contains("2020")){
//			
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
//		}
//		while(!driver.findElement(By.className("ui-datepicker-month")).getText().contains("January")) {
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//				
//			System.out.println(driver.findElement(By.className("ui-datepicker-title")).getText());
//		}
//		Thread.sleep(5000);
		while(!driver.findElement(By.className("ui-datepicker-title")).getText().contains("June 1994")) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
						
		}
	List<WebElement> day= driver.findElements(By.xpath("//td[@data-event='click']"));
		for(int i=0; i<day.size();i++) {
			if(driver.findElements(By.xpath("//td[@data-event='click']")).get(i).getText().contains("23")) {
				driver.findElements(By.className("ui-datepicker-next ui-corner-all")).get(i).click();
				break;
			}
		}
		
	}
		
		
		
	}



package packageone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentfive {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/");
	
	List<WebElement> listofitems=driver.findElements(By.xpath("//div[@id='content']/ul/li"));
	
	for(int i=0; i<listofitems.size(); i++) {
		String itemsname=listofitems.get(i).getText();
		if(itemsname.contains("Nested Frames")) {
			//System.out.println(itemsname);

			driver.findElements(By.xpath("//div[@id='content']/ul/li/a")).get(i).click();
			break;
		}
	
	}
	//Thread.sleep(3000);
	driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	
//driver.switchTo().frame("frame-top");
//
//
//
//	driver.switchTo().frame("frame-middle");
//
//
//
//	System.out.println(driver.findElement(By.id("content")).getText());
	
	
	System.out.println(driver.findElements(By.tagName("frame")).size());
	
	//driver.switchTo().frame("//frameset[@frameborder='1']");	
	//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
	//driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@name='frameset-middle']")));
	System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
	
	}
}

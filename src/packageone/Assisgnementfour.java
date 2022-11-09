package packageone;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assisgnementfour {

	
	
	//click on multiple windows
	//clcik on click while will take to another page where new page will get opened
	//capture "New window" test
	//print the above
	//swith to first window
	//print to openeing an window
	
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/");
	
//	driver.findElement(By.xpath("(//div[@id='content']/ul/li/a)[33]")).click();
//	driver.findElement(By.xpath("//div[@class='example']/a")).click();
//	Set<String> totalblocks= driver.getWindowHandles();
//	Iterator<String> totalblockit= totalblocks.iterator();
//	
//	String parentclass=totalblockit.next();
//	String childclass=totalblockit.next();
//	
//	driver.switchTo().window(childclass);
//	System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
//	driver.switchTo().window(parentclass);
//	System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
//	
	
List<WebElement> listofname=driver.findElements(By.xpath("//div[@id='content']/ul/li"));


for (int i=0; i<listofname.size();i++) {
	String values=listofname.get(i).getText();
//	
	//System.out.println(values);
//	
	if(values.contains("Multiple Windows")) {
		System.out.println(values);
		 driver.findElements(By.xpath("//div[@id='content']/ul/li/a")).get(i).click();
		 break;
		   //driver.findElements(By.xpath("//div[@id='content']/ul/li/a")).get(i).click();
	}
//	// if(values.contains("Multiple Windows")) {
//		//  driver.findElement(By.xpath("//div[@id='content']/ul/li"))
	//driver.findElements(By.xpath("//*[@id='content']/ul/li/a")).get(i).click();
//	// }
}
	}
}


package packageone;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkspractice {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\105lates\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	//driver.get("chrome://settings/clearBrowserData");
	//Thread.sleep(10000);
	//driver.findElement(By.id("clearBrowsingDataConfirm")).click();
	driver.manage().window().maximize();
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
	List<WebElement> Discountcoupons= driver.findElements(By.xpath("(//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li/a)"));

	System.out.println(Discountcoupons.size());
	int z=Discountcoupons.size();
	for (int i=0; i<z;i++) {
		
		String click =Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElements(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li/a")).get(i).sendKeys(click);
		
	
	Set<String>  ram= driver.getWindowHandles();
	Iterator<String> itemse= ram.iterator();	
		while(itemse.hasNext()){
	driver.switchTo().window(itemse.next());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println("--------------------------------");
	
}
		String parentwindow= itemse.next();
		driver.switchTo().window(parentwindow);
		
	}
	
	}}
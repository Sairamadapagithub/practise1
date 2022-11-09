package packageone;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//WebDriverWait newwailog= new WebDriverWait(driver,5);
//	driver.get("https://www.amazon.in/");
//	//newwailog.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//a[@id='nav-link-accountList']"))));
//	Actions objectforaction =new Actions(driver);
//	
//	//objectforaction.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
//	//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("ADAPA");
//	Thread.sleep(3000);
//	objectforaction.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("Adapa").doubleClick().build().perform();
//	
	
	
	// for parent to child traverse
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
	
	//now we need to check how many pages were open
		Set <String>totalwindows=driver.getWindowHandles();
		Iterator <String> objforiterator= totalwindows.iterator();
		
		String parentclass=objforiterator.next();
		
		String childclass=objforiterator.next();
		
		driver.switchTo().window(childclass);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String username=driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		
		String[] trimmedusername=username.split("at");
		
		String[] fialword = trimmedusername[1].trim().split(" ");
		String finale= fialword[0];
		
		System.out.println(finale);
		
		
		driver.switchTo().window(parentclass);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(finale);
		
		}
}

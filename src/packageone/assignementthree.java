package packageone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignementthree {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait newwailog= new WebDriverWait(driver,5);
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("learning");
		//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		newwailog.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-success']")));
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		WebElement selectdropdown = driver.findElement(By.xpath(("//select[@class='form-control']")));
		Select dropdownone =new Select(selectdropdown);
				dropdownone.selectByVisibleText("Consultant");
		
		driver.findElement(By.xpath("//input[@name='terms']")).click();
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		newwailog.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-info'])[1]")));
		List<WebElement> clickonaddbutton =driver.findElements(By.xpath("(//button[@class='btn btn-info'])"));
		
		for(int i=0; i<clickonaddbutton.size();i++) {
			
			clickonaddbutton.get(i).click();
		}
		driver.findElement(By.xpath("(//a[@class='nav-link btn btn-primary'])")).click();
	}
}

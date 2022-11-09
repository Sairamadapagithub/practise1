package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignemnet7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\105lates\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
	//Size of total horizintal values
		System.out.println(driver.findElements(By.xpath("(//table[@id='product']/tbody)[1]/tr")).size());
	//Size of total Vertical values	
		System.out.println(driver.findElements(By.xpath("(//table[@id='product']/tbody)[1]/tr/th")).size());
	//printing data in second row
		
		System.out.println(driver.findElement(By.xpath("((//table[@id='product']/tbody)[1]/tr)[3]")).getText());
	}

}

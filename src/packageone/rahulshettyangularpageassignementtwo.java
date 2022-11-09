package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahulshettyangularpageassignementtwo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().window().maximize();
	//Name automated
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Rahul Shetty one of student");
	//Email automated
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("RahulShettyOneOfStudent@gmail.com");
	//Password
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Rahulsheetystudent");
	//Check box for below password
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
	//Select female and then male
		Select Genderselection =new Select(driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")));
	 //Female selection
		Genderselection.selectByIndex(1);
	
	 //Male selection.	
		Genderselection.selectByIndex(0);
	
	//Employment Status
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
	//Date of Birth	
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("10-07-1994");
		
	//Submit Button:
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}

package packageone;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ekartwebsite {
	public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	
	String[] veggiesdetails= {"Pumpkin - 1 Kg","Cauliflower - 1 Kg","Beetroot - 1 Kg"};
	
	System.out.println();
	driver.manage().window().maximize();
	Thread.sleep(5000);
	methodone(driver, veggiesdetails);
	
}
	public static void methodone(WebDriver driver,String[] veggiesdetails) {
		List<WebElement> allitems= driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j=0;
		for(int i=0; i<allitems.size();i++) {
			
	        List<String> arraylistfrveggies = Arrays.asList(veggiesdetails);
	   //  System.out.println(arraylistfrveggies.size());
	        
			
			String valuesinallitemss = allitems.get(i).getText();
		
			if (arraylistfrveggies.contains(valuesinallitemss)) 
			
			{
				System.out.println(valuesinallitemss);
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println("entered");
				
						j++;
				if ( j>=veggiesdetails.length) {
					break;
				}
			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		WebDriverWait obj =new WebDriverWait(driver, 5);
		obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("Rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		obj.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='promoInfo']")));
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
	}
}
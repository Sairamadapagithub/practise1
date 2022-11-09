package packageone;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class classonechecking {

	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> country =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		
		for(WebElement name:country) {
			
			System.out.println(name.getText());
			
			if(name.getText().equalsIgnoreCase("India")) {
				name.click();
				System.out.println("clicked");
				break;
			}
		}
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
	//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		//driver.findElement(By.xpath("//a[@value='BHO']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR'])")).click();
		
		
		//driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		
		
		
		
		
		
		
		
		
		// STATIC DROPDOWN 
		
		/*driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		int i=1;
		while(i<4) {
		driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[1]/div[2]/span[3]")).click();
		i++;
		}
		for(int z=0;z<4;z++) {
			driver.findElement(By.xpath("//div[@id='divpaxOptions']/div[1]/div[2]/span[3]")).click();
				
			
		}
		/*WebElement element1=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		
		Select obj1 =new Select(element1);
		System.out.println(obj1.getFirstSelectedOption().getText());
		obj1.selectByIndex(2);
		System.out.println(obj1.getFirstSelectedOption().getText());
		obj1.selectByIndex(3);
		System.out.println(obj1.getFirstSelectedOption().getText());
		
		/* driver.get("https://web.whatsapp.com/");
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		/*driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("point");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("turorial ");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input")).sendKeys("10/07/1994");
		driver.findElement(By.xpath("//input[@value='Manual Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		driver.findElement(By.xpath("//select[@name='selenium_commands']/option[4]")).click();
		
	*/	
		
	
	}
	
}


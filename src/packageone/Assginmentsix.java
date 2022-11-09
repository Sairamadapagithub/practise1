package packageone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assginmentsix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\105lates\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String optionselected =driver.findElement(By.xpath("//label[@for='benz']")).getText();
			
		
		Select optionselect = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
			List<WebElement> alldatafromselectdropdown =optionselect.getOptions();
			
					for(int i=0;i<alldatafromselectdropdown.size();i++) {
							String valuesinselectdropdown= alldatafromselectdropdown.get(i).getText();
		
								if(valuesinselectdropdown.contains(optionselected)) {
									optionselect.selectByIndex(i);
									
					
				
}
}
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(optionselected);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String alertdata=driver.switchTo().alert().getText();
			if(alertdata.contains(optionselected)) {
				System.out.println("Option2 data is available");
			}
		
		
}
}

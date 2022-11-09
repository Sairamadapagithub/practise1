package packageone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonautomation {
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=mobiles+under+1000%2B0&crid=3JNATZOPVRHFH&sprefix=mobiles%2Caps%2C253&ref=nb_sb_ss_pltr-ranker-retrain-acsession-acceptance_3_7");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	List<WebElement> allmobiles= driver.findElements(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])/span"));
	
	
	for(int i=0; i<allmobiles.size(); i++) {
		
		String data= allmobiles.get(i).getText();
		
		if(data.contains("Samsung")) {
			allmobiles.get(i).click();
		}
	}
	}
}

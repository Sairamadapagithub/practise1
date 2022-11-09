package packageone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentforcheckboxone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\adapa\\Desktop\\selenium\\Drivers\\latest\\102b\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/*
		 * //option 1 driver.findElement(By.id("checkBoxOption1")).click(); //option 1
		 * is selected
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ; //uncheck the first check box
		 * driver.findElement(By.id("checkBoxOption1")).click(); //checking if it
		 * selected or unselected.
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ; //total count of checkboxes
		 * 
		 * System.out.println(driver.findElements(By.xpath(
		 * "(//div[@class='right-align']/fieldset)[1]/label/input")).size());
		 */
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rama");

		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		Thread.sleep(5000);

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		// driver.switchTo().alert().dismiss();

	}

}

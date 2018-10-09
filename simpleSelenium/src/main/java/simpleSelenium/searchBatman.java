package simpleSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class searchBatman {
	public static void main(String[] args) {
		try {
		//set system property for web driver
		System.setProperty("webdriver.gecko.driver","PATH TO YOUR GECKO DRIVER");
		// Create an instance of the driver	
		Thread.sleep(2000);
		WebDriver driver = new FirefoxDriver();
		// Navigate to a web page
		driver.get("http://google.com");
		// Perform actions on HTML elements, entering text, clicking them,etc. 	
		
		WebElement search = driver.findElement(By.id("lst-ib"));
		search.sendKeys("Batman");
		driver.findElement(By.className("tsf-p")).click();
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(10000);
		driver.quit();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}
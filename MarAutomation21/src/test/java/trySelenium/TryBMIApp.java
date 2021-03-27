package trySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryBMIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//BrowserDriver//chromedriver.exe");	
		WebDriver driver=new ChromeDriver();		
			driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");//get will open a URL in the chrome
			driver.findElement(By.id("heightCMS")).sendKeys("160");
			driver.findElement(By.id("weightKg")).sendKeys("80");
			driver.findElement(By.id("Calculate")).click();
			//driver.findElement(By.)
			String prefilledvalue=driver.findElement(By.name("bmi_category")).getAttribute("value");//"bmi_category"
			System.out.println("My category is"+prefilledvalue);
		}



	}


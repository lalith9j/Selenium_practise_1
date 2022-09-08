package Assignment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_3_Part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("http://sme.spicejet.com/Airline/SMERegister");
   WebElement Name_Of_Organization= driver.findElement(By.id("smeRegistration_OrganizationName"));
   WebElement Name_Of_Organization_1= driver.findElement(By.name("smeRegistration.OrganizationName"));
   
   //driver.close();
	}

}

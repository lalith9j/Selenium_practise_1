package Opening_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Chrome_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://myadoptionportal.com");
   driver.findElement(By.name("username")).sendKeys("rolesmedia@mediaus.com");
   driver.findElement(By.name("password")).sendKeys("rolesmedia@mediaus.com");
   driver.findElement(By.className("btn-login")).click();
   driver.close();
	}

}

package Assignment_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1_Browsercommands_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://selectorshub.com/xpath-practice-page/");
   Thread.sleep(12000);
   driver.findElement(By.xpath("(//a[contains(text(),'Donate')])[2]")).click();
   Thread.sleep(6000);
   driver.quit();
     
	}

}

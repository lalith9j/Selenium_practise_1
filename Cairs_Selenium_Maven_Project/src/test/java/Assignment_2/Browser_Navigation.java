package Assignment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.navigate().to("https://www.google.com/");
     String title= driver.getTitle();
     System.out.println("Title of the Browser" + title);
     
     driver.get("https://myadoptionportal.com/myportal.php");
     String tit= driver.getTitle();
     System.out.println("Title Of the second Browser" + tit);
     driver.navigate().back();
     Thread.sleep(3000);
     driver.navigate().forward();
     Thread.sleep(2000);
     driver.navigate().refresh();
     Thread.sleep(2000);
     driver.close();
	}

}

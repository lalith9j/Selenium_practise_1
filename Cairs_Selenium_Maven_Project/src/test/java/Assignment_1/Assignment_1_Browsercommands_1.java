package Assignment_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1_Browsercommands_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    String url= driver.getCurrentUrl();
	    System.out.println("### Url ##Of the application" + url);
	    String title= driver.getTitle();
	    System.out.println("Title of the Browser" + title);
	    String pgesor= driver.getPageSource();
	    System.out.println("Page source is" + pgesor);
	    driver.getTitle();
	    driver.close();
	    
	}

}

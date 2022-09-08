package Assignment_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://sme.spicejet.com/Airline/SMERegister");
		
	}

}

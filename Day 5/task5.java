package day_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class task5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://Drivers//chromedriver.exe" );
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		

	}

}

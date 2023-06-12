package sampleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumPractiseWorkSpace\\C1_WebDriverTest\\Browser\\chromedriver.exe");
 WebDriver wd = new ChromeDriver();
 wd.get("https://www.google.com/");
	}

}

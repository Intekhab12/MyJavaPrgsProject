package Selenium1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelPrg_TakesScreenShot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();

		//System.setProperty("webdriver.chrome.driver","D:\\ZS Drive\\eclipse\\chromedriver.exe");

		//WebDriver driver=new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver","D:/ZS Drive/eclipse/geckodriver-v0.33.0-win-aarch64/geckodriver.exe");

		WebDriver driver=new FirefoxDriver();

		//driver.get("https://www.youtube.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File trg=new File(".\\screenshots\\HomePage3.png");
		          
		FileUtils.copyFile(src, trg);
		
		
		//System.out.println(driver.getCurrentUrl());

		Thread.sleep(3000);

		//System.out.println(driver.getTitle());

		driver.close();
	}

}

package BNZCommonMethodsPak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BNZCalcCommonMethodsC {

	public static void TestBNZ() {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\selenium-java-3.5.0\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bnz.co.nz");
		//driver.manage().window().maximize();
		By mainPage_ApplyLink=By.xpath("//*[@id=\"header\"]/div/nav[1]/ul/li[1]/a");
		boolean mainPage_ApplyLinkIsDisplayed=driver.findElement(mainPage_ApplyLink).isDisplayed();
		if (mainPage_ApplyLinkIsDisplayed) {
			driver.findElement(mainPage_ApplyLink).click();
		}
	}

}

package closeandquit_example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitandClose_methods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prateek agarwal\\workspace\\CloseandQuit\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='Seperate']/button")).click();
		Thread.sleep(1000);
		driver.close();
		driver.quit();
				
	}
	
}
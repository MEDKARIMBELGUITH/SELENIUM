package useCases;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
	// ouvrir driver
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/");
		
		//identifier les elements
		Thread.sleep(5000);
		
		WebElement login;
		WebElement password;
		WebElement bouton;
		
		
		login = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("password"));
		bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		login.sendKeys("Admin");
		password.sendKeys("admin123");
	    bouton.click();
		
		WebElement profil;
		profil= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
		String message;
		
		message = profil.getText();
		
		System.out.println(message);
		Assert assert1 = new Assert();
		assert1.equals("Paul Collings");
		
		driver.close();	
		
	}
	

}

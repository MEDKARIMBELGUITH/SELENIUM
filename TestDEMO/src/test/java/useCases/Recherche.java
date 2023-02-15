package useCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recherche {

	public static void main(String[] args) {
		
		// chemin de chrome driver
				System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
				// ouverture chrome
				
				WebDriver driver = new ChromeDriver();
	
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				//driver.get("https://www.youtube.com/");
				driver.navigate().to("https://www.google.tn/");
				
				// identification des elements
				WebElement champs;
				WebElement bouton;
				
			champs= driver.findElement(By.name("q"));
			bouton= driver.findElement(By.name("btnK"));
			
			// les actions 
		champs.sendKeys("Tunisie");
		champs.sendKeys(Keys.ENTER);
		
		// verification
		WebElement result;
		result= driver.findElement(By.id("result-stats"));
		String message;
		message= result.getText();
		
		Assert.assertTrue(message.contains("résultats"));

		System.out.println("OK");
		
		
		
			
	}
	
	

}

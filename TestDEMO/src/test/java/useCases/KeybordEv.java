package useCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeybordEv {

	private static WebElement champs2;

	public static void main(String[] args, WebDriver navigateur) {
		// chemin
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		//ouvrir driver
		WebDriver driver = new ChromeDriver();
		//implicity wait
	    navigateur.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	    driver.get("https://demoqa.com/text-box");
		
		//identifier les elements
	    WebElement champs1;
	    WebElement champs2;
	    
	   
	    champs1 = driver.findElement(By.id("currentAddress"));
	    champs2 = driver.findElement(By.id("permanentAddress"));
	    
	    champs1.sendKeys("11 rue pasteur Sousse");
	    
	    //instantiation de la classe Action
	    
	    Actions action = new Actions(driver);
	    action.keyDown(champs1, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	    action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	    action.keyDown(champs2, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	    
	    Assert.assertEquals(champs1.getText(), champs2.getText());
	    System.out.println("OK");
	    driver.close();
	    
	    
	    
	    
	    
	    
		
		
		
		
		
	}

}

package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDerou {

	public static void main(String[] args) {
		
			// chemin chrome
			
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	
		
		// ouvrir driver
				WebDriver navigateur = new ChromeDriver();
						
				navigateur.manage().deleteAllCookies();
				navigateur.manage().window().maximize();
				
				//implicity wait
				
			navigateur.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

			navigateur.navigate().to("https://demoqa.com/select-menu");
				
			//identification des elements 
			WebElement list = navigateur.findElement(By.id("oldSelectMenu"));
			// appel class select
		Select select = new Select(list);
		select.selectByValue("7");
		System.out.println("nice)");
		 
		
			
			

	}

}

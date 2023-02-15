package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class DoubleClick {

	public static void main(String[] args) {

		// chemin chrome
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		
		// ouvrir driver
		WebDriver driver = new ChromeDriver();
				
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				//implicity wait
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				
				driver.navigate().to("https://demoqa.com/buttons");
				
				//identifier les elements
				WebElement doubleClic;
				doubleClic = driver.findElement(By.id("doubleClickBtn"));
				
				// instanciation Classe action
				Actions action = new Actions (driver);
				// double click du bouton 
				action.doubleClick(doubleClic).perform();
				
				// verification
				WebElement verif;
				verif = driver.findElement(By.id("doubleclickMessage"));
				String message;
				message = verif.getText();
				
				
					
				Assert.assertEquals("You have done a double click", message);
	
				driver.close();
				
				//identification des elements 
				
				WebElement Créer;
				Créer = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
				
				WebElement Nom,Prénom,mail,mailConfirmation;
				WebElement password;
				WebElement inscription;
				
				Prénom = driver.findElement(By.name("firstname"));
				Nom = driver.findElement(By.name("lastname"));
				mail = driver.findElement(By.name("reg_email__"));
				mailConfirmation = driver.findElement(By.name("reg_email_confirmation__"));
				password = driver.findElement(By.id("password_step_input"));
				inscription = driver.findElement(By.xpath("//body/div/div/div[@role='main']/div/div/div/div/div/div/form[@method='post']/div/div/button[1]"));
				
				WebElement listj = driver.findElement(By.id("day"));
				WebElement listm = driver.findElement(By.id("month"));
				WebElement listy = driver.findElement(By.id("year"));
				
				Prénom.sendKeys("karim");
				Nom.sendKeys("belguith");
				mail.sendKeys("karim.belguith@gmail.com");
				mailConfirmation = driver.findElement(By.name("reg_email_confirmation__"));
				mailConfirmation.sendKeys("karim.belguith@gmail.com");
				password.sendKeys("Anja@2019");
				
				// appel class select 
				Select selectj = new Select(listj);
				selectj.selectByValue("22");
				Select selectm = new Select(listm);
				selectm.selectByValue("janvier");
				Select selecty = new Select(listy);
				selecty.selectByValue("1987");
				
				//bouton radio checkbox
				WebElement Radio = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
				Radio.click();
				inscription.click();

				
	}

}

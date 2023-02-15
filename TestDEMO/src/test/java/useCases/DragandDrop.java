package useCases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class DragandDrop {

	public static void main(String[] args) {
		// chemin chrome
		
	System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");	
	
	// ouvrir driver
			WebDriver navigateur = new ChromeDriver();
					
			navigateur.manage().deleteAllCookies();
			navigateur.manage().window().maximize();
			
			//implicity wait
		navigateur.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		navigateur.navigate().to("https://demoqa.com/droppable");
			
		//identification des elements 
		WebElement from;
		WebElement to;
		
	from = navigateur.findElement(By.id("draggable"));
	to = navigateur.findElement(By.id("droppable"));
	// instanciation class action
	Actions action = new Actions (navigateur);
	// drag and drop
	action.dragAndDrop(from, to).perform();
	//verification
	String message;
	message = to.getText();
	
	Assert.assertEquals("Droppbale!", message);
	System.out.println("test ok");
	
	navigateur.close();
	
	
	
		
	}

}

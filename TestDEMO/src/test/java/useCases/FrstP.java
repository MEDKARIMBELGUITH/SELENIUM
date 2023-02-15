package useCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrstP {

	public static void main(String[] args) {
		// chemin Chrome driver 
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		// ouverture Chrome
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("\"https://www.google.tn/");
		
		 String message = driver.getTitle();
		System.out.println("le titre de l'application est"+ message); 


	}

}

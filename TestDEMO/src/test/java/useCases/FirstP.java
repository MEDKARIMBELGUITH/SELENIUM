package useCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstP {
	
	static String message;

	public static void main(String[] args) {
		// chemin de chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouverture chrome
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.get("https://www.youtube.com/");
		driver.navigate().to("https://www.youtube.com/");
		
		message = driver.getTitle();
		System.out.println("LE TITRE DE L APPLICATION EST"+message);
		
		
	}

}

package useCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeCuc {

	 WebDriver driver;
	 
		@Given("ouvrir URL de l application")
		public void ouvrir_url_de_l_application() {
			System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
			
			// ouvrir driver
				
				driver = new ChromeDriver();
				
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
			
				
				
				//implicity wait
				
				
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/");
		
		}
		

		@When("saisir login")
		public void saisir_login() {
		WebElement	login = driver.findElement(By.name("username"));
		login.sendKeys("Admin");
		}

		@And("mot de passe")
		public void mot_de_passe(WebElement password) {
			password = driver.findElement(By.name("password"));
			password.sendKeys("admin123");
			
		}

		@And("click bouton se connecter")
		public void click_bouton_se_connecter(WebElement bouton) {
			bouton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			bouton.click();
			
			
		}

		@Then("page acceuil s ouvre")
		public void page_acceuil_s_ouvre() {
			WebElement profil;
			profil= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
			String message;
			
			message = profil.getText();
			
			System.out.println(message);
			Assert assert1 = new Assert();
			assert1.equals("Paul Collings");   
		}


	}



package Sprint2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreationPST {

	WebDriver browser;
	
	@Given("ouvrir browser")
	public void ouvrir_browser() {
	  System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
	  browser = new ChromeDriver();
	  browser.manage().deleteAllCookies();
	  browser.manage().window().maximize();
	  browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@And("ouvrir l url")
	public void ouvrir_l_url() {
	    browser.get ("https://www.pinterest.fr");
	    
	}

	@And("cliquer sur s inscrire")
	public void cliquer_sur_s_inscrire() {
		WebElement inscrire;
		inscrire = browser.findElement(By.xpath("//*[@id=\"fullpage-wrapper\"]/div[1]/div/div/div[1]/div/div[2]/div[3]/button/div"));
		inscrire.click();
	
	}

	@When("entrer e-mail")
	public void entrer_e_mail() {
		WebElement mail;
		mail = browser.findElement(By.xpath("//input[@placeholder='E-mail']"));
		mail.sendKeys("belguithtest@yahoo.fr");  
	    
	}

	@And("entrer mot de passe")
	public void entrer_mot_de_passe() {
		WebElement password;
		   password = browser.findElement(By.id("password"));
		   password.sendKeys("TEST@123"); 
	}

	@And("entrer age")
	public void entrer_age() {
		WebElement age;
		   age = browser.findElement(By.id("age-input"));
		   age.sendKeys("35");
	}

	@And("cliquer sur continuer")
	public void cliquer_sur_continuer() {
	   WebElement continuer;
	   continuer = browser.findElement(By.xpath("1"));
	   continuer.click();
	}

	@And("cliquer sur suivant")
	public void cliquer_sur_suivant() {
		WebElement suivant;
		   suivant = browser.findElement(By.xpath("1"));
		   suivant.click();
	}

	@And("entrer genre")
	public void entrer_genre() {
		WebElement genre;
		   genre = browser.findElement(By.id("male"));
		   genre.click();
		   
	}

	@And("entrer langue")
	public void entrer_langue() {
	    WebElement langue;
	    langue = browser.findElement(null)
	}

	@And("entrer Pays")
	public void entrer_pays() {
	    
	}

	@And("selectionner theme")
	public void selectionner_theme() {
	    
	}

	@And("cliquer sur termine")
	public void cliquer_sur_termine() {
	    
	}

	@Then("compte PST cree")
	public void compte_pst_cree() {
	    
	}

}

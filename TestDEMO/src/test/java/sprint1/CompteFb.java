package sprint1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CompteFb {
	WebDriver driver1;
	private String message;
	
	@Given("ouvrir navigateur")
	public void ouvrir_navigateur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.manage().deleteAllCookies();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}

	@And("ouvrir url")
	public void ouvrir_url() {
		driver1.get("https://fr-fr.facebook.com/login.php/");
	    
	}

	@And("cliquer sur creer compte")
	public void cliquer_sur_creer_compte() {
		WebElement Creer;
		Creer = driver1.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		Creer.click();
	   
	}

	@When("entrer nom")
	public void entrer_nom() {
		WebElement nom;
		nom = driver1.findElement(By.name("lastname"));  
		nom.sendKeys("belguith");
	}

	@And("entrer prenom")
	public void entrer_prenom() {
	    WebElement prenom;
	    prenom = driver1.findElement(By.name("firstname"));
	    prenom.sendKeys("karim");
	}

	@And("entrer mail")
	public void entrer_mail() {
	    WebElement mail;
	mail = driver1.findElement(By.name("reg_email__"));
	mail.sendKeys("karim.belguith@gmail.com");    
	}

	@And("entrer mail de confirmation")
	public void entrer_mail_de_confirmation() {
	    WebElement mailConfirmation;
	    mailConfirmation = driver1.findElement(By.name("reg_email_confirmation__"));
	    mailConfirmation.sendKeys("karim.belguith@gmail.com");
	}

	@And("entrer password")
	public void entrer_password() {
	   WebElement password;
	   password = driver1.findElement(By.id("password_step_input"));
	   password.sendKeys("Anja@2019");
	   
	}

	@And("date de naissance")
	public void date_de_naissance() {
		WebElement listj = driver1.findElement(By.id("day"));
		WebElement listm = driver1.findElement(By.id("month"));
		WebElement listy = driver1.findElement(By.id("year"));
		
		Select selectj = new Select(listj);
		selectj.selectByValue("22");
		Select selectm = new Select(listm);
		selectm.selectByValue("1");
		Select selecty = new Select(listy);
		selecty.selectByValue("1987");
	}

	@And("selectionner genre")
	public void selectionner_genre() {
		WebElement Radio = driver1.findElement(By.xpath("//label[normalize-space()='Homme']"));
		Radio.click();
	    
	}

	@And("cliquer sur inscription")
	public void cliquer_sur_inscription() { 
		
		WebElement inscription = driver1.findElement(By.xpath("//body/div/div/div[@role='main']/div/div/div/div/div/div/form[@method='post']/div/div/button[1]"));
		
		inscription.click();
	    
	}

	@Then("compte FB cree")
	public void compte_fb_cree() { 
		
		Assert.assertEquals("entrer le code de votre mail", message);
		System.out.println("inscription validee");
		
		
	}
}

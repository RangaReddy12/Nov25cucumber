package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination1 {
WebDriver driver;
String url="http://orangehrm.qedgetech.com/";
@Given("^i launch url in \"([^\"]*)\"$")
public void i_launch_url_in(String brw) throws Throwable {
   if(brw.equalsIgnoreCase("chrome")) 
   {
	   driver= new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	      }
   else if(brw.equalsIgnoreCase("firefox"))
   {
	   driver= new FirefoxDriver();
	   driver.get(url);
   }
   else
   {
	   System.out.println("Browser value is not matching");
   }
}

@When("^i enter \"([^\"]*)\" in username textbox$")
public void i_enter_in_username_textbox(String username) throws Throwable {
  driver.findElement(By.name("txtUsername")).sendKeys(username);  
}

@When("^i enter \"([^\"]*)\" in password textbox$")
public void i_enter_in_password_textbox(String password) throws Throwable {
	driver.findElement(By.name("txtPassword")).sendKeys(password);
}

@When("^i click login button$")
public void i_click_login_button() throws Throwable {
	driver.findElement(By.name("Submit")).click();
}

@Then("^i verify url$")
public void i_verify_url() throws Throwable {
	if(driver.getCurrentUrl().contains("dashboard"))
    {
    	System.out.println("Login success");
    }
    else
    {
    	System.out.println("Login Fail");
    }
}

@Then("^i close browser$")
public void i_close_browser() throws Throwable {
    driver.close();
}

}

package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinations {
WebDriver driver;
@Given("^user launches browser$")
public void user_launches_browser() throws Throwable {
    driver = new ChromeDriver();
    driver.get("http://orangehrm.qedgetech.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

@When("^user enter username and password$")
public void user_enter_username_and_password() throws Throwable {
    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
    driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
}

@When("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
	   driver.findElement(By.name("Submit")).click();
}

@Then("^user verify url$")
public void user_verify_url() throws Throwable {
    if(driver.getCurrentUrl().contains("dashboard"))
    {
    	System.out.println("Login success");
    }
    else
    {
    	System.out.println("Login Fail");
    }
}

@Then("^user close browser$")
public void user_close_browser() throws Throwable {
   driver.close();
}

}

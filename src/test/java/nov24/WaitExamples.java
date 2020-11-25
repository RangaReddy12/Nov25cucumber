package nov24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitExamples {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("http://ecommerce.qedgetech.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div[2]/div[2]/button/span")).click();
WebDriverWait wait= new WebDriverWait(driver, 200);
//wait until username textbox is visible
wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
driver.findElement(By.name("login")).sendKeys("test@gmail.com");
//wait until password textbox is visible
wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
driver.findElement(By.name("password")).sendKeys("test@gmail.com");
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[8]/div[2]/div/div/form/table/tbody/tr[3]/td/button")));
driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/form/table/tbody/tr[3]/td/button")).click();
	}

}

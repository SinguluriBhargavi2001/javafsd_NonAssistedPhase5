import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	@Test
	public void login() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("manikantasinguluri96@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mani4522");
		WebElement login=driver.findElement(By.name("login_source"));
		login.submit();
		//driver.findElement(By.name("login-source")).submit();
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Intel\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
		driver=null;
	}
	
	
}
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	public static void main(String[]args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","/home/jose/Escritorio/jose/eclipse/gecko/geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).click();
		WebDriverWait wait = new WebDriverWait(driver, 500);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@name='xhpc_message']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='xhpc_message']")));
		WebElement text_box_post = driver.findElement(By.xpath("//textarea[@name='xhpc_message']"));
		
		text_box_post.sendKeys("Selenium Automation Test");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-testid='react-composer-post-button']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='react-composer-post-button']")));
		
		
		WebElement post_button = driver.findElement(By.xpath("//button[@data-testid='react-composer-post-button']"));
		
		post_button.click();

//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@contenteditable='true']")));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@contenteditable='true']")));
//		driver.findElement(By.xpath("//div[@contenteditable='true']")).sendKeys("Selenium Test");

	}
}

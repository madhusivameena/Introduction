import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","C:\\data\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("gb_70")).click();
		driver.findElement(By.name("identifier")).sendKeys("madhusivameena@gmail.com");
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		driver.quit();
		

	}

}

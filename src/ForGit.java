import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForGit {
WebDriver driver;

@BeforeTest
 public void setUp() {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\saifu\\Desktop\\selenium\\browser\\chromedriver\\chromedriver.exe");
 ChromeOptions options = new ChromeOptions();
 options.addArguments("disable-infobars");
 driver = new ChromeDriver(options);
// driver.manage().window().maximize();
 }
 @Test
 public void Test() {

 driver.get("https://www.google.com");
	
	

}
}
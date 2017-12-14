
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class BankAcc {
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
	
	 driver.get("https://stage-go.wepay.com/getting-started");
	 JavascriptExecutor js =(JavascriptExecutor)driver;
	 js.executeScript("scroll(0,350)");
	 driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("kamal");
	 driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("hossain");
	 driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("rabeya55@hotmail.com");
	 driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("royal Inc");
	 driver.findElement(By.xpath("//*[@id=\"Phone\"]")).sendKeys("4046777505");
	 Select dropdown2 = new Select(driver.findElement(By.xpath("//*[@id=\"State\"]")));
	 dropdown2.selectByVisibleText("GA");
	 Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"Country\"]")));
	 dropdown.selectByVisibleText("United States");
	 Select dropdown1 = new Select (driver.findElement(By.xpath("//*[@id=\"Number_of_Platform_Users__c\"]")));
	 dropdown1.selectByIndex(1);
	 driver.findElement(By.xpath("//*[@id=\"Referrer_Description__c\"]")).sendKeys("I am banker");
	 driver.findElement(By.xpath("//*[@id=\"mktoForm_1234\"]/div[15]/span/button")).click();
	 driver.get("https://go.wepay.com/thank-you");
	 driver.findElement(By.xpath("//*[@id=\"75\"]/div/div[1]/div/a")).click();
	 //This is comment
	 
		
	


}
}

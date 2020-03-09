package DataDrivenFramWork;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class ApplicationLgin {

 @Test(dataProvider="ApplicationLogin")

	public void loginpage(String username,String password)
	{
	 System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium dumps\\chromedriver_win32-1n\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
	 driver.findElement(By.id("email")).sendKeys(username);
	 driver.findElement(By.id("pass")).sendKeys(password);
	 driver.findElement(By.id("loginbutton")).click();
	
	}
 
 @DataProvider(name="ApplicationLogin")
 
 public Object[][] passData()
 
 {
	 Object[][] data=new Object[3][2];
	
	 data[0][0]="swathisn588@gmail.com";
	 data[0][1]="gopalrao";
	 data[1][0]="admin1";
	 data[1][1]="password1";
	 data[2][0]="admin2";
	 data[2][1]="password2";
	 return data;
 }
 }



package com.loginPOM3BaseLayer;
//URL:-https://www.youtube.com/watch?v=LxJzeiTQGoE&list=PLFGoYjJG_fqq6cHeqfsDes3pdVh3kpl74&index=2
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.loginPOM6UtilLayer.Utilprop;

public class TestBase {
	public static WebDriver driver;//make it as public because we can use them in child classes also
	public static Properties prop;//make it as public because we can use them in child classes also

	public TestBase() 
	{
		
		prop=new Properties(); //here iam initializing the prop variable
		try {
			FileInputStream ip=new FileInputStream("D:\\selenium\\selenium dumps\\Workspace\\MavanPro\\src\\main\\java\\com\\loginPOM4ConfigLayer\\confige.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

public static void initilization()//created initialization method

{
	
String browserName=prop.getProperty("browser");//read the property of the browser 

if(browserName.equals("chrome"))
	
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\selenium dumps\\chromedriver_win32-1n\\chromedriver.exe");
	 driver =new ChromeDriver();// launch browser //here we are initializing the global variable driver


}/*else if(browserName.equals("internetexplorer"))
	
{
	System.setProperty("webdriver.ie.driver","D:\\selenium\\selenium dumps\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
	 driver =new InternetExplorer();// launch browser //here we are initializing the global variable driver


}else if(browserName.equals("Firefox"))
	
{
	System.setProperty("webdriver.gicko.driver","D:\\selenium\\selenium dumps\\gicko\\gicko.exe");
	 driver =new FireFox();// launch browser //here we are initializing the global variable driver


}*/
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(Utilprop.Page_Load_Timeout, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Utilprop.Implicitly_Wait, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));



}}


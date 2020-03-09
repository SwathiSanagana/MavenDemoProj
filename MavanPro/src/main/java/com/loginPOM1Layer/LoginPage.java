package com.loginPOM1Layer;
//URL:-https://www.youtube.com/watch?v=LxJzeiTQGoE&list=PLFGoYjJG_fqq6cHeqfsDes3pdVh3kpl74&index=2
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.loginPOM3BaseLayer.TestBase;

public class LoginPage extends TestBase{
	
	//pagefactory or object reporsitery
@FindBy(name="email") //Insted of writing Driver.findElement(By.name="username")
WebElement username;//Page elements
@FindBy(name="pass")
WebElement password;

@FindBy(xpath="//input[@type='submit']") 
WebElement LogiButn;//syntaxfor customized xpath"=//targetname[@attribute=value]

//For SignUp
@FindBy(xpath="//button[contains(text(),'Sign Up']")
WebElement SignUpButn;
@FindBy(xpath="//img[contains(class,'fb_logo img sp_ZgriaaiF44o sx_da979b']")
WebElement Image;
//How to initialize the page factory of the web element

//Create the constructor of the class
public LoginPage()
{
	
	PageFactory.initElements(driver, this);//PageFactory.initElements is a method to initialize the PageFactory
	 //this represent the current class object we can also use Loginpage.class
	//driver is coming from TestBase
	
}
//Now define different action which are avalable in login page
//basic functioality
//validate login page title


public String validateLoginPageTitle()

{
	
	return driver.getTitle();//here we are returing the title so the method should be string
}

public boolean ValidateImage()
{
	return Image.isDisplayed();
}

public HomePage login(String un, String pwd)
{
	username.sendKeys(un);
	password.sendKeys(pwd);
	LogiButn.click();//once we login it shouls return home page 

    return new HomePage();
}
}







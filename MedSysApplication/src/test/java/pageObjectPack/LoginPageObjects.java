package pageObjectPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseObjectClassPack.BaseObjectClass;

public class LoginPageObjects extends BaseObjectClass{
	
	public LoginPageObjects(WebDriver d)
	{
		super(d);
	}

	@FindBy(xpath="//input[@name='username']") public WebElement usernameTxt;
	@FindBy(xpath="//input[@name='password']") public WebElement passwordTxt;
	@FindBy(xpath="//button[@type='submit']") public WebElement signInButton;
	
	
}

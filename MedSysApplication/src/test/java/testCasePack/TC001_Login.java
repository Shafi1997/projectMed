package testCasePack;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClassPack.BaseClass;
import pageObjectPack.HomePageObjects;
import pageObjectPack.LoginPageObjects;

public class TC001_Login extends BaseClass{

	LoginPageObjects lpo;
	HomePageObjects hpo;
	@Test
	public void loginWithValidData()
	{
		lpo=new LoginPageObjects(d);
		hpo=new HomePageObjects(d);
		lpo.usernameTxt.sendKeys("shahajadalam@gmail.com");
		lpo.passwordTxt.sendKeys("w3s@1234");
		lpo.signInButton.click();
		hpo.profileIconHomepage.click();
		Assert.assertTrue(hpo.profilePopuplogoutBtn.isDisplayed());
	}
}

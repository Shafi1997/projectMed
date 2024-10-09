package pageObjectPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseObjectClassPack.BaseObjectClass;

public class HomePageObjects extends BaseObjectClass{

	public HomePageObjects(WebDriver d) {
		super(d);
	}

	@FindBy(className="topuser-image") public WebElement profileIconHomepage;
	@FindBy(xpath="//div[@class='sstopuser-test']/h4") public WebElement profilePopupTxt;
	@FindBy(xpath="//div[@class='sstopuser-test']/h5") public WebElement profilePopupTxt1;
	@FindBy(xpath="//a[@class='pl25']") public WebElement profilePopupPasswordBtn; ////a[@class='pl25' and text()='Password']
	@FindBy(xpath="//a[@class='pull-right' and text()='Logout']") public WebElement profilePopuplogoutBtn;




}

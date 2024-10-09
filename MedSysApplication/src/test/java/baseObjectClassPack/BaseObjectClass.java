package baseObjectClassPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseObjectClass {

	public static WebDriver d;
	public BaseObjectClass(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
}

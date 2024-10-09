package baseClassPack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.io.Files;

public class BaseClass {

	public static WebDriver d;
	@BeforeClass
	public void launchBrowser()
	{
		d=new ChromeDriver();
		d.get("https://healthcare.w3testing.com/site/login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
	}
	@AfterClass
	public void closeBrowser()
	{
		d.quit();
	}
	
	public String captureScreenshot() throws IOException
	{
		
		String timestamp=new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
		TakesScreenshot ts=(TakesScreenshot)d;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Screenshots\\"+timestamp+".png";
		Files.copy(source, new File(destination));
		return destination;
		
	}
}

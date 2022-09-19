package appiumtests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class merchantApp_testNG {

	static AppiumDriver<MobileElement> driver ;
	
	
	@BeforeTest
	public void merchantAppDirectOrder() throws Exception{
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Mi A2");
		cap.setCapability("udid", "4695538");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("automationName", "Appium");
		cap.setCapability("appPackage", "com.eatme_restaurant.qa");
		cap.setCapability("appActivity", "com.eatme_restaurant.MainActivity");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, cap);		
	
	
	}
	@Test(priority=1)
	public void email() {
		//Insert email
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText\r\n"
				+ "").click();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText\r\n"
				+ "").sendKeys("qa+202020@eatmeglobal.com");			
		
		
	}
	@Test(priority=2)
	public void clickNextEmail() {
		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView").click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;		
		
		
		
		
	}
	
	@Test(priority=3)
	public void enterPassword() {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;		
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText").sendKeys("123456");
	
		
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView").click();
		//driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView").click();
	}
	
	@Test(priority=4)
	public void failTest1() {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;		
		Assert.assertEquals("123", "1234");
		
		
	}
	
	
	@Test(priority=6)
	public void failTest5() {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;		
		Assert.assertEquals("1234", "1234");
		
		
	}
	
	
	
	
	
	
	@Test(priority=5)
	public void failTest2() {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;		
		Assert.assertEquals("1234", "12345");
		
		
	}
	
	@Test(priority=6)
	public void failTest3() {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;		
		Assert.assertEquals("1234aa", "12345");
		
		
	}
	
	
	
	@Test(priority=7)
	public void passTest1() {
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;		
		Assert.assertEquals("12345", "12345");
		
		
	}
	
	
	
	@AfterTest
	public void teardownTest() {
		
		
		//driver.close();
		//driver.quit();
		System.out.println("TestNG is okay");
		System.out.println("my 2nd commit heree....");
		System.out.println("my 2nd commit heree....");
		System.out.println("my latest commit heree....");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

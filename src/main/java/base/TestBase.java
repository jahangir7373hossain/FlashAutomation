package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.DirectTvPolicyPage;

public class TestBase extends Driver{
	
	public static DirectTvPolicyPage directTvPolicyPage;
	
	@BeforeMethod
	public void setup() {	
		setDriver();
		directTvPolicyPage = PageFactory.initElements(driver, DirectTvPolicyPage.class);
	
	}
	
	@AfterMethod
	public void tearDowon() {
		driver.quit();
	}

	

}

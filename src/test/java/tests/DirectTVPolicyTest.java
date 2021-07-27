package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import utils.TestUtils;

public class DirectTVPolicyTest extends TestBase{
	
	TestUtils ts = new TestUtils();

	@Test
	public void testingUrl () {
		
		String [] actual = TestUtils.getProperty("name").split(" ");
		String [] expected = directTvPolicyPage.PolicyPageElement.getText().split(" ");
		
		for(int i = 0; i < actual.length; i++) {
			
			Assert.assertEquals(actual, expected);
		}
		
	}
	
	public void gitTest() {
		// this is a testing method for git
		//this line two
		
		
	}
}

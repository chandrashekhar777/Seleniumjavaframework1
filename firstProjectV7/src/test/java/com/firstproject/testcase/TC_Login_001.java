package com.firstproject.testcase;

import org.testng.annotations.Test;
import com.firstproject.objectpage.LoginPage;
import junit.framework.Assert;

public class TC_Login_001 extends BaseClass
{
   @Test
   public void loginTest()
   {
	   
	   driver.get(baseUrl);
	   LoginPage lp=new LoginPage(driver);
	   lp.setUserName(username);
	   lp.setPassword(password);
	   lp.clickLogin();
	   
	   if(driver.getTitle().equals("facebook"))
	   {
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.assertTrue(false);
	   }
	   
	   
   }
}

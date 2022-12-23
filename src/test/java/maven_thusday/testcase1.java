package maven_thusday;

import java.io.IOException;

import org.testng.annotations.Test;

import POMPages.LoginPage;
import generic_library.BaseClass;

public class testcase1 extends BaseClass {
	@Test
	public void tc1() throws IOException, InterruptedException {
		LoginPage lg=new LoginPage(driver);
		lg.usernamemethod(pdata.getpropertyfile("user1"));
		lg.passmethod(pdata.getpropertyfile("pass1"));
		lg.loginbutton();
		
		Thread.sleep(3000);
		
		lg.searchboxmethod(pdata.getpropertyfile("searchname"));
		lg.searchbuttnmethod();
		
	}

}

package com.hrms.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Reporter;


import org.testng.annotations.Test;
import com.hrms.lib.ReusableFnctionallity_General;


public class Tc_001 {

	
	@Test
	public void Startup()  throws Exception{
	
		DOMConfigurator.configure("log4j.xml");
		ReusableFnctionallity_General obj = new ReusableFnctionallity_General();
		
		obj.openbrowser();
		obj.Title();
		
		obj.Login();
		Reporter.log("Login Sucessful");
		
		obj.Logout();
		Reporter.log("Logout Sucessful");
		
		obj.closebrowser();
		
	}
	
	
	
	
}

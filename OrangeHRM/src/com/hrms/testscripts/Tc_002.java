package com.hrms.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.hrms.lib.ReusableFnctionallity_General;

public class Tc_002 {
	ReusableFnctionallity_General obj = new ReusableFnctionallity_General();
	@Test
	public void addemployee() throws Exception {
		
		obj.openbrowser();
		
		obj.Title();
		
		obj.Login();
		Reporter.log("Login Sucessful");
		
		obj.pimmenu();
		
		Thread.sleep(3000);
		
		obj.Logout();
		Reporter.log("Logout Sucessful");
		
		obj.closebrowser();
		
		
		
		
	}
	
	
	
	
	
	
	
	
}

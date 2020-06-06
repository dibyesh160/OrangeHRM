package com.hrms.lib;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class ReusableFnctionallity_General extends TestData_Global {

        
		public void openbrowser()  {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		     Log.info("Browser open");
		}	
		public void Title() {
			
			driver.navigate().to(url);
			System.out.println(driver.getTitle());
			Log.info("Got Title");
			Reporter.log("got title");
		
		}
		
		public  void Login() throws Exception{
			driver.findElement(By.name(loginname_text)).sendKeys(un);
			driver.findElement(By.name(password_text)).sendKeys(pw);
			driver.findElement(By.name(login_button)).click();
			Log.info("Login Sucessfull");
		   
			Thread.sleep(3000);
		}
			public void Logout() throws Exception {
			driver.findElement(By.className(welcome_link)).click();
			Thread.sleep(3000);
			driver.findElement(By.linkText(logout_button)).click();
		     Log.info("logout sucessful");
			
		}
			
		public void closebrowser() {
			driver.close();
		  Log.info("close browser");
		}

		public void pimmenu() throws Exception {
			
			WebElement pimmenu =driver.findElement(By.linkText(pimmenu_link));
			
			Actions at = new Actions(driver);
			at.moveToElement(pimmenu).perform();
			
			driver.findElement(By.id(addemployee_id)).click();
			driver.findElement(By.name(firstname_text)).sendKeys(Firstname);
			driver.findElement(By.name(lastname_text)).sendKeys(Lastname);
			driver.findElement(By.name(Photo_text)).sendKeys(photo);
			driver.findElement(By.id(save_button)).click();
			
			Log.info("new empolyee add");
			
			Thread.sleep(3000);
			
			driver.navigate().back();
			
			
			
			
			
			
			
		}
		
		
		
	}



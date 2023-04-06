package com.hrms.lib;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;
public class General extends Global{
	public void openApplication(){
		System.setProperty("Webdrive.gecko.driver", "C:\\Users\\jadan\\OneDrive\\Documents\\driversselenium\\geckodriver-v0.32.2-win64");
		driver= new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Log.info("Application opened");
	}
 public  void loginApplication()  throws Exception{
	 driver.findElement(By.name(text_Username)).sendKeys(usname);
	 Thread.sleep(1000);
	 driver.findElement(By.name(text_Password)).sendKeys(password);
	 Thread.sleep(1000);
	 driver.findElement(By.name(login)).click();
	 Thread.sleep(1000);
	 Log.info("Application Logined");
 }
 public void switchToFrame() throws Exception{ 
	 Log.info("Switched to Frame");
	 
	 driver.switchTo().frame(ramename);
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(addbutton)).click();
	 Thread.sleep(1000);
	 driver.findElement(By.name(Emplastname)).sendKeys(Lastname);
	 Thread.sleep(1000);
	 driver.findElement(By.name(Empfirstname)).sendKeys(Firstname);
	 Thread.sleep(1000);
	 driver.findElement(By.id(savebutton)).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath(backbutton)).click();
	 System.out.println("Back Button  clicked completed");
	
	 driver.switchTo().defaultContent();
	 
	 Log.info("comesout out  to Frame");
	
	 
	 Thread.sleep(1000);
	 driver.switchTo().defaultContent();
	 Thread.sleep(1000); 
	 
 }

	



 

 public void logoutApplication()  throws Exception {
	
	 
	 driver.findElement(By.linkText(linktext)).click();
	 Thread.sleep(1000); 
	 Log.info("Logout of Application done");
 }
 public void closeApplication()throws Exception {
	
	 Thread.sleep(1000);
	 driver.close();
	 Log.info("close of Application done");
 }
 

}

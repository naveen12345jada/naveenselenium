package com.hrms.testscripts;
import com.hrms.lib.*;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
public class Tc_001 {

	//public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	General c= new General();
	
		@BeforeClass
		public void tc001()throws Exception{
			
		c.openApplication();
		}
		@Test(priority=1)
		public void tc002()throws Exception{
		c.loginApplication();
		}
	 @Test(priority=2)

		public void tc003()throws Exception{
		 DOMConfigurator.configure("log4j.xml");
		c.switchToFrame();
		}
		@Test(priority=3)
		public void tc004()throws Exception{
		c.logoutApplication();
		}
		@AfterClass
		public void tc005()throws Exception{
		c.closeApplication();
		}

	}



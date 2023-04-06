package com.hrms.testscripts;


import com.hrms.lib.*;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class Tc_002 {
	
	

		
		General c= new General();
			@Test(priority=1)
			public void tc001()throws Exception{
				DOMConfigurator.configure("log4j.xml");
			c.openApplication();
			Thread.sleep(3000);
			}
			@Test(priority=2)
			public void tc002()throws Exception{
				DOMConfigurator.configure("log4j.xml");
			c.closeApplication();
			Thread.sleep(3000);
			}
	
		}





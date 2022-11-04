package com.mycompany.tests;

import org.testng.annotations.Test;




public class CallTests extends TestBase{
	

	
	 @Test (priority=1)
	  public void hepsiburadaTest01() throws InterruptedException{ 
		    extentTest = extent.startTest("Login validation"); //test result screenshot almasi icin
			homePage.clickMyAccount()
			.hepsiburada01()
			;			
			
	  }

		
		

	 @Test (priority=2)
	  public void hepsiburadaTest02() throws InterruptedException{ 
		    extentTest = extent.startTest("Login validation"); //test result screenshot almasi icin
			homePage.clickMyAccount()
			.hepsiburada02()
			;			
			
	  }

		
	 
	 
  }
 
 
  


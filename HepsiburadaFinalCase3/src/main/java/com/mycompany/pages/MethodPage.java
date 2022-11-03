package com.mycompany.pages;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class MethodPage extends PageBase {

	
	public MethodPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	public MethodPage loginAs() throws InterruptedException{
		
		
		js.highlight(userName, driver); js.drawBorder(userName, driver);
		userName.sendKeys("testuser1"); Thread.sleep(2000);
		js.highlight(passWord, driver); js.drawBorder(passWord, driver); Thread.sleep(2000); 
		passWord.sendKeys("SeleniumTestAccount1"); 		
		js.highlight(rememberMe, driver); js.drawBorder(rememberMe, driver);
		rememberMe.click(); Thread.sleep(2000);
		js.highlight(loginButton, driver); js.drawBorder(loginButton, driver);
		loginButton.click(); Thread.sleep(2000);		
		
		return new MethodPage(driver);
		
	}
					
		
	public MethodPage loginYou() throws InterruptedException{
		
		userName.sendKeys("testuser1"); Thread.sleep(2000);
		passWord.sendKeys("SeleniumTestAccount1"); Thread.sleep(2000);
		rememberMe.click(); Thread.sleep(2000);
		loginButton.click(); Thread.sleep(2000);
		
		
		return new MethodPage(driver);
		
	}
	

	public MethodPage hepsiburada01() throws InterruptedException{
		
		
		js.highlight(cerezler, driver); js.drawBorder(cerezler, driver);
		cerezler.click(); Thread.sleep(1000);
		giris1.click();
		js.drawBorder(giris2, driver);
		giris2.click(); Thread.sleep(1000);
		
		faceGiris.click(); Thread.sleep(1000);
		
		faceMail.sendKeys("mail_giriniz");
		
		faceSifre.sendKeys("şifre-giriniz");
		js.drawBorder(faceSifre, driver);
		faceSifre.sendKeys(Keys.ENTER); Thread.sleep(1000);
		
		//Assert.assertTrue(logoElementi.isDisplayed());
		Assert.assertTrue(logoElementi.isDisplayed());
		
		urunArama.sendKeys("çorap");
		urunArama.sendKeys(Keys.ENTER); Thread.sleep(1000);
		
		js.scrollIntoView(corap, driver); js.drawBorder(corap, driver);
		//js.clickElementByJS(corap, driver); 
		System.out.println("sayfa başligi: " + js.getTitleByJS(driver)); 
		corap.click(); Thread.sleep(1000);
		
		
		String parentWindow= driver.getWindowHandle();
		
		Set<String> allWindows= driver.getWindowHandles();
		
			for(String curWindow: allWindows) {
				driver.switchTo().window(curWindow);
			}
			
		sepetEkle.click(); js.drawBorder(sepetEkle, driver); Thread.sleep(1000);
		js.scrollIntoView(sepetEkle, driver); Thread.sleep(1000);
		//sepetEkle.getSize(); sepetEkle.getTagName(); sepetEkle.getText();
		
		ikinciUrun.click(); js.drawBorder(ikinciUrun, driver); Thread.sleep(1000);
		
		js.scrollIntoView(sayfaBasi, driver); js.drawBorder(sayfaBasi, driver);Thread.sleep(1000);
		
		js.refreshBrowserByJS(driver); Thread.sleep(2000);
		
		sepetim.click(); Thread.sleep(1000);
		
		Assert.assertTrue(urun1.isDisplayed()); js.drawBorder(urun1, driver);
		Assert.assertTrue(urun2.isDisplayed()); js.drawBorder(urun2, driver);
		
		
		
		
		//Assertions.isTrueArgument(getTitle(), true);
		
				
		return new MethodPage(driver);
		
	}
					
					
	
 	}
	

	
	
	
	
	


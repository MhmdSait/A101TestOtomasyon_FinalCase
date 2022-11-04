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
	
	
	public MethodPage hepsiburada01() throws InterruptedException{
		
		
		js.highlight(cerezler, driver); js.drawBorder(cerezler, driver);
		cerezler.click(); Thread.sleep(1000);
		giris1.click();
		js.drawBorder(giris2, driver);
		giris2.click(); Thread.sleep(1000);
		faceGiris.click(); Thread.sleep(1000);
		faceMail.sendKeys("mailgiriniz");
		faceSifre.sendKeys("şifre");
		js.drawBorder(faceSifre, driver);
		faceSifre.sendKeys(Keys.ENTER); Thread.sleep(1000);
		
		Assert.assertTrue(logoElementi.isDisplayed());
		Assert.assertTrue(üyeAdi.isDisplayed()); js.drawBorder(üyeAdi, driver);
		
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
					
		
	
	public MethodPage hepsiburada02() throws InterruptedException{
		
		js.highlight(cerezler, driver); js.drawBorder(cerezler, driver);
		cerezler.click(); Thread.sleep(1000);
		urunArama.sendKeys("yün çorap");
		urunArama.sendKeys(Keys.ENTER); Thread.sleep(1000);
		
		js.scrollIntoView(yunCorap, driver); js.drawBorder(yunCorap, driver);
		System.out.println("sayfa başligi: " + js.getTitleByJS(driver));
		yunCorap.click(); Thread.sleep(1000);
		
		String parentWindow= driver.getWindowHandle();
		
		Set<String> allWindows= driver.getWindowHandles();
		
			for(String curWindow: allWindows) {
				driver.switchTo().window(curWindow);
			}
		sepetEkle.click(); js.drawBorder(sepetEkle, driver); Thread.sleep(1000);
		js.scrollIntoView(sepetEkle, driver); Thread.sleep(1000);	
			
		ikinciUrun.click(); js.drawBorder(ikinciUrun, driver); Thread.sleep(1000);
		
		js.scrollIntoView(sayfaBasi, driver); js.drawBorder(sayfaBasi, driver);Thread.sleep(1000);
		js.refreshBrowserByJS(driver); Thread.sleep(2000);
		
		sepetim.click(); Thread.sleep(1000);
		
		Assert.assertTrue(satici1.isDisplayed()); js.drawBorder(satici1, driver);
		Assert.assertTrue(satici2.isDisplayed()); js.drawBorder(satici2, driver);
		
		return new MethodPage(driver);
		
	}
	
	
 	}
	

	

package com.mycompany.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.util.JSEHelper;

public class PageBase {	
	
	protected WebDriver driver;
	JSEHelper js = new JSEHelper();
	
	
	public PageBase(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	
//	PAGE FACTORY ===================       lOGIN LOCATORS	
			
// =============================Hepsiburada========================================================================	
		
		@FindBy(id="onetrust-accept-btn-handler")
		WebElement cerezler;
		
		@FindBy(xpath="//span[@title='Giriş Yap']")
		WebElement giris1;
		
		@FindBy(id="login")
		WebElement giris2; 
		
		@FindBy(xpath="//button[@id='btnFacebook']//div[2]")
		WebElement faceGiris;
		
		@FindBy(xpath="//input[@id='email']")
		WebElement faceMail;
		
		@FindBy(id="pass")
		WebElement faceSifre;
		
		//Assert.assertTrue(true, "üye girişi yapildi");
		@FindBy(xpath="//a[@title='Hepsiburada']//*[name()='svg']")
		WebElement logoElementi;
		
		//span[@class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR'][1]
		@FindBy(xpath="//a[@title='Hepsiburada']//*[name()='svg']")
		WebElement üyeAdi;
		
		@FindBy(xpath="//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b'][1]")
		WebElement urunArama;
		
		@FindBy(xpath="//div[@class='moria-ProductCard-eSkbaN kLjMqB sy36zj3qzyr'][1]")
		WebElement urunBul;
		
		@FindBy(xpath="//h3[contains(text(),'Pierre Cardin 12 Çift Karışık Pamuk Soket Erkek Ço')]")
		WebElement corap;
		
		@FindBy(id="addToCart")
		WebElement sepetEkle;
		
		@FindBy(xpath="//button[@class='add-to-basket button small']")
		WebElement ikinciUrun;
		
		@FindBy(xpath="//div[@class='sf-OldMyAccount-ggPMlRFTcwMlAMeDSFfk'][1]")
		WebElement sayfaBasi;	//
		
		@FindBy(xpath="//span[@id='shoppingCart']")
		WebElement sepetim;
		
		@FindBy(xpath = "//a[normalize-space()='abani classic']")
		WebElement urun1;
		
		@FindBy(xpath = "//a[contains(text(),'beşiroğlu since 1980')]")
		WebElement urun2;
		
// =============================Hepsiburada2========================================================================	
		
		@FindBy(xpath="//h3[@type='cozy'][contains(text(),'Diba 6 Adet Lambswool Yün Kışlık Kadın Soket Çorap')][1]")
		WebElement yunCorap;
	
		@FindBy(xpath = "//a[contains(text(),'arslan çorap çamaşır')]")
		WebElement satici1;
		@FindBy(xpath = "//a[normalize-space()='gnc shop']")
		WebElement satici2;
}

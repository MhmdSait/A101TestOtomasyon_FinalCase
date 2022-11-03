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
		
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(css="label[class*=woocommerce-form] input[name=rememberme]")
	WebElement rememberMe;
	
	@FindBy(css="input[name=login]")
	WebElement loginButton;
	
//  findElements icin kullanilir:
	@FindBy(css="input[name=login]")
	List<WebElement> loginNames;

	@FindBy(linkText = "MY ACCOUNT")
	WebElement myAccount;
	
	
	@FindBy(linkText = "WEBTABLE")
	WebElement webTable;
	
	@FindBy(linkText = "CHECKOUT")
	WebElement checkOut;
	
	
	
// ==========================================================================================================	
	
		//Home Menu
		@FindBy(xpath="//*[@id='primary-header-home']")  //a[contains(text(),'My account')]
		WebElement homeButton;
		
		//Flight Button
		@FindBy(xpath="//*[@id='tab-flight-tab-hp']")
		WebElement flightButton;
		
		
		//OneWay Button
		@FindBy(xpath="//*[@id='flight-type-one-way-label-hp-flight']")
		WebElement oneWayButton;
		
		//OriginCity Button
		@FindBy(xpath="//*[@id='flight-origin-hp-flight']")
		WebElement originCity;
		
						
		@FindBy(xpath="//*[@id='typeaheadDataPlain']/div/li")
		List<WebElement> originList;
		
		
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
		
		//@FindBy(id="email")
		//WebElement faceMail;
		
		@FindBy(id="pass")
		WebElement faceSifre;
		
		//Assert.assertTrue(true, "üye girişi yapildi");
		@FindBy(xpath="//a[@title='Hepsiburada']//*[name()='svg']")
		WebElement logoElementi;
		
		
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
	
	
}

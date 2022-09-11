package egitimKurulumDersi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "Util\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://hiztesti.turktelekom.com.tr/");
		//driver.get("http://test1.itcareercenter.us/index.php/my-account/");
		driver.get("https://www.a101.com.tr/?utm_campaign=yillik-kullan%C4%B1m_branding&utm_medium=cpc&utm_source=google&utm_content=search&utm_term=yillik&gclid=EAIaIQobChMIrbGIkdGI-gIVFJ3VCh1ArgvGEAAYASAAEgLZ4vD_BwE");
		Thread.sleep(4000);
		
		
		
		driver.close();
		
		
	}

}

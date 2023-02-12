package MyTestNG.POMWebPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

	WebDriver driver=null;
	public GooglePage(WebDriver drv) {
		// TODO Auto-generated constructor stub
		driver=drv;
	}
	 By searchbox=By.xpath("//*[@name='q']");
     //By SearchButton=By.xpath("//*[@name='q']//following::input[3]");
      By SearchButton=By.xpath("(//input[@value=\"Google Search\"])[1]");
      By GmailLink=By.xpath("//a[text()=\"Gmail\"]");
      By MarathiLang=By.xpath("//a[text()=\"मराठी\"]");
      By GoogleApps=By.xpath("//*[aria-label=\"Google apps\"]");
      By MeetApp=By.xpath("//*[text()=\"Meet\"]");
      
      public void Searchfunction(String str) {
		
         driver.findElement(searchbox).sendKeys(str);
         driver.findElement(SearchButton).click();
	}
      public void clickGmail() {
		
         driver.findElement(GmailLink).click();
	}
     public void clickMarathi() {
  		// TODO Auto-generated method stub
           driver.findElement(MarathiLang).click();
  	}
      public void opengApp(String APPName) {
		// TODO Auto-generated method stub
            driver.findElement(GoogleApps).click();
            if (APPName.equalsIgnoreCase("meet")) {
				driver.findElement(MeetApp).click();
			}
	}
}

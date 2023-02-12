package Four;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Oct18_AssertOnWebPage {
	WebDriver driver=null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  Assert.assertEquals(driver.getTitle().equals("Google"), true);
	  System.out.println("Assert is true only then we will continue");
  }
}

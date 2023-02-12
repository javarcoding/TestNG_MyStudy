package Third;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Oct17_DataProvider {
	WebDriver driver=null;
	@Test
	public void init1() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
  @Test(dataProvider = "dp", dependsOnMethods ="init1" )
  public void f(Integer n, String s) throws InterruptedException {
	  driver.get("https://www.google.com");
	  System.out.println("Test Case"+n+"Search Value"+s);
	  driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(s);
	  driver.findElement(By.xpath("//*[@name=\"q\"]")).submit();
	  Thread.sleep(3000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "Selenium" },
      new Object[] { 2, "ibm" },
    };
  }
}

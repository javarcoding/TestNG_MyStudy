package Five;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Oct19_CrossBrowser {
	WebDriver driver=null;
  @BeforeClass
  @Parameters("btype")
  public void bclass(String browser) {
	  if (browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	  if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.edge.driver", "C:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
  }
  
  @Test
  public void F()
  {
	  driver.get("https://www.google.com");
	  driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("selenium");
	  driver.findElement(By.xpath("//*[@name=\"q\"]")).submit();
	  
  }
}

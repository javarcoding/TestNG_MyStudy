package MyTestNG.POMScenario;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import MyTestNG.POMWebPages.GooglePage;
import MyTestNG.POMWebPages.MeetPage;

public class NewMett {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		GooglePage curr=new GooglePage(driver);
		curr.opengApp("meet");
		MeetPage meet=new MeetPage(driver);
		meet.createNewMeet();
	}

}
